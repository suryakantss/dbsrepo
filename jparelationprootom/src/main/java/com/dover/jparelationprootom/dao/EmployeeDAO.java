package com.dover.jparelationprootom.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dover.jparelationprootom.domain.Employee;

@Repository
public interface EmployeeDAO  extends CrudRepository<Employee, String>{

	public List<Employee> findAll();
	
}
