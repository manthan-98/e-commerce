package com.shopeazy.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.shopeazy.notification.dto.OrderEvent;

@Service
@EnableAsync
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
//	@Async
//	@KafkaListener(topics= "", groupId = "notification-group")
//	public void sendMail(String to, String subject, String body) {
//		
//		try {
//		SimpleMailMessage mail = new SimpleMailMessage();
//		mail.setTo(to);
//		mail.setSubject(subject);
//		mail.setText(body);
//		
//		javaMailSender.send(mail);	
//		
//		} catch(Exception e) {
//			System.out.println("Mail Not sent");
//		}
//	}
	@Async
	@KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void consume(OrderEvent orderEvent) {
		try {
			System.out.println("📩 Notification Service received: " + orderEvent);
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setTo(orderEvent.getEmail());
			mail.setSubject("Your order is successfully placed");
			mail.setText(orderEvent.getProductName() + ": " + orderEvent.getQuantity());
			
			javaMailSender.send(mail);	
			
			} catch(Exception e) {
				System.out.println("Mail Not sent");
			}
    }

}
