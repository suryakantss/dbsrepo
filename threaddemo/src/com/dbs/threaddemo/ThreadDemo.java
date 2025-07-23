package com.dbs.threaddemo;

class EWorker extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
             if(i%2==0) {
                 System.out.println("Even :" + i);
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }

        }
    }
}
class OWorker extends  Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==1) {
                System.out.println("ODD : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("==========================");
        EWorker ew = new EWorker();
        ew.setPriority(9);
        ew.start();
        OWorker ow = new OWorker();
        ow.start();
        System.out.println("==========================");


    }
}
