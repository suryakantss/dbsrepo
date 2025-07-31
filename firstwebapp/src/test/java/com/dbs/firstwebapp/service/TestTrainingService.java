package com.dbs.firstwebapp.service;

import com.dbs.firstwebapp.dao.CourseDAO;
import com.dbs.firstwebapp.model.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Optional;


@SpringBootTest
public class TestTrainingService {

    @Autowired
    private TrainingService trainingService;
    @MockitoBean
    private CourseDAO courseDAO;

    @BeforeEach
    public void init()
    {
        Course course = new Course("C1","Java","3 days");
        when(courseDAO.findById("C1")).thenReturn(Optional.of(course));
    }

    @Test
    public void testgetCourses(){
        Assertions.assertEquals("C1",trainingService.getCourse("C1").getId());
        verify(courseDAO,times(1)).findById(anyString());
    }
}
