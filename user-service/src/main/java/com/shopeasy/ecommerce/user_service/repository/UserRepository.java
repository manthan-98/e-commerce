package com.shopeasy.ecommerce.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopeasy.ecommerce.user_service.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public boolean existsByEmail(String email);
	
	public boolean existsByPhoneNo(String phoneNo);
	
//	public List<Address> findByUserId(Long userId);
}
