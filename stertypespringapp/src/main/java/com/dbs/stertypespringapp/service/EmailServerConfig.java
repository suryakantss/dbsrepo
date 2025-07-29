package com.dbs.stertypespringapp.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class EmailServerConfig {
    private String serverid;
    private String authtoken;
   EmailServerConfig(){
       serverid="192.168.12.3";
       authtoken="12345&&YHYU";
   }

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
