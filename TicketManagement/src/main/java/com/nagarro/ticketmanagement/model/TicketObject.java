package com.nagarro.ticketmanagement.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * POJO for taking image as input from user
 * 
 * @author nishantgarg
 *
 */
public class TicketObject {

	private MultipartFile file;

	private String message;

	private String priority;

	private String title;

	private String type;

	/**
	 * 
	 */
	public TicketObject() {
	}

	/**
	 * @param message
	 * @param priority
	 * @param title
	 * @param file
	 * @param type
	 */
	public TicketObject(String message, String priority, String title, MultipartFile file, String type) {
		this.message = message;
		this.priority = priority;
		this.title = title;
		this.file = file;
		this.type = type;
	}

	/**
	 * @param message
	 * @param priority
	 * @param title
	 * @param type
	 */
	public TicketObject(String message, String priority, String title, String type) {
		this.message = message;
		this.priority = priority;
		this.title = title;
		this.type = type;
	}

	/**
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
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
	 * @param file
	 *            the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
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
