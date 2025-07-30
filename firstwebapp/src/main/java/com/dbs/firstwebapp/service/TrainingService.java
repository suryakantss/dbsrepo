package com.dbs.firstwebapp.service;

import com.dbs.firstwebapp.model.Course;

import java.util.List;

public interface TrainingService {
    public List<Course> getCourses();
    public Course getCourse(String id);
    public Course addCourse(Course c);
    public Course delCourse(String id);
    public Course updateCourse(String id,Course course);
}
