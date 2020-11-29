package com.wooliesx.tech.api.pojo;

public class RaceResponse {
    private MRData MRData;

    @Override
    public String toString() {
        return "ClassPojo [MRData = " + MRData + "]";
    }

    public MRData getMRData() {
        return MRData;
    }

    public void setMRData(MRData MRData) {
        this.MRData = MRData;
    }
}

