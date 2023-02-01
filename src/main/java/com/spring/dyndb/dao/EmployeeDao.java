package com.spring.dyndb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.spring.dyndb.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	AmazonDynamoDB client;

	public List<Employee> getAllEmployees() {
		return null;
	}

	public Employee addEmployee(Employee emp) {
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		mapper.save(emp);
		return emp;
	}

}
