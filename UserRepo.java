package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.hospital.models.UserData;

public interface UserRepo extends JpaRepository<UserData, Integer> {
	public UserDetails findByName(String username);
}
