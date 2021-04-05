package com.city.bokaro;

public class Quarter {
    private int quarterNumber;
    private String type;
    private String floor;

    public Quarter(int quarterNumber, String type, String floor) {
        this.quarterNumber = quarterNumber;
        this.type = type;
        this.floor = floor;
    }

    public int getQuarterNumber() {
        return quarterNumber;
    }

    public void setQuarterNumber(int quarterNumber) {
        this.quarterNumber = quarterNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
