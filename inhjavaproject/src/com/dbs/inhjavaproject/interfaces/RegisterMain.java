package com.dbs.inhjavaproject.interfaces;

public class RegisterMain {

    public static void main(String[] args) {

        RegistrationServiceImpl rs = new RegistrationServiceImpl();
        rs.register();
        rs.resetPassword();
    }
}
