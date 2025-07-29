package com.dbs.stertypespringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private EmailServerConfig config;

    public EmailService(EmailServerConfig config) {

        this.config = config;
    }
    public void sendEmail(){

        System.out.println("Mail Sent....using " + config );
    }
}


