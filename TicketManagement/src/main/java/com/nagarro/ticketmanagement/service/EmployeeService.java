package com.nagarro.ticketmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dao.EmployeeRepository;
import com.nagarro.ticketmanagement.model.Employee;

/**
 * Handles all the business logic related to employee
 * 
 * @author nishantgarg
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * it will find user according to name and password
	 * 
	 * @param employee
	 * @return
	 */
	public Employee findUserByNameAndPassword(Employee employee) {
		return employeeRepository.findUserByNameAndPassword(employee.getName(), employee.getPassword());
	}
}
