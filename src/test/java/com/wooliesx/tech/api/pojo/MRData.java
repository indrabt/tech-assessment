package com.wooliesx.tech.api.pojo;

public class MRData {
    private RaceTable RaceTable;
    private String    xmlns;
    private String    total;
    private String    offset;
    private String    series;
    private String    limit;
    private String    url;

    @Override
    public String toString() {
        return "ClassPojo [RaceTable = " + RaceTable + ", xmlns = " + xmlns + ", total = " + total + ", offset = "
               + offset + ", series = " + series + ", limit = " + limit + ", url = " + url + "]";
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public RaceTable getRaceTable() {
        return RaceTable;
    }

    public void setRaceTable(RaceTable RaceTable) {
        this.RaceTable = RaceTable;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}


