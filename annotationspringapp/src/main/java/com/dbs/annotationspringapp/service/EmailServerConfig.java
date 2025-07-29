package com.dbs.annotationspringapp.service;

public class EmailServerConfig {
    private String serverid;
    private String authtoken;


    public String getAuthtoken() {
        return authtoken;
    }

    public void setAuthtoken(String authtoken) {
        this.authtoken = authtoken;
    }

    public String getServerid() {
        return serverid;
    }

    public void setServerid(String serverid) {
        this.serverid = serverid;
    }

    @Override
    public String toString() {
        return "EmailServerConfig{" +
                "serverid='" + serverid + '\'' +
                ", authtoken='" + authtoken + '\'' +
                '}';
    }
}
