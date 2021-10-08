package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String username; //this will be the primary key
	private String password;
	private String imgURL;
	//private List<String> favorites;
	public User(String username, String password, String imgURL) {
		super();
		this.username = username;
		this.password = password;
		this.imgURL = imgURL;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", imgURL=" + imgURL + "]";
	}

	

}
