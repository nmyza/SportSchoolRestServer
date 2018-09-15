package org.basket.model;

public class Result {
    private int regionalPlace;

    private String L1_division;
    private String L2_division;
    private String L3_division;
    private String regionalDivision;

    private int L1_points;
    private int L2_points;
    private int L3_points;
    private int regionalPoints;

    private int L1_place;
    private int L2_place;
    private int L3_place;
    private int qualifierPlace;
    private int finalPlace;

    private Club club;
    private int total_teams;
    private int final_score;
    private int age;


    public Result(int regionalPlace, String L1_division, String L2_division, String L3_division,
                  String regionalDivision, int L1_points, int L2_points, int L3_points, int regionalPoints,
                  int L1_place, int L2_place, int L3_place, int qualifierPlace, int finalPlace,
                  Club club, int total_teams, int final_score, int age) {

        this.regionalPlace = regionalPlace;
        this.L1_division = L1_division;
        this.L2_division = L2_division;
        this.L3_division = L3_division;
        this.regionalDivision = regionalDivision;
        this.L1_points = L1_points;
        this.L2_points = L2_points;
        this.L3_points = L3_points;
        this.regionalPoints = regionalPoints;
        this.L1_place = L1_place;
        this.L2_place = L2_place;
        this.L3_place = L3_place;
        this.qualifierPlace = qualifierPlace;
        this.finalPlace = finalPlace;
        this.club = club;
        this.total_teams = total_teams;
        this.final_score = final_score;
        this.age = age;
    }


    public int getRegionalPlace() {
        return regionalPlace;
    }

    public String getL1_division() {
        return L1_division;
    }

    public String getL2_division() {
        return L2_division;
    }

    public String getL3_division() {
        return L3_division;
    }

    public String getRegionalDivision() {
        return regionalDivision;
    }

    public int getL1_points() {
        return L1_points;
    }

    public int getL2_points() {
        return L2_points;
    }

    public int getL3_points() {
        return L3_points;
    }

    public int getRegionalPoints() {
        return regionalPoints;
    }

    public int getL1_place() {
        return L1_place;
    }

    public int getL2_place() {
        return L2_place;
    }

    public int getL3_place() {
        return L3_place;
    }

    public int getQualifierPlace() {
        return qualifierPlace;
    }

    public int getFinalPlace() {
        return finalPlace;
    }

    public Club getClub() {
        return club;
    }

    public int getTotal_teams() {
        return total_teams;
    }

    public int getFinal_score() {
        return final_score;
    }

    public int getAge() {
        return age;
    }
}


/*

{
  "regional_place": "37",
  "L1_division": "Gold",
  "L2_division": "Gold",
  "club": "club_absolute",
  "L3_points": "550",
  "final_score": "2065.00",
  "doctype": "result",
  "regional_division": "Aqua",
  "final_place": "25",
  "L3_division": "Silver",
  "L3_place": "24",
  "L2_points": "432",
  "total_teams": 40,
  "year": "2018",
  "regional_points": "783",
  "L1_place": "1",
  "team_name": "Absolute Volleyball",
  "age": "18",
  "L1_points": "300",
  "L2_place": "12",
  "qualifier_place": "1"
}


* */