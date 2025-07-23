package com.dbs.threaddemo.solid;

public class LoginService {
    public boolean doLogin(String login, String password){
        return login.equals("John") && password.equals("123");

    }
}
