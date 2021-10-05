package com.model;

import java.util.List;

public class User {

	private String username;
	private String password;
	private String imgURL;
	private List<String> favorites;

	public User(String username, String password, String imgURL, List<String> favorites) {
		super();
		this.username = username;
		this.password = password;
		this.imgURL = imgURL;
		this.favorites = favorites;
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

	public List<String> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<String> favorites) {
		this.favorites = favorites;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", imgURL=" + imgURL + ", favorites="
				+ favorites + "]";
	}

}
