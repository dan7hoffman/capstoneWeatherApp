package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userdao;
	
	@Override
	public boolean registerUser(User user) {
		Optional<User> u = userdao.findById(user.getUsername());
		if(u.isPresent()) {
			return false;
		}
		else{
			userdao.save(user);
			return true;
		}
		
	}

	@Override
	public boolean login(String username, String password) {
		Optional<User> u = userdao.findById(username);
		if(u.isPresent()) {
			User user = u.get();
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addFavorite(String username, String city) {
		Optional<User> u = userdao.findById(username);
		if(u.isPresent()) {
			List<String> newfavs = u.get().getFavorites();
			newfavs.add(city);
			u.get().setFavorites(newfavs);
			userdao.deleteById(username); 
			userdao.save(u.get());
			return true;
		}
		return false;
	}

	@Override
	public List<String> showFavorites(String username) { //I also changed this to have it return the favorites instead of a boolean
		Optional<User> u = userdao.findById(username);
		if(u.isPresent()) {
			List<String> favs = u.get().getFavorites();
			return favs;
		}
	
		return null;
	}

}
