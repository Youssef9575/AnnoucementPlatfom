package com.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.User;
import com.project.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController extends GenericRestController<User>{
 
	public UserController() {
		// TODO Auto-generated constructor stub
		super.service = new UserService();
	}
}
