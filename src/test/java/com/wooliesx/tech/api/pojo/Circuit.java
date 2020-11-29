package com.wooliesx.tech.api.pojo;

public class Circuit {
    private String   CircuitName;
    private String   circuitId;
    private String   url;
    private Location Location;

    @Override
    public String toString() {
        return "ClassPojo [CircuitName = " + CircuitName + ", circuitId = " + circuitId + ", url = " + url
               + ", Location = " + Location + "]";
    }

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getCircuitName() {
        return CircuitName;
    }

    public void setCircuitName(String CircuitName) {
        this.CircuitName = CircuitName;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

