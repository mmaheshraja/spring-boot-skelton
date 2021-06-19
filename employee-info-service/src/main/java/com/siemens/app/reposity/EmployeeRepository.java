package com.siemens.app.reposity;

import org.springframework.data.repository.CrudRepository;

import com.siemens.app.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
