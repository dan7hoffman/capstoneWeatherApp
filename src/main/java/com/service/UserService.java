package com.service;

import java.util.List;

import com.model.User;
import com.model.WeatherForecast;

public interface UserService {
	
	public boolean registerUser(User user);
	public boolean login(String username, String password);
	public boolean addFavorite(String username, String city);
	public List<String> showFavoritesbyUser(String username);
	
	public WeatherForecast getWeatherbyCity(String city);
	public List<WeatherForecast> getWeatherbyFavorites(List<String> cities);
	

}
