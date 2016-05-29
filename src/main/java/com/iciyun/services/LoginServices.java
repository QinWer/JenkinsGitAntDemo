package com.iciyun.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iciyun.beans.User;
import com.iciyun.dao.LoginDao;

@Service
public class LoginServices {

	@Resource
	private LoginDao loginDao;
	
	public boolean checkUser(User loginUser){
		User user = loginDao.findByName(loginUser.getUsername());
		if (loginUser.getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}
}
