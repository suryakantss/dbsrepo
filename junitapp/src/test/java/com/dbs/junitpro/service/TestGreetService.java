package com.dbs.junitpro.service;

import com.dbs.junitapp.service.GreetService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestGreetService {
    @Test
    public void tesgreet(){
        GreetService gs = new GreetService();
        assertEquals("Hello!!",gs.greet());
    }
}
