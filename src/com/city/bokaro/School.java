package com.city.bokaro;

public class School {
    private boolean isGovernmentSchool;
    private String name;

    public School(boolean isGovernmentSchool, String name) {
        this.isGovernmentSchool = isGovernmentSchool;
        this.name = name;
    }

    public boolean isGovernmentSchool() {
        return isGovernmentSchool;
    }

    public void setGovernmentSchool(boolean governmentSchool) {
        isGovernmentSchool = governmentSchool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
