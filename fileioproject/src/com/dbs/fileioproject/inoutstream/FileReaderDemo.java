package com.dbs.fileioproject.inoutstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

    public static void main(String[] args) {

        File f = new File("d:/dbstraining/java.txt");
        if(!f.exists())
        {
            System.out.println(f.getName() + "doesn't exists..");
            System.exit(1);
        }
        try {
            BufferedReader fr = new BufferedReader(new FileReader(f));
            String str;
            while ((str = fr.readLine()) != null)
            {
                System.out.println(str);
            }
            fr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
