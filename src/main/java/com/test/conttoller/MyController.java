package com.test.conttoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.beans.User;

@Controller
public class MyController {

	@RequestMapping(value="/dummy")
	public ResponseEntity<User> getDummyUser()
	{
		User u = new User();
		u.setId(new Long(100));
		u.setUsername("surya");
		u.setEmail("surya@gmail.com");
		u.setAddress("alph");
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}
}
