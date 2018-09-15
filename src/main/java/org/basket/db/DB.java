package org.basket.db;

import org.basket.model.*;

import java.util.ArrayList;

public class DB {
    private static final DB instance = new DB();
    private static int CURRENT_YEAR = 2018; // will be environment variable or config file or something

    private static String QUERY_GET_CLUBS_BY_REGION =
            "SELECT * FROM <region> WHERE doctype = 'club'";
    private static String QUERY_GET_RESULTS_BY_CLUB =
            "SELECT * FROM <region> WHERE doctype = 'result' AND 'club' = %1 AND 'year' = %2";

    private static String QUERY_GET_CLUB_RATING =
            "SELECT SUM((w.place/w.total_teams)*100) FROM " +
            "(SELECT MIN(final_place) as place, total_teams FROM <region> WHERE doctype='result' " +
                    "ANM year = %1 and club = %2 " +
            "GROUP BY age, total_teams) as w";

    private DB(){}

    public static DB getInstance(){
        return instance;
    }

    public Pin[] getPinsByRegion(String region){
        Club[] clubs = getClubsByRegion(region);
        ArrayList<Pin> pinsList = new ArrayList<>();
        for (Club club: clubs){
            Result[] results = getResultsByClubAndRegion(region, club);
            int rating = calculateClubRating(results);
            pinsList.add(new Pin(club.getFullName(), rating, club.getLat(), club.getLon()));
        }
        return (Pin[]) pinsList.toArray();
    }

    private Club[] getClubsByRegion(String region){
        return null;
    }

    private Result[] getResultsByClubAndRegion(String region, Club club) {
        return null;
    }

    private int calculateClubRating(Result[] results) {
        return 0;
    }

}
