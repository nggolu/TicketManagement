package com.nagarro.ticketmanagement.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * Create the configuration class for creating bean
 * 
 * @author nishantgarg
 *
 */
@Configuration
@ComponentScan(basePackages = "com.nagarro.ticketmanagement")
public class AppConfiguration {

	/**
	 * Create the bean of javaMailSender and set its properties
	 * 
	 * @return {@link JavaMailSender}
	 */
	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		// Using gmail
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("goku02nagarro@gmail.com");
		mailSender.setPassword("QwertyQaz");

		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");// Prints out everything on screen

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}

}
