package com.shopeasy.ecommerce.user_service.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopeasy.ecommerce.user_service.model.User;
import com.shopeasy.ecommerce.user_service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		LocalDateTime dateTime = LocalDateTime.now();
		user.setCreatedAt(dateTime);
		user.setUpdatedAt(dateTime);
		return userRepository.save(user);
	}
	
	public boolean checkUserExist(User user) {
		if(userRepository.existsByEmail(user.getEmail()) || userRepository.existsByPhoneNo(user.getPhoneNo())) {
			return true;
		} else return false;
	}
	
	public Optional<User> findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
}
