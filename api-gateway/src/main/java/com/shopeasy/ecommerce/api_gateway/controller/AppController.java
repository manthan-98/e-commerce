package com.shopeasy.ecommerce.api_gateway.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shopeasy.ecommerce.api_gateway.dto.OrderDto;
import com.shopeasy.ecommerce.api_gateway.dto.UserDto;

@RestController
@RequestMapping("/shopeasy")
public class AppController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/signup")
	public ResponseEntity createUser(@RequestBody UserDto userDto) {
		
		String userServiceUrl = "http://localhost:8080/user/signup";    	//   http://localhost:8080/user/signup
		ResponseEntity<String> response = restTemplate.postForEntity(userServiceUrl, userDto, String.class);
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
		
	}
	
//	@PostMapping(path="/verifyemail")
//	public ResponseEntity<User> verifyEmail(@RequestBody User user) {
//
//		return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
		
		String userServiceGetById = "http://localhost:8080/user/{id}"; 
		
		ResponseEntity<UserDto> user = restTemplate.getForEntity(userServiceGetById, UserDto.class, id);
				 
		return ResponseEntity.status(user.getStatusCode()).body(user.getBody());
	}
	
	@PostMapping("/neworder")
	public ResponseEntity createOrder(@RequestBody OrderDto newOrder) {
		
		String userNewOrder = "http://localhost:8088/order/neworder";
		
		ResponseEntity<String> order = restTemplate.postForEntity(userNewOrder, newOrder, String.class);
		return ResponseEntity.status(order.getStatusCode()).body(order.getBody());		
	}
}




