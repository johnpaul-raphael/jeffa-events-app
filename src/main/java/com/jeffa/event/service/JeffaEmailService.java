package com.jeffa.event.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class JeffaEmailService {

	final JavaMailSender mailSender;

	public boolean sendEmail() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("paul.jopal@gmail.com");
		mailMessage.setSubject("Testing from Spring Boot");
		mailMessage.setText("Hello World \n Spring Boot Email");
		mailSender.send(mailMessage);

		return true;
	}

}
