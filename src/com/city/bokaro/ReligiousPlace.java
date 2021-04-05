package com.city.bokaro;

public class ReligiousPlace {
    private String religion;
    private String name;

    public ReligiousPlace(String religion, String name) {
        this.religion = religion;
        this.name = name;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
