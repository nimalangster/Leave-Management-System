package com.LMS.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional


public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers() {
		
		List<User> userList = new ArrayList<User>();		
		userRepository.findAll().forEach(userList::add);		
		return userList;
	}
	
	public Optional<User> getUser(Integer id) {
		
		return userRepository.findById(id);
	}
	
	public void addUser(User user) {
		
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		
		userRepository.save(user);
	}	
	
	public void deleteUser(Integer id) {
		
		userRepository.deleteById(id);
	}
}
