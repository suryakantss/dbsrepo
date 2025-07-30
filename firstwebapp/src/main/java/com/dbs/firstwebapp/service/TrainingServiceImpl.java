package com.dbs.firstwebapp.service;

import com.dbs.firstwebapp.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
private List<Course> courses = new ArrayList<>();

TrainingServiceImpl(){
   courses.add(new Course("C1","Java","5 days"));
   courses.add(new Course("C2","Spring Boot","3 days"));
}
    @Override
    public List<Course> getCourses() {
    return  courses;
    }

    @Override
    public Course getCourse(String id) {
    return  courses.stream().filter(c->c.getId().equals(id)).findFirst().get();
    }

    @Override
    public Course addCourse(Course c) {
        if(courses.add(c))
            return c;
        else
            return null;
    }

    @Override
    public Course delCourse(String id) {
      Course c = getCourse(id);
        for (Course course : courses) {
            if(course.equals(c)){
                courses.remove(c);
                return c;
            }
        }
        return  null;
    }
}

