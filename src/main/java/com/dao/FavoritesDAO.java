package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Favorites;

@Repository
public interface FavoritesDAO extends CrudRepository<Favorites, String>{

}
