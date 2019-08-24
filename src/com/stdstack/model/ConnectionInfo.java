package com.stdstack.model;

public class ConnectionInfo {

    private Integer sessionID;
    private String ip;
    private Long connectionTime;

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Long connectionTime) {
        this.connectionTime = connectionTime;
    }

    public ConnectionInfo() {
    }

    public ConnectionInfo(Integer sessionID, String ip, Long connectionTime) {
        this.sessionID = sessionID;
        this.ip = ip;
        this.connectionTime = connectionTime;
    }

    @Override
    public String toString() {
        return sessionID + " " + connectionTime + " " + ip;
    }
}
