package com.spring.dyndb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dyndb.dao.EmployeeDao;
import com.spring.dyndb.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public Employee addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}
}