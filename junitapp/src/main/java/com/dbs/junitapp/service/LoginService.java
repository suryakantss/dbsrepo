package com.dbs.junitapp.service;

public class LoginService {
    public boolean check(String login,String password){
        if(login.equals("tom") && password.equals("123"))
            return true;
        else
            return false;
    }
}
