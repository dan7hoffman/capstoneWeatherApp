package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.WeatherForecast;
@Service
public class WeatherServiceImpl implements WeatherService{

	@Override
	public WeatherForecast getWeatherbyCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WeatherForecast> getWeatherbyFavorites(List<String> cities) {
		// TODO Auto-generated method stub
		return null;
	}

}
