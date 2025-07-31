package com.dbs.firstwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/users")
    public List<String> getUsers(){
        logger.info("getting users");
        return Arrays.asList("John","Jerry","Tom");
    }
}
