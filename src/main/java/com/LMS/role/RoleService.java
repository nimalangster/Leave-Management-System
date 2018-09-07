package com.LMS.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional


public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		
		this.roleRepository = roleRepository;
	}
	
	public List<Role> getAllRoles() {
		
		List<Role> userList = new ArrayList<Role>();		
		roleRepository.findAll().forEach(userList::add);		
		return userList;
	}
	
	public Optional<Role> getRole(Integer id) {
		
		return roleRepository.findById(id);
	}
	
	public void addRole(Role role) {
		
		roleRepository.save(role);
	}
	
	public void updateRole(Role role) {
		
		roleRepository.save(role);
	}	
	
	public void deleteRole(Integer id) {
		
		roleRepository.deleteById(id);
	}
}
