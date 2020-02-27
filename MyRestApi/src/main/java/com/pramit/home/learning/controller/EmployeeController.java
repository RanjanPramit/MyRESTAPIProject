package com.pramit.home.learning.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramit.home.learning.model.Employee;
import com.pramit.home.learning.staticDB.EmployeeDB;

@RestController
public class EmployeeController {
	

	@RequestMapping("/getMyEmployees")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Employee> getEmployees() {
		return EmployeeDB.getCompleteEmployeeData();
	}

}