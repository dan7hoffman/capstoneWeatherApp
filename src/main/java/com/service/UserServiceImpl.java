package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FavoritesDAO;
import com.dao.UserDAO;
import com.model.Favorites;
import com.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userdao;
	
	@Autowired
	private FavoritesDAO favdao;
	
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
			Favorites newFav = new Favorites(username, city);
			favdao.save(newFav);
			return true;
		}
		return false;
	}
	
	
	@Override
	public List<String> showFavoritesbyUser(String username) { 
		List<String> userFavs = new ArrayList<>();
		Optional<User> u = userdao.findById(username);
		if(u.isPresent()) {
			
			Iterable<Favorites> allfavs = favdao.findAll();
			for(Favorites f: allfavs) {
				if(f.getUsername().equals(username)) {
					userFavs.add(f.getCity());
				}
			}
			return userFavs;
		}
	
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		Iterable<User> allusers = userdao.findAll();
		return (List<User>) allusers;
		
	}
	

}
