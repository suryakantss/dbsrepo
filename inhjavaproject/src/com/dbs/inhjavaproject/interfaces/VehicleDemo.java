package com.dbs.inhjavaproject.interfaces;
interface Door {
    public void openDoor();
    public void closeDoor();

}
 interface Vehicle {
    public void start();
    public void stop();
 }

class Car implements  Vehicle, Door {
    @Override
    public void start() {

    }

    @Override
    public void stop() {
    }

    @Override
    public void openDoor() {

    }

    @Override
    public void closeDoor() {

    }
}

class Bike implements  Vehicle {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}


public class VehicleDemo {
    public static void main(String[] args) {




    }
}