package org.basket.model;

public class Pin {

    private String name;
    private int rating;
    private float lat;
    private float lon;

    public Pin(String name, int rating, float lat, float lon){
        this.name = name;
        this.rating = rating;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }
}
