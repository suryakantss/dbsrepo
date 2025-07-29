package com.dbs.junitpro.service;

import com.dbs.junitapp.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLoginService {

    @Test
    public  void testCheck(){
        LoginService ls = new LoginService();
        Assertions.assertTrue(ls.check("tom","123"));
        Assertions.assertFalse(ls.check("tom","1234"));
        Assertions.assertFalse(ls.check("tommmm","1234"));


    }
}
