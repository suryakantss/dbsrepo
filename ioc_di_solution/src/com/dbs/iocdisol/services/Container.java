package com.dbs.iocdisol.services;
public class Container {
    public static OrderService getService(String sn) {
        if (sn.equals("OS")) {
            EmailServerConfig config = new EmailServerConfig("192.168.2.3", "VFGT55$");
            EmailService es = new EmailService(config);
            OrderService os = new OrderService(es);
            return os;
        } else
            return null;
    }
}