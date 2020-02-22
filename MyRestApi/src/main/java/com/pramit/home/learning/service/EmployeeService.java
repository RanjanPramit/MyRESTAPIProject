package com.pramit.home.learning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.jvnet.hk2.annotations.Service;

import com.pramit.home.learning.model.Employee;
import com.pramit.home.learning.staticDB.EmployeeDB;

@Service
public class EmployeeService {

	public List<Employee> getEmployeeBasedOnSalary(){
		return EmployeeDB.getCompleteEmployeeData().stream().filter(t->t.getSalary()==1000).collect(Collectors 
                .toCollection(ArrayList::new)); 
	}

}
