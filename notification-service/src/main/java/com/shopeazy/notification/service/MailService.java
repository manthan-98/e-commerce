package com.shopeazy.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Async
	public void sendMail(String to, String subject, String body) {
		
		try {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);
		
		javaMailSender.send(mail);	
		
		} catch(Exception e) {
			System.out.println("Mail Not sent");
		}
	}

}
