package com.mnc.cinema.admin.service;

import com.mnc.cinema.admin.model.User;

public interface UserService {
	
	void save(User user);

	User findByUsername(String username);

}
