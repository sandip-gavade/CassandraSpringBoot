package com.srg.cassandra.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srg.cassandra.api.model.User;
import com.srg.cassandra.api.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void saveUsers() {
		List<User> list=new ArrayList<>();
		list.add(new User(1,"sandip","kolhapur",32));
		list.add(new User(2,"tom","punr",32));
		list.add(new User(3,"chills","mumbai",32));
		list.add(new User(4,"arati","nashik",32));
		list.add(new User(5,"ankit","kolhapur",32));
		userRepository.saveAll(list);
	}
	

	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
