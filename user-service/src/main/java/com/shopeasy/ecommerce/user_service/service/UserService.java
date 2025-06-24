package com.shopeasy.ecommerce.user_service.service;

import java.util.Optional;

import com.shopeasy.ecommerce.user_service.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public boolean checkUserExist(User user);
	
	public Optional<User> findUserById(Long id);

}
