package com.dbs.fileioproject.inoutstream;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String email;
    Customer(){

    }
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
