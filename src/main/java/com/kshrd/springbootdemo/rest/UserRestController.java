package com.kshrd.springbootdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kshrd.springbootdemo.model.User;
import com.kshrd.springbootdemo.service.UserService;
import com.kshrd.springbootdemo.utility.Paging;
import com.kshrd.springbootdemo.utility.Response;

@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/api/users")
	public Response getAllUsers(Paging paging){	
		System.out.println(paging);
		List<User> users = userService.findWithPagination(paging);
		return new Response(users, paging);
	}
}
