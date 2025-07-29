package com.dbs.stertypespringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private EmailService es;
    public OrderService(EmailService es) {
        this.es = es;
    }

    public  void placeOrder(){
        System.out.println("Order Placed...");
        es.sendEmail();
    }
}
