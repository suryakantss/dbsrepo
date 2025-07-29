package com.dbs.iocdidemo.services;

public class Shop {
 public static void main(String[] args) {

        EmailServerConfig config = new EmailServerConfig("192.168.2.3","VFGT55$");
        EmailService es = new EmailService(config);
        OrderService os = new OrderService(es);
        os.placeOrder();
    }
}
