package com.dbs.firstwebapp.controller;

import com.dbs.firstwebapp.model.Course;
import com.dbs.firstwebapp.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TrainingController {
    @Autowired
    private TrainingService trainingService;
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getcourses(){
        return  ResponseEntity.status(HttpStatus.OK).body(trainingService.getCourses());

    }
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getcourses(@PathVariable String id){
        return  ResponseEntity.status(HttpStatus.OK).body(trainingService.getCourse(id));

    }
    @PostMapping("/courses")
    public ResponseEntity<Course> createcourse(@RequestBody  Course course){
        return  ResponseEntity.status(HttpStatus.CREATED).body(trainingService.addCourse(course));

    }
    @DeleteMapping("/courses/{id}")
    public ResponseEntity<Course> deletecourse(@PathVariable  String id){
        return  ResponseEntity.status(HttpStatus.OK).body(trainingService.delCourse(id));

    }
    @PutMapping("/courses/{id}")
    public ResponseEntity<Course> updatecourse(@PathVariable String id, @RequestBody  Course course){
        return  ResponseEntity.status(HttpStatus.CREATED).body(trainingService.updateCourse(id,course));
    }
}
