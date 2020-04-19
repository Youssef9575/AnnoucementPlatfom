package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.User;
import com.project.repositories.UserRepository;

@Service
public class UserService implements GenericService<User>{
	@Autowired
	UserRepository userRepository;

	@Override
	public User getByID(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}
	

}
