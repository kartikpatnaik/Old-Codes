package com.userdetails.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.user.vo.User;

@RestController
public class UserController {
	private Map<Integer, User>dataMap=new HashMap<>();
	@PostMapping("/user")
	public ResponseEntity<String> addUser(User user){
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);

	}

}
