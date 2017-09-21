package com.iqmsoft.spring4.strus.payara.dao;

import java.util.List;

import com.iqmsoft.spring4.strus.payara.persistence.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySsn(String ssn);
	
	void updateEmployee(Employee employee);
}
