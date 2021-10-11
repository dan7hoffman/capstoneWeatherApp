package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.User;
import com.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") //to connect to Angular
@RequestMapping("/mainapp") //maybe we can put the initial buttons on this page (Register or Login)
public class AppController {
	
	@Autowired
	private UserService uservice;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		if(uservice.registerUser(user)) {
			return "User was added";
		}
		return "User was not able to be added"; //need to see whether this is what we want to return based on Angular pages?
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		if(uservice.login(login.getUsername(), login.getPassword())) {
			return "login successful";
		}
		return "login not successful, user could not be found in system";
	}
	
	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		return uservice.getAllUsers();
	}
	
	@GetMapping("/{username}/getfavorites")
	public List<String> getFavorites(@PathVariable("username") String username){
		return uservice.showFavoritesbyUser(username);
	}
	
	@PostMapping("/{username}/addfavorites") 
	public String updateFavorites(@PathVariable("username") String username, @RequestBody String city) {
		if(uservice.addFavorite(username, city)) {
			return "City was added to favorites";
		}
		return "City could not be added to favorites";
	}
	
	
	
	
}
