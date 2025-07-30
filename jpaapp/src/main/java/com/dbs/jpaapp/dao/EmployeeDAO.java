package com.dbs.jpaapp.dao;

import com.dbs.jpaapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee,String> {
    @Override
    public List<Employee> findAll();
    public  Employee findByName(String name);
}
