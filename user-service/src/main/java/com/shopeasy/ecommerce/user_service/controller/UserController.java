package com.shopeasy.ecommerce.user_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopeasy.ecommerce.user_service.model.User;
import com.shopeasy.ecommerce.user_service.service.UserServiceImpl;

@RequestMapping(path="/user")
@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping(path= "/signup")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		if(userServiceImpl.checkUserExist(user)) {
			return new ResponseEntity<>("Email/Phone Number already exists", HttpStatus.OK);
		}
		userServiceImpl.saveUser(user);
		return new ResponseEntity<>("User profile created", HttpStatus.CREATED);
//      return new ResponseEntity<>(savedUser, HttpStatus.CREATED);		
	}
	
	@PostMapping(path="/verifyemail")
	public ResponseEntity<User> verifyEmail(@RequestBody User user) {
		
		return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id) {
		
		 Optional<User> user = userServiceImpl.findUserById(id);
		return ResponseEntity.ok(user);
	}
}


