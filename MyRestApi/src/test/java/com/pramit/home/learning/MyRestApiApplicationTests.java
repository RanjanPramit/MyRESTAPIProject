package com.pramit.home.learning;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pramit.home.learning.controller.EmployeeController;
import com.pramit.home.learning.model.Employee;

@SpringBootTest
public class MyRestApiApplicationTests {

	@Test
	public void myApiTest() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "Lokesh", "gupta", "howtodoinjava@gmail.com", 1000));
		employeesList.add(new Employee(2, "Akshit", "gupta", "howtodoinjava@gmail.com", 1000));
		employeesList.add(new Employee(3, "Rajat", "gupta", "howtodoinjava@gmail.com", 1500));
		employeesList.add(new Employee(4, "Rajan", "gupta", "howtodoinjava@gmail.com", 2500));
		employeesList.add(new Employee(5, "Ganapati", "gupta", "howtodoinjava@gmail.com", 1100));
		employeesList.add(new Employee(6, "Radhika", "gupta", "howtodoinjava@gmail.com", 700));
		employeesList.add(new Employee(7, "Akshita", "gupta", "howtodoinjava@gmail.com", 1000));
		employeesList.add(new Employee(8, "Akshitansh", "gupta", "howtodoinjava@gmail.com", 1000));
		employeesList.add(new Employee(9, "Akshitashyu", "gupta", "howtodoinjava@gmail.com", 1000));

		List<Employee> expectedList = new ArrayList<Employee>();
		expectedList.add(new Employee(1, "Lokesh", "gupta", "howtodoinjava@gmail.com", 1000));
		expectedList.add(new Employee(2, "Akshit", "gupta", "howtodoinjava@gmail.com", 1000));
		expectedList.add(new Employee(7, "Akshita", "gupta", "howtodoinjava@gmail.com", 1000));
		expectedList.add(new Employee(8, "Akshitansh", "gupta", "howtodoinjava@gmail.com", 1000));
		expectedList.add(new Employee(9, "Akshitashyu", "gupta", "howtodoinjava@gmail.com", 1000));

		EmployeeController empController = new EmployeeController();

		List<Employee> actualList = empController.getMyEmployeesBasedOnSalary();
		
		
		assertTrue(actualList.size()==expectedList.size());

	}

}
