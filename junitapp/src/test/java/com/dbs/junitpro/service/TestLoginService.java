package com.dbs.junitpro.service;

import com.dbs.junitapp.service.LoginService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLoginService {

    private LoginService ls;

    @BeforeEach
    public void setup(){
        System.out.println("Before Each...");
        ls = new LoginService();
    }
    @Test
    public  void testCheckvalid(){
        Assertions.assertTrue(ls.check("tom","123"));

    }
    @Test
    public  void testCheckInvalid(){
         Assertions.assertFalse(ls.check("tom","1234"));
        Assertions.assertFalse(ls.check("tommmm","1234"));

    }

    @AfterEach
    public void clean(){
        ls = null;
        System.out.println("cleaning....");
    }

}
