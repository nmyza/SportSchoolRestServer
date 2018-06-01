package org.basket.model;

public class School {
    private String level;
    private String address;
    private String name;

    public School(String level, String address, String name) {
        this.level = level;
        this.address = address;
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
