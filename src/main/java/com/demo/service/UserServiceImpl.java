package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.model.User;
import lombok.NonNull;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(@NonNull User user) {
		userRepository.saveAndFlush(user);
		log.info("user save successfully");
	}

	@Override
	public User getUserById(@NonNull Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		log.debug("found all users " + users);
		return users;
	}

}
