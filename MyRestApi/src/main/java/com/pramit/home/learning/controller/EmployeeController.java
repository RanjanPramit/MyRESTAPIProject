package com.pramit.home.learning.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramit.home.learning.model.Employee;
import com.pramit.home.learning.staticDB.EmployeeDB;

@RestController
public class EmployeeController {
	

	@RequestMapping("/getMyEmployees")
	public List<Employee> getEmployees() {
		return EmployeeDB.getCompleteEmployeeData();
	}

	@RequestMapping("/getMyEmployeesBasedOnSalary")
	public List<Employee> getMyEmployeesBasedOnSalary() {
		return EmployeeDB.getCompleteEmployeeData().stream().filter(t->t.getSalary()==1000).collect(Collectors 
                .toCollection(ArrayList::new)); 
	}

}