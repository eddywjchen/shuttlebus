package com.oocl.ita.shuttlebusschedule.entity;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class Station {
    private int routeId;
    private String routeName;
    private int stationId;
    private String stationName;
    private int regularUserCount;
    private int realTimeUserCount;
    private int changedCount;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getRegularUserCount() {
        return regularUserCount;
    }

    public void setRegularUserCount(int regularUserCount) {
        this.regularUserCount = regularUserCount;
    }

    public int getRealTimeUserCount() {
        return realTimeUserCount;
    }

    public void setRealTimeUserCount(int realTimeUserCount) {
        this.realTimeUserCount = realTimeUserCount;
    }

    public int getChangedCount() {
        return changedCount;
    }

    public void setChangedCount(int changedCount) {
        this.changedCount = changedCount;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}
