package com.nagarro.ticketmanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Ticket POJO
 * 
 * @author nishantgarg
 *
 */
@Entity
public class Ticket {

	@OneToOne(cascade = CascadeType.ALL)
	private AssignedTicket assignedTicket;

	@OneToMany(targetEntity = Comment.class, mappedBy = "ticketId", cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();

	@ManyToOne(optional = false)
	@JoinColumn(name = "Employee.id")
	private Employee employee;

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String message;

	private String priority;

	private String title;

	private String filePath;

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	private String type;

	/**
	 * 
	 */
	public Ticket() {
	}

	/**
	 * @param id
	 * @param comments
	 * @param employee
	 * @param assignedTicket
	 * @param message
	 * @param priority
	 * @param title
	 * @param type
	 */
	public Ticket(int id, List<Comment> comments, Employee employee, AssignedTicket assignedTicket, String message,
			String priority, String title, String type) {
		this.id = id;
		this.comments = comments;
		this.employee = employee;
		this.assignedTicket = assignedTicket;
		this.message = message;
		this.priority = priority;
		this.title = title;
		this.type = type;
	}

	/**
	 * @param id
	 * @param type
	 * @param priority
	 * @param title
	 * @param message
	 * @param employee
	 * @param comments
	 */
	public Ticket(int id, String type, String priority, String title, String message, Employee employee,
			List<Comment> comments) {
		this.id = id;
		this.type = type;
		this.priority = priority;
		this.title = title;
		this.message = message;
		this.employee = employee;
		this.comments = comments;
	}

	/**
	 * @param message
	 * @param priority
	 * @param title
	 * @param type
	 */
	public Ticket(String message, String priority, String title, String type) {
		this.message = message;
		this.priority = priority;
		this.title = title;
		this.type = type;
	}

	/**
	 * @return the assignedTicket
	 */
	public AssignedTicket getAssignedTicket() {
		return assignedTicket;
	}

	/**
	 * @return the comments
	 */

	public List<Comment> getComments() {
		return comments;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param assignedTicket
	 *            the assignedTicket to set
	 */
	public void setAssignedTicket(AssignedTicket assignedTicket) {
		this.assignedTicket = assignedTicket;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
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
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
