package com.pramit.home.learning.staticDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.pramit.home.learning.model.Employee;

@Configuration
public class EmployeeDB {

	public static List<Employee> getCompleteEmployeeData() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "Lokesh",32));
		employeesList.add(new Employee(2, "Akshit", 33));
		employeesList.add(new Employee(3, "Rajat", 34));
		employeesList.add(new Employee(4, "Rajan", 42));
		employeesList.add(new Employee(5, "Ganapati", 27));
		employeesList.add(new Employee(6, "Radhika", 25));
		employeesList.add(new Employee(7, "Akshita", 33));
		employeesList.add(new Employee(8, "Akshitansh",27));
		employeesList.add(new Employee(9, "Akshitashyu", 29));
		return employeesList;
	}

}
