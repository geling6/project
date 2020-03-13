package com.geling.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geling.project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/cpu")
	public String getUser(){
		userService.getUser();
		return "na wei";
	}
	
	@GetMapping(value="/lock")
	public String createUser(String name){
		userService.test();
		return "lock";
	}
	
	@PutMapping(value="")
	public String updateUser(String user){
		return "";
	}

}
