package com.oocl.ita.shuttlebusschedule.entity;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class Station {
    private String routeId;
    private String stationId;
    private String stationName;
    private String regularUserCount;
    private String realTimeUserCount;
    private String changedCount;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getRegularUserCount() {
        return regularUserCount;
    }

    public void setRegularUserCount(String regularUserCount) {
        this.regularUserCount = regularUserCount;
    }

    public String getRealTimeUserCount() {
        return realTimeUserCount;
    }

    public void setRealTimeUserCount(String realTimeUserCount) {
        this.realTimeUserCount = realTimeUserCount;
    }

    public String getChangedCount() {
        return changedCount;
    }

    public void setChangedCount(String changedCount) {
        this.changedCount = changedCount;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
}
