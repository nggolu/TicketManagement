package com.nagarro.ticketmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * POJO mapping two table i.e. ticket and employee
 * 
 * @author nishantgarg
 *
 */
@Entity
public class AssignedTicket {

	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String status;

	/**
	 * 
	 */
	public AssignedTicket() {
	}

	/**
	 * @param employee
	 */
	public AssignedTicket(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @param employee
	 * @param id
	 * @param status
	 */
	public AssignedTicket(Employee employee, int id, String status) {
		this.employee = employee;
		this.id = id;
		this.status = status;
	}

	/**
	 * @param id
	 * @param employee
	 */
	public AssignedTicket(int id, Employee employee) {
		this.id = id;
		this.employee = employee;
	}

	public AssignedTicket(Employee employee, String status) {
		// TODO Auto-generated constructor stub
		this.employee = employee;
		this.status = status;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
