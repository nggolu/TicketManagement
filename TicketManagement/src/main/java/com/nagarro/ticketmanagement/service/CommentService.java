package com.nagarro.ticketmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dao.CommentRepository;
import com.nagarro.ticketmanagement.model.Comment;

/**
 * It look for all business logic related to comments
 * 
 * @author nishantgarg
 *
 */
@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;

	/**
	 * it will add the comment after commenting by user through comment repository
	 * 
	 * @param comment
	 */
	public void addComment(Comment comment) {
		commentRepository.save(comment);
	}

}
