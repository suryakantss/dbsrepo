package com.dbs.firstjavaproject;

public class ArrDemo {

    public static void main(String[] args) {
        //array
//        int[] x = new int[4];
//        x[0]=100;
//        x[1]=200;
//        x[2]=300;

        int[] x = {10,20,30,40};


        for (int i=0; i < x.length;i++)
            System.out.println(x[i]);

        for(int j : x){
            System.out.println(j);
        }

    }
}
