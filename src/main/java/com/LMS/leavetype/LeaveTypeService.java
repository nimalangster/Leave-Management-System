package com.LMS.leavetype;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional


public class LeaveTypeService {
	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;

	public LeaveTypeService(LeaveTypeRepository leaveTypeRepository) {
		
		this.leaveTypeRepository = leaveTypeRepository;
	}
	
	public List<LeaveType> getAllLeaveTypes() {
		
		List<LeaveType> userList = new ArrayList<LeaveType>();		
		leaveTypeRepository.findAll().forEach(userList::add);		
		return userList;
	}
	
	public Optional<LeaveType> getLeaveType(Integer id) {
		
		return leaveTypeRepository.findById(id);
	}
	
	public void addLeaveType(LeaveType leaveType) {
		
		leaveTypeRepository.save(leaveType);
	}
	
	public void updateLeaveType(LeaveType leaveType) {
		
		leaveTypeRepository.save(leaveType);
	}	
	
	public void deleteLeaveType(Integer id) {
		
		leaveTypeRepository.deleteById(id);
	}
}
