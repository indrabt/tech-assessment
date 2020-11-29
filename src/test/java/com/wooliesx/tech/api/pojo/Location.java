package com.wooliesx.tech.api.pojo;

public class Location {
    private String Locality;
    private String Country;
    private String lat;
    private String longitude;

    @Override
    public String toString() {
        return "ClassPojo [Locality = " + Locality + ", Country = " + Country + ", lat = " + lat + ", long = "
               + longitude + "]";
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String Locality) {
        this.Locality = Locality;
    }

    public String getLong() {
        return longitude;
    }

    public void setLong(String longitude) {
        this.longitude = longitude;
    }
}


