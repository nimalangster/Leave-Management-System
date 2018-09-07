package com.LMS.leavetype;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveType {
	
	@Id
	private Integer id;
	private Integer leaveId;
	private String leaveName;	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((leaveId == null) ? 0 : leaveId.hashCode());
		result = prime * result + ((leaveName == null) ? 0 : leaveName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaveType other = (LeaveType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (leaveId == null) {
			if (other.leaveId != null)
				return false;
		} else if (!leaveId.equals(other.leaveId))
			return false;
		if (leaveName == null) {
			if (other.leaveName != null)
				return false;
		} else if (!leaveName.equals(other.leaveName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LeaveType [id=" + id + ", leaveId=" + leaveId + ", leaveName=" + leaveName + "]";
	}	

	}