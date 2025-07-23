package com.dbs.inhjavaproject.interfaces;

public class RegistrationServiceImpl implements IRegistrationService {
    @Override
    public void register() {
        System.out.println("Registered....");
    }
    @Override
    public void resetPassword() {
        System.out.println("Password Reset done...");

    }
}
