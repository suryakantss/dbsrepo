package com.dbs.junitpro.service;

import com.dbs.junitapp.service.GreetService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestGreetService {

    @BeforeAll
    public static void setup(){
        System.out.println("Before All...");
    }
    @Test
    public void tesgreet(){
        GreetService gs = new GreetService();
        assertEquals("Hello!!",gs.greet());
    }


    @AfterAll
    public static void clean(){
        System.out.println("After All...");
    }


}
