package com.wooliesx.tech.api.pojo;

public class Race {
    private String  round;
    private String  season;
    private Circuit Circuit;
    private String  RaceName;
    private String  url;
    private String  Date;

    @Override
    public String toString() {
        return "ClassPojo [round = " + round + ", season = " + season + ", Circuit = " + Circuit + ", RaceName = "
               + RaceName + ", url = " + url + ", Date = " + Date + "]";
    }

    public Circuit getCircuit() {
        return Circuit;
    }

    public void setCircuit(Circuit Circuit) {
        this.Circuit = Circuit;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getRaceName() {
        return RaceName;
    }

    public void setRaceName(String RaceName) {
        this.RaceName = RaceName;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


