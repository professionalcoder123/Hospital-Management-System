package com.hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hospital.models.UserData;
import com.hospital.repo.UserRepo;

@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repo.findByName(username);
	}

	public void saveUser(UserData user) {
		repo.save(user);
	}
}
