package com.nagarro.ticketmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.ticketmanagement.model.Employee;
import com.nagarro.ticketmanagement.service.EmployeeService;

/**
 * It controls the flow related to employee
 * 
 * @author nishantgarg
 *
 */
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * If user is logged in then it will redirect to home page else redirect it to
	 * login page
	 * 
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@GetMapping(value = "/")
	public String index(HttpServletRequest request, HttpSession session) {
		if (session.getAttribute("employee") != null)
			return "redirect:/home";
		return "index";
	}

	/**
	 * It will authenticate the user and according to that redirect to page for any
	 * post method
	 * 
	 * @param employee
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@PostMapping(value = "/home")
	public String home(@ModelAttribute Employee employee, HttpServletRequest request, HttpSession session) {
		Employee emp;

		emp = employeeService.findUserByNameAndPassword(employee);
		if (emp != null) {
			session.setAttribute("employee", emp);
			session.setAttribute("userType", emp.getUser().getUserType());
			request.setAttribute("employee", emp);
			request.setAttribute("userType", emp.getUser().getUserType());
			if (emp.getUser().getUserType().equals("admin")) {
				return "redirect:/adminTickets";
			}

			return "home";
		}
		return "redirect:/";
	}

	/**
	 * It will check user is logged in or not and redirect user according to that
	 * for any get request
	 * 
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@GetMapping(value = "/home")
	public String gethome(HttpServletRequest request, HttpSession session) {

		if (session.getAttribute("employee") != null) {
			request.setAttribute("employee", (Employee) session.getAttribute("employee"));
			request.setAttribute("userType", (String) session.getAttribute("userType"));
			if (((String) session.getAttribute("userType")).equals("admin")) {
				return "redirect:/adminTickets";
			}
			return "home";
		}
		return "request:/";
	}

}
