package com.siemens.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.app.models.Employee;
import com.siemens.app.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){		
		return service.getAllEmployees();
	}
	
	@RequestMapping("/employees/{empId}")
	public Employee getAsset(@PathVariable("empId") Long id){		
		return service.getAsset(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value= "/employees")
	public Employee addAsset(@RequestBody Employee emp){	
		return service.addEmployee(emp);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value= "/employees")
	public Employee updateAsset(@RequestBody Employee emp){		
		return service.updateEmployee(emp);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value= "/employees/{empId}")
	public void deleteEmployee(@PathVariable("empId") Long id){		
		service.deleteEmployee(id);
		
	}
}
