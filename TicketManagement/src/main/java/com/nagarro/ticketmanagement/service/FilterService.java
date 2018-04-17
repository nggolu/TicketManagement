package com.nagarro.ticketmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dao.TicketRepository;
import com.nagarro.ticketmanagement.model.Employee;
import com.nagarro.ticketmanagement.model.Filter;
import com.nagarro.ticketmanagement.model.Ticket;

/**
 * filter service deals with the business logic related to filtration
 * 
 * @author nishantgarg
 *
 */
@Service
public class FilterService {

	@Autowired
	private TicketRepository ticketRepository;

	/**
	 * It will be called by user(employee) to filter the list after fetching from
	 * repository
	 * 
	 * @param filter
	 * @param employee
	 * @return {@link List <{@link Ticket}>
	 */
	public List<Ticket> getAllFilteredTickets(Filter filter, Employee employee) {
		// get the list according to user(Employee)
		List<Ticket> tickets = (List<Ticket>) ticketRepository.findAllTicketByEmployee(employee);
		// if priority set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getPriority() != null && !filter.getPriority().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (!tickets.get(i).getPriority().equals(filter.getPriority())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		// if status set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getStatus() != null && !filter.getStatus().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (tickets.get(i).getAssignedTicket() == null) {
					if (!filter.getStatus().equals("Raised")) {
						tickets.remove(i);
						i--;
					}
				} else if (!tickets.get(i).getAssignedTicket().getStatus().equals(filter.getStatus())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		// if type set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getType() != null && !filter.getType().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (!tickets.get(i).getType().equals(filter.getType())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		return tickets;
	}

	/**
	 * It will be called by user(admin) to filter the list after fetching from
	 * repository
	 * 
	 * @param filter
	 * @return
	 */
	public List<Ticket> getAllFilteredTickets(Filter filter) {
		// get all list from database
		List<Ticket> tickets = (List<Ticket>) ticketRepository.findAll();
		// if priority set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getPriority() != null && !filter.getPriority().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (!tickets.get(i).getPriority().equals(filter.getPriority())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		// if status set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getStatus() != null && !filter.getStatus().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (tickets.get(i).getAssignedTicket() == null) {
					if (!filter.getStatus().equals("Raised")) {
						tickets.remove(i);
						i--;
					}
				} else if (!tickets.get(i).getAssignedTicket().getStatus().equals(filter.getStatus())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		// if type set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getType() != null && !filter.getType().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (!tickets.get(i).getType().equals(filter.getType())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		// if employee set by user for filtration is present in list then that ticket is
		// remove from list
		if (filter.getEmployeeName() != null && !filter.getEmployeeName().equals("")) {
			for (int i = 0; i < tickets.size(); i++) {
				if (!tickets.get(i).getEmployee().getName().equals(filter.getEmployeeName())) {
					tickets.remove(i);
					i--;
				}
			}
		}
		System.out.println(tickets.size());
		return tickets;
	}

}
