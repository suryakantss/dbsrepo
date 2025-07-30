package com.dbs.firstwebapp.service;

import com.dbs.firstwebapp.dao.CourseDAO;
import com.dbs.firstwebapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Autowired
    private CourseDAO courseDAO;

    @Override
    public List<Course> getCourses() {
    return  courseDAO.findAll();
    }

    @Override
    public Course getCourse(String id) {
    return  courseDAO.findById(id).get();
    }

    @Override
    public Course addCourse(Course c) {
      return courseDAO.save(c);
    }

    @Override
    public Course delCourse(String id) {
        Course c = courseDAO.findById(id).get();
        courseDAO.delete(c);
        return  c;
    }

    @Override
    public Course updateCourse(String id, Course course) {
       Course c = courseDAO.findById(id).get();
       c.setName(course.getName());
        c.setDuration(course.getDuration());
        return courseDAO.save(c);
    }
}

