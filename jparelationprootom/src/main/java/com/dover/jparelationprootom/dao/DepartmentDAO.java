package com.dover.jparelationprootom.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dover.jparelationprootom.domain.Department;

@Repository
public interface DepartmentDAO extends CrudRepository<Department, String> {

	List<Department> findAll();
}
