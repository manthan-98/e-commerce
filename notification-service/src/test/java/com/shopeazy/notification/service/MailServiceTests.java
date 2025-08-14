package com.shopeazy.notification.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailServiceTests {
	
	@Autowired
	private MailService mailService;
	
	@Test
	void mailtest() {
		
		mailService.sendMail("manthanmanta@gmail.com", "2nd Attempt", "Hello World 11:44");
		
	}

}
