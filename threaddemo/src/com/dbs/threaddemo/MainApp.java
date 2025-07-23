package com.dbs.threaddemo;

public class MainApp {

    public static void main(String[] args) {

        //1.
        System.out.println("My Name : " + Thread.currentThread().getName());

        //2.
            GreetingService gs = new GreetingService();
            gs.start();

            //3.

            Worker worker = new Worker();
            worker.start();


        System.out.println("Bye!!!");

    }
}
