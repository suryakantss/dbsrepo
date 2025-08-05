package com.dover.jparelationpromtom.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dover.jparelationpromtom.domain.Student;

@Repository
public interface StudentDAO  extends CrudRepository<Student, String>{


}
