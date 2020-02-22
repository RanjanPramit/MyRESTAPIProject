package com.pramit.home.learning.staticDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.pramit.home.learning.model.Employee;

@Configuration
public class EmployeeDB {

	public static List<Employee> getCompleteEmployeeData() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "Lokesh", "gupta", "howtodoinjava@gmail.com",1000));
		employeesList.add(new Employee(2, "Akshit", "gupta", "howtodoinjava@gmail.com",1000));
		employeesList.add(new Employee(3, "Rajat", "gupta", "howtodoinjava@gmail.com",1500));
		employeesList.add(new Employee(4, "Rajan", "gupta", "howtodoinjava@gmail.com",2500));
		employeesList.add(new Employee(5, "Ganapati", "gupta", "howtodoinjava@gmail.com",1100));
		employeesList.add(new Employee(6, "Radhika", "gupta", "howtodoinjava@gmail.com",700));
		employeesList.add(new Employee(7, "Akshita", "gupta", "howtodoinjava@gmail.com",1000));
		employeesList.add(new Employee(8, "Akshitansh", "gupta", "howtodoinjava@gmail.com",1000));
		employeesList.add(new Employee(9, "Akshitashyu", "gupta", "howtodoinjava@gmail.com",1000));
		return employeesList;
	}

}
