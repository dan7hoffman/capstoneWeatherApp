package com.service;

import java.util.List;

import com.model.WeatherForecast;

public interface WeatherService {
	
	public WeatherForecast getWeatherbyCity(String city);
	public List<WeatherForecast> getWeatherbyFavorites(List<String> cities);

}
