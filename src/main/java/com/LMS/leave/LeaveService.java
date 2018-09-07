package com.LMS.leave;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional


public class LeaveService {
	
	@Autowired
	private LeaveRepository leaveRepository;

	public LeaveService(LeaveRepository leaveRepository) {
		
		this.leaveRepository = leaveRepository;
	}
	
	public List<Leave> getAllLeave() {
		
		List<Leave> userList = new ArrayList<Leave>();		
		leaveRepository.findAll().forEach(userList::add);		
		return userList;
	}
	
	public Optional<Leave> getLeave(Integer id) {
		
		return leaveRepository.findById(id);
	}
	
	public void addLeave(Leave leave) {
		
		leaveRepository.save(leave);
	}
	
	public void updateLeave(Leave leave) {
		
		leaveRepository.save(leave);
	}	
	
	public void deleteLeave(Integer id) {
		
		leaveRepository.deleteById(id);
	}
}
