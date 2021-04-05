package com.city.bokaro;

import java.util.Set;

public class City {
    private String name;
    private String district;
    private int area;
    private Set<Sector> sectors;

    public City(String name, String district, int area, Set<Sector> sectors) {
        this.name = name;
        this.district = district;
        this.area = area;
        this.sectors = sectors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Set<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(Set<Sector> sectors) {
        this.sectors = sectors;
    }
}
