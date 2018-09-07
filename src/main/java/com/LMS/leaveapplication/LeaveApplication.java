package com.LMS.leaveapplication;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.LMS.leavetype.LeaveType;
import com.LMS.user.User;

@Entity
public class LeaveApplication {
	
	@Id
	private Integer id;
	@ManyToOne
	private LeaveType leaveType;
	@ManyToOne
	private User user;
	private String reason;
	private Date startDate;
	private Date endDate;
    private Status status;
	
    public enum Status {Applied, Approved, Rejected}          
    

	public LeaveApplication(LeaveType leaveType, User user, String reason, Date startDate, Date endDate,
			Status status) {
		super();
		this.leaveType = leaveType;
		this.user = user;
		this.reason = reason;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    	
}
