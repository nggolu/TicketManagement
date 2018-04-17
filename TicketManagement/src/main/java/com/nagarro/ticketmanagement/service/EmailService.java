package com.nagarro.ticketmanagement.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailParseException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * Creating a service for email by javaMailSender
 * 
 * @author nishantgarg
 *
 */
@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	/**
	 * It will send mail to user to with given subject and with given content
	 * 
	 * @param subject
	 * @param content
	 * @param to
	 */
	public void sendMail(String subject, String content, String to) {

		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setFrom("nagarro@do-not-reply.com");
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(String.format(content, subject, content));

		} catch (MessagingException e) {
			throw new MailParseException(e);
		}
		try{
			mailSender.send(message);
		}
		catch(Exception e) {
			System.err.println("exception " + e);
		}
		
	}

}
