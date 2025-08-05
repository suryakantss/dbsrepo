package com.dover.jparelationprooto.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dover.jparelationprooto.domain.User;

@Repository
public interface UserDAO extends CrudRepository<User, String> {

	public List<User> findAll();
	
}
