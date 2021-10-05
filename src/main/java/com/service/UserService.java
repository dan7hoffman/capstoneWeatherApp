package com.service;

import com.model.User;
import com.model.WeatherForecast;

public interface UserService {
	
	public boolean registerUser(User user);
	public boolean login(String username, String password);
	public boolean addFavorite(String username, String city);
	public boolean showFavorites(String username);
	

}
