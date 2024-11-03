package com.Dhananjay.service;

import com.Dhananjay.entity.User;

public interface UserService {
	
	public User saveUser(User user);

	public boolean existEmailCheck(String email);
	

}
