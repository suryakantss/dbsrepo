package com.dbs.fileioproject.filedemo;

import java.io.File;

public class DirDemo {
    public static void main(String[] args) {

       // File f = new File("d:/dbstraining");
        File f = new File("c:/windows");

//        if(f.isDirectory()){
//            String[] arr = f.list();
//            for (String fname : arr) {
//                System.out.println(fname);
//            }
//        }

        if(f.isDirectory()){
            File[] files = f.listFiles();
            for (File file  : files) {
                System.out.println(file.getAbsolutePath());
            }
        }




    }
}
