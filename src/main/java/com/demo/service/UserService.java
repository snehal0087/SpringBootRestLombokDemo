package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	public void saveUser(User user);

	public User getUserById(Long id);

	public List<User> getAllUsers();
}
