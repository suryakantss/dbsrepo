package com.dbs.threaddemo;
class Printer implements  Runnable {
    @Override
    public void run() {
        for (int i =0;i<200;i++)
            System.out.println("printing...");
    }
}
class SpellCheck implements  Runnable {
    @Override
    public void run() {
        for (int i =0;i<200;i++)
            System.out.println("spell check...");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Thread pthread = new Thread(new Printer());
        pthread.start();
        Thread sthread = new Thread(new SpellCheck());
        sthread.start();


    }
}
