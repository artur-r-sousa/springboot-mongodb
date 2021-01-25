package com.example.springmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User nUser0 = new User("1", "example", "email@domain.com");
		User nUser1 = new User("2", "example", "email@domain.com");
		List<User> userList = new ArrayList<>();
		userList.addAll(Arrays.asList(nUser0, nUser1));
		return ResponseEntity.ok().body(userList);
	}
	
}
