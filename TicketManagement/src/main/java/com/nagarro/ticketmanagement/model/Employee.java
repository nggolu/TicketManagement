package com.nagarro.ticketmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Employee POJO to store data from form
 * 
 * @author nishantgarg
 *
 */
@Entity
public class Employee {

	private String email;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	private String password;

	@ManyToOne
	@JoinColumn(name = "User.id")
	private User user;

	/**
	 * 
	 */
	public Employee() {
	}

	/**
	 * @param id
	 * @param email
	 * @param name
	 * @param password
	 * @param user
	 */
	public Employee(int id, String email, String name, String password, User user) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.user = user;
	}

	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param user
	 */
	public Employee(int id, String name, String password, User user) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.user = user;
	}

	/**
	 * @param name
	 * @param password
	 */
	public Employee(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public String toString() {
		return this.name + " " + this.user.getUserType();
	}
}
