package com.EmpSyst.service;

import java.util.List;

import com.EmpSyst.model.Employee;

public interface EmployeeService {

	List<Employee> getALLEmployee();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeebyId(long id);
	
	void deleteEmployeeById(long id);
	
}
