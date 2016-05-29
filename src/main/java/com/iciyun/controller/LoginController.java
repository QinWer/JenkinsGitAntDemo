package com.iciyun.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iciyun.beans.User;
import com.iciyun.services.LoginServices;

@Controller
public class LoginController {
	
	@Resource	
	private LoginServices loginServices;
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		System.out.println("去登录页面！！！");
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(User user){
		if (loginServices.checkUser(user)) {
			System.out.println("登录成功。。。");
			return "success";
		} 
		System.out.println(user);
		return "fail";
	}
}
