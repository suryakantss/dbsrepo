package com.dbs.firstwebapp.dao;

import com.dbs.firstwebapp.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDAO extends CrudRepository<Course,String> {
    @Override
    public List<Course> findAll();
}
