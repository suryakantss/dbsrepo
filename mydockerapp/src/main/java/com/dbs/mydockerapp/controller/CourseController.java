package com.dbs.mydockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<String> getData(){
        return Arrays.asList("Java","React","SpringBoot");

    }
}
