package com.nagarro.ticketmanagement.model;

/**
 * Filter POFO is for talking all filters and perform filter operation
 * 
 * @author nishantgarg
 *
 */
public class Filter {

	private String employeeName;
	private String priority;
	private String status;
	private String type;

	/**
	 * 
	 */
	public Filter() {
	}

	/**
	 * @param employeeNmae
	 * @param status
	 * @param type
	 * @param priority
	 */
	public Filter(String status, String type, String priority) {
		this.status = status;
		this.type = type;
		this.priority = priority;
	}

	/**
	 * @param priority
	 * @param status
	 * @param type
	 * @param employeeName
	 */
	public Filter(String priority, String status, String type, String employeeName) {
		this.priority = priority;
		this.status = status;
		this.type = type;
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
