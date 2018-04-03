package com.geling.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geling.project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getUser(){
		return "na wei";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String createUser(String name){
		return "tong lei yan";
	}
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public String updateUser(String user){
		return "liang jing";
	}

}
