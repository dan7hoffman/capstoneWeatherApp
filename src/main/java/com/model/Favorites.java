package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Favorites {
	@Id 
	@GeneratedValue //something to show that id will be autogenerated ?
	private int id;
	private String username;
	private String city;
	public Favorites() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorites(String username, String city) {
		super();
		this.username = username;
		this.city = city;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Favorites [id=" + id + ", username=" + username + ", city=" + city + "]";
	}
	
	
	

}