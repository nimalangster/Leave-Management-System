package com.LMS.leaveapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class LeaveApplicationService {
	
	@Autowired
	private LeaveApplicationRepository leaveApplicationRepository;

	public LeaveApplicationService(LeaveApplicationRepository leaveApplicationRepository) {
		
		this.leaveApplicationRepository = leaveApplicationRepository;
	}
	
	public List<LeaveApplication> getAllLeaveApplications() {
		
		List<LeaveApplication> userList = new ArrayList<LeaveApplication>();		
		leaveApplicationRepository.findAll().forEach(userList::add);		
		return userList;
	}
	
	public Optional<LeaveApplication> getLeaveApplication(Integer id) {
		
		return leaveApplicationRepository.findById(id);
	}
	
	public void addLeaveApplication(LeaveApplication leaveApplication) {
		
		leaveApplicationRepository.save(leaveApplication);
	}
	
	public void updateLeaveApplication(LeaveApplication leaveApplication) {
		
		leaveApplicationRepository.save(leaveApplication);
	}	
	
	public void deleteLeaveApplication(Integer id) {
		
		leaveApplicationRepository.deleteById(id);
	}
}
