package com.dbs.firstjavaproject;

public class CarMain {
    public static void main(String[] args) {
        Car car1 =  new Car();
        car1.make = "BMW";
        car1.start();

        Car car2 =  new Car();
        car2.make = "Audi";
        car2.start();

     //   Car car3 = car1 ;
       Car  car3  = new Car();
        car3.make="KIA";
        car3.start();// Guess the output

        car1.start();//Guess the output
        car1.stop();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // car1 = null;
       // System.gc();






    }
}
