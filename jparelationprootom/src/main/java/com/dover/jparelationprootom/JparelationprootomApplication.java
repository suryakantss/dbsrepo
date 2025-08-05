package com.dover.jparelationprootom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dover.jparelationprootom.dao.DepartmentDAO;
import com.dover.jparelationprootom.dao.EmployeeDAO;
import com.dover.jparelationprootom.domain.Department;

@SpringBootApplication
public class JparelationprootomApplication {

   
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private DepartmentDAO departmentDAO;

   

	public static void main(String[] args) {
		SpringApplication.run(JparelationprootomApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {

		return (args) -> {

			/*
			 * Department d = new Department(); d.setId("1"); d.setName("Sales");
			 * 
			 * Employee e1 = new Employee(); e1.setId("E1"); e1.setName("Jerry");
			 * e1.setSalary(100000); e1.setDepartment(d);
			 * 
			 * Employee e2 = new Employee(); e1.setId("E2"); e1.setName("Tom");
			 * e1.setSalary(200000); e1.setDepartment(d);
			 * 
			 * Employee res1 = employeeDAO.save(e1); Employee res2 = employeeDAO.save(e2);
			 * 
			 * System.out.println(res1.getId() + " Saved..");
			 * System.out.println(res2.getId() + " Saved..");
			 */

			//===================================
			
			/*
			List<Employee> emps = employeeDAO.findAll();
			for (Employee e : emps) {
				System.out.println(e.getName() + " , " + e.getDepartment().getName());
			}
			*/
			//===================================
			
			List<Department> departments = departmentDAO.findAll();
			for (Department d : departments) {
				System.out.println(d.getName());
				System.out.println(d.getEmployees());
				
			}

		};
	}

}
