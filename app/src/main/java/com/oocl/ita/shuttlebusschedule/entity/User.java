package com.oocl.ita.shuttlebusschedule.entity;

/**
 * Created by CHENED2 on 1/7/2016.
 */
public class User {

    private long id;
    private String username;
    private String pwd;
    private String dept;
    private String boardingStation;
    private String egressStation;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBoardingStation() {
        return boardingStation;
    }

    public void setBoardingStation(String boardingStation) {
        this.boardingStation = boardingStation;
    }

    public String getEgressStation() {
        return egressStation;
    }

    public void setEgressStation(String egressStation) {
        this.egressStation = egressStation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
