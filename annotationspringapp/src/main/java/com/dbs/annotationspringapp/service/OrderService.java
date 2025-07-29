package com.dbs.annotationspringapp.service;

public class OrderService {
    private EmailService es;
    public OrderService(EmailService es) {
        this.es = es;
    }

    public  void placeOrder(){
        System.out.println("Order Placed...");
        es.sendEmail();
    }
}
