package com.wooliesx.tech.api.pojo;

public class RaceTable {
    private Race[] Race;

    @Override
    public String toString() {
        return "ClassPojo [Race = " + Race + "]";
    }

    public Race[] getRace() {
        return Race;
    }

    public void setRace(Race[] Race) {
        this.Race = Race;
    }
}


