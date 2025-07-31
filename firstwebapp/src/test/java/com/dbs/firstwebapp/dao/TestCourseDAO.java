package com.dbs.firstwebapp.dao;

import com.dbs.firstwebapp.model.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest(properties = {
        "spring.datasource.url=jdbc:h2:mem:testdb",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
public class TestCourseDAO {
    @Autowired
    private CourseDAO courseDAO;
    @Test
    public  void testfindAll(){
        courseDAO.save(new Course("C1","Java","3 days"));
        courseDAO.save(new Course("C2","HTML","2 days"));
        Assertions.assertEquals(2,courseDAO.findAll().size());
    }
    @Test
    public  void testfindById(){
        courseDAO.save(new Course("C3","Java","3 days"));
        Assertions.assertEquals("C3",courseDAO.findById("C3").get().getId());
    }
}
