package com.nagarro.ticketmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.ticketmanagement.model.Comment;

/**
 * comment repository handle all operation related to comment database
 * 
 * @author nishantgarg
 *
 */
@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
