package com.bae.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByusername(String username);
	
	public User findByid(Long id);
	
	public boolean existsByusername(String username);
	
}
