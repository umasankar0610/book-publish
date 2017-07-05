package com.cit.service;

import java.util.List;


import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.model.User;
import com.cit.repository.UserRepository;
@Service
public class UserService {

	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private  UserRepository repository;

	@Transactional
	public  User save(@NotNull @Valid final User user) {
		LOGGER.debug("Creating {}", user);
		return repository.save(user);
	}

	@Transactional
	public List<User> getList() {
		LOGGER.debug("Retrieving the list of all users");
		return repository.findAll();
	}
	@Transactional
    public User login(String username,String password) {
        LOGGER.debug("Creating {}", username,password);
        return repository.loginUser(username,password);
    }
}
