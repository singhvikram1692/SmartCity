package com.city.bokaro;

import java.util.Set;

public class Block {
    private Set<Quarter> quarters;

    public Block(Set<Quarter> quarters) {
        this.quarters = quarters;
    }

    public Set<Quarter> getQuarters() {
        return quarters;
    }

    public void setQuarters(Set<Quarter> quarters) {
        this.quarters = quarters;
    }
}
