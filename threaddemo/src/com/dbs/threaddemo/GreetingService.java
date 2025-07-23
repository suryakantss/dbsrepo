package com.dbs.threaddemo;
import java.util.Scanner;
public class GreetingService extends  Thread {
    @Override
    public void run() {
        System.out.println("My Name : " + Thread.currentThread().getName());
        System.out.println("Your name ? : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
    }
}
