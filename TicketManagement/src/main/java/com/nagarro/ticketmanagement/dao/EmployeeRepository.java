package com.nagarro.ticketmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.ticketmanagement.model.Employee;

/**
 * comment repository handle all operation related to Employee database
 * 
 * @author nishantgarg
 *
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	/**
	 * It will find employee by its name and password
	 * 
	 * @param name
	 * @param password
	 * @return {@link Employee}
	 */
	public Employee findUserByNameAndPassword(String name, String password);
}
