package com.dbs.firstjavaproject;

public class Car {
    //data members
    String make;
    String fuel;
    String model;

    //method members

    void start() {
        String make="VW";
        System.out.println( this.make + " : Car starting..");
    }
    void stop() {
        System.out.println( make + " : Car stopping..");
    }


}
