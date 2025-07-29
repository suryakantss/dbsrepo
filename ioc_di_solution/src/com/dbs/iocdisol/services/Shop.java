package com.dbs.iocdisol.services;

public class Shop {
 public static void main(String[] args) {
     OrderService os =  Container.getService("OS");
     os.placeOrder();
    }
}
