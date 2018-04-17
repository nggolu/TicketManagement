package com.nagarro.ticketmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.ticketmanagement.model.Comment;
import com.nagarro.ticketmanagement.model.Employee;
import com.nagarro.ticketmanagement.service.CommentService;
import com.nagarro.ticketmanagement.service.EmailService;

/**
 * Comment controller control the flow related to comment
 * 
 * @author nishantgarg
 *
 */
@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;

	@Autowired
	private EmailService emailService;

	/**
	 * it will call the service to add comment and check if the user is Admin then
	 * it will send the mail too.
	 * 
	 * @param comment
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@PostMapping(value = "/viewTicket/addComment")
	public String addComment(@ModelAttribute Comment comment, HttpServletRequest request, HttpSession session) {

		comment.setEmployee((Employee) session.getAttribute("employee"));

		commentService.addComment(comment);

		// if user is admin then it will send email through email service
		if (comment.getEmployee().getUser().getUserType().equals("admin")) {
			Employee emp = (Employee) session.getAttribute("ticketOwner");
			Employee admin = (Employee) session.getAttribute("employee");
			emailService
					.sendMail("Admin Has reponded",
							"Hi " + emp.getName().toUpperCase() + ",\r\n" + "Admin has comment on your ticket.\r\n"
									+ "\r\n" + comment.getText() + ",\r\n" + "Thanks " + ",\r\n" + admin.getName(),
							emp.getEmail());
		}
		return "redirect:/viewTicket/?id=" + comment.getTicketId();

	}
}
