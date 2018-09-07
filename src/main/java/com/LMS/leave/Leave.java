package com.LMS.leave;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.LMS.leavetype.LeaveType;
import com.LMS.user.User;

@Entity
public class Leave {
	
	@Id
	private Integer id;
	@ManyToOne
	private User user;
	@ManyToOne
	private LeaveType leaveType;
	private Integer remainingDays;
	private Integer allocatedDays;
	
	public Leave(User user, LeaveType leaveType, Integer remainingDays, Integer allocatedDays) {
		super();
		this.user = user;
		this.leaveType = leaveType;
		this.remainingDays = remainingDays;
		this.allocatedDays = allocatedDays;
	}

	public Integer getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(Integer allocatedDays) {
		this.allocatedDays = allocatedDays;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public Integer getRemainingDays() {
		return remainingDays;
	}
	public void setRemainingDays(Integer remainingDays) {
		this.remainingDays = remainingDays;
	}
	
}