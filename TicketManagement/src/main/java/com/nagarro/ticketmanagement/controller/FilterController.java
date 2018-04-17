package com.nagarro.ticketmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.ticketmanagement.model.Employee;
import com.nagarro.ticketmanagement.model.Filter;
import com.nagarro.ticketmanagement.model.Ticket;
import com.nagarro.ticketmanagement.service.FilterService;

/**
 * It will look for filter endpoint connection
 * 
 * @author nishantgarg
 *
 */
@Controller
public class FilterController {

	@Autowired
	private FilterService filterService;

	/**
	 * Return the filter ticket form for get request
	 * 
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@GetMapping(value = "/applyFilters")
	public String applyFilter(HttpServletRequest request, HttpSession session) {
		return "ticket/filterForm";
	}

	/**
	 * return the filtered list to the tict page
	 * 
	 * @param filter
	 * @param request
	 * @param session
	 * @return {@link String}
	 */
	@PostMapping(value = "/applyFilters")
	public String applyFilters(@ModelAttribute Filter filter, HttpServletRequest request, HttpSession session) {
		// initialize the tickets list
		List<Ticket> tickets = new ArrayList<>();

		Employee emp = (Employee) session.getAttribute("employee");
		// if employee is admin then it will find all ticket else it will tikcet by
		// employee
		if (((String) session.getAttribute("userType")).equals("admin")) {
			tickets = filterService.getAllFilteredTickets(filter);
		} else {
			tickets = filterService.getAllFilteredTickets(filter, emp);
		}

		request.setAttribute("tickets", tickets);
		request.setAttribute("mode", "filtered");
		// based on the user it will redirect to that page
		if (session.getAttribute("userType").equals("admin")) {
			return "home";
		} else {
			return "employee/employeeTicketList";
		}
	}
}
