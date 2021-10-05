package com.model;

public class WeatherForecast {
	private String city;
	private double temp;
	private String description;

	public WeatherForecast(String city, double temp, String description) {
		super();
		this.city = city;
		this.temp = temp;
		this.description = description;
	}

	public WeatherForecast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WeatherForecast [city=" + city + ", temp=" + temp + ", description=" + description + "]";
	}

}
