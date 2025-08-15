package com.shopeazy.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopeazy.notification.service.MailService;


@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@PostMapping("/sent")
	void sendAnEmail() {
	//	mailService.sendMail("manthanmanta@gmail.com", "Spring Boot mail", "Mail sent through Controller class");
	}
}
