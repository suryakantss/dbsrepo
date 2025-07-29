package com.dbs.iocdisol.services;

public class EmailService {
    private EmailServerConfig config;

    public EmailService(EmailServerConfig config) {
        this.config = config;
    }
    public void sendEmail(){
        System.out.println("Mail Sent....using " + config );
    }
}


