package org.basket.model;

public class Club {
    private String website;
    private String[] keywords;
    private String fullName;
    private String address;
    private float lat;
    private float lon;

    public Club(String website, String[] keywords, String fullName, String address, float lat, float lon){
        this.website = website;
        this.keywords = keywords;
        this.fullName = fullName;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
    }


    public String getWebsite() {
        return website;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }
}



/*
{
        "website": "http://www.805elitevolleyball.com/",
        "lon": -120.630769735309,
        "doctype": "club",
        "keywords": [
        "805",
        "Elite"
        ],
        "full_name": "805 Elite",
        "address": "4855 Morabito Place, San Luis Obispo, CA",
        "lat": 35.23517885
        }

*/