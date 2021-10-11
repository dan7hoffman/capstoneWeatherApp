package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	
	public boolean registerUser(User user);
	public boolean login(String username, String password);
	public boolean addFavorite(String username, String city);
	public List<String> showFavoritesbyUser(String username);
	public List<User> getAllUsers();
	
	
	

}
