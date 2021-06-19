package com.siemens.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.siemens.app.models.Employee;
import com.siemens.app.reposity.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> result = new ArrayList<Employee>();
		repository.findAll().forEach(result::add);
		return result;
	}
	
	public Employee getAsset(Long id){		
		return repository.findById(id).get();
		
	}
	
	public Employee addEmployee(Employee emp){		
		return repository.save(emp);
		
	}
	
	public Employee updateEmployee(Employee emp){		
		return repository.save(emp);
		
	}
	public void deleteEmployee(Long id){		
		 repository.deleteById(id);
		
	}
}
