package com.nagarro.ticketmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * POJO of comment to store data replated to comment
 * 
 * @author nishantgarg
 *
 */
@Entity
public class Comment {

	private Date date = new Date();

	@ManyToOne
	@JoinColumn(name = "Employee.id")
	private Employee employee;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String text;

	private int ticketId;

	/**
	 * 
	 */
	public Comment() {
	}

	/**
	 * @param date
	 * @param employee
	 * @param id
	 * @param text
	 */
	public Comment(Date date, Employee employee, int id, String text) {
		this.date = date;
		this.employee = employee;
		this.id = id;
		this.text = text;
	}

	/**
	 * @param date
	 * @param employee
	 * @param id
	 * @param text
	 * @param ticketId
	 */
	public Comment(Date date, Employee employee, int id, String text, int ticketId) {
		this.date = date;
		this.employee = employee;
		this.id = id;
		this.text = text;
		this.ticketId = ticketId;
	}

	/**
	 * @param employee
	 * @param text
	 * @param ticket
	 */
	public Comment(Employee employee, String text) {
		this.employee = employee;
		this.text = text;

	}

	/**
	 * @param id
	 * @param text
	 * @param date
	 */
	public Comment(int id, String text, Date date) {
		this.id = id;
		this.text = text;
		this.date = date;
	}

	/**
	 * @param text
	 */
	public Comment(String text) {
		this.text = text;
		this.date = new Date();
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @param ticketId
	 *            the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

}
