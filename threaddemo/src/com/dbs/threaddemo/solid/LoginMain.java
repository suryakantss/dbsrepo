package com.dbs.threaddemo.solid;

public class LoginMain {

    public static void main(String[] args) {

      //  LoginService ls = new LoginService();
      //  System.out.println(ls.doLogin("John","ABC"));
    LoginServiceM ls = new LoginServiceM();
    ls.LoginOTP("23232323");

    }
}
