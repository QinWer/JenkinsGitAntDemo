package com.iciyun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iciyun.beans.User;

@Repository
public class LoginDao {
	
	@Autowired
	private User user;
	
	public User findByName(String username){
		user.setUsername(username);
		user.setPassword("123456");
		return user;
	}
}
