package com.oocl.ita.shuttlebusschedule.entity;

/**
 * Created by CHENED2 on 1/7/2016.
 */
public class User {



    private String username;
    private String dept;
    private String pwd;
    private String boardingPoint;
    private String egressPoint;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getEgressPoint() {
        return egressPoint;
    }

    public void setEgressPoint(String egressPoint) {
        this.egressPoint = egressPoint;
    }

}
