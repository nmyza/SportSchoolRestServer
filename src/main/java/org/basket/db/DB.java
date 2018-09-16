package org.basket.db;

import org.basket.model.*;

import java.io.IOException;
import java.util.ArrayList;
import com.couchbase.client.java.*;
import com.couchbase.client.java.document.*;
import com.couchbase.client.java.document.json.*;
import com.couchbase.client.java.query.*;
import org.codehaus.jackson.map.ObjectMapper;


public class DB {
    private static final DB instance = new DB();

    // will be environment variable or config file or something:
    private static String RATING_YEAR = "2018";
    private static String SERVER = "192.168.1.15";
    private static String USR = "Administrator";
    private static String PWD = "password";

    private Cluster cluster;
    private Bucket bucket;
    private ObjectMapper jacksonMapper = new ObjectMapper();

    private static String QUERY_GET_PINS =
            "SELECT ROUND(AVG(100 - TONUMBER(w.place)/w.total_teams*100)) AS rating , w.full_name, w.lat, w.lon  " +
            "FROM (SELECT MIN(b1.final_place) as place, b1.total_teams, b1.club, b2.full_name, b2.lat, b2.lon  " +
            "FROM <region> b1 INNER JOIN <region> b2 ON KEYS b1.club WHERE b1.doctype='result' AND b1.year=%1 " +
            "AND (b2.active = true OR b2.active IS MISSING) " +
            "GROUP BY b1.age, b1.total_teams, b1.club, b2.full_name, b2.lat, b2.lon) AS w " +
            "GROUP BY w.full_name, w.lat, w.lon";


    private DB(){
        cluster = CouchbaseCluster.create(SERVER);
        cluster.authenticate(USR, PWD);
    }

    public static DB getInstance(){
        return instance;
    }

    public Pin[] getPinsByRegion(String region){
        bucket = cluster.openBucket(region);
        N1qlQueryResult queryResult = bucket.query(N1qlQuery.parameterized(
                QUERY_GET_PINS.replace("<region>", region), JsonArray.from(RATING_YEAR)));

        ArrayList<Pin> pinsList = new ArrayList<>();

        for (N1qlQueryRow row : queryResult) {
            String rowJsonString = row.value().toString();
            try {
                pinsList.add(jacksonMapper.readValue(rowJsonString, Pin.class));
            } catch (IOException ioex) {
                continue;
            }
        }
        bucket.close();
        return (Pin[]) pinsList.toArray();
    }




}
