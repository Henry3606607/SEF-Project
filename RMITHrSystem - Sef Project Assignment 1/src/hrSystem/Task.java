package hrSystem;

public class Task {
	Course course;
	TimeApprover assignedApprover;
	CasualStaff assignedStaffMember;
	String taskName;
	String time;
	Double payRate;
	boolean verified = false;
	boolean completed = false;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public TimeApprover getAssignedApprover() {
		return assignedApprover;
	}
	public void setAssignedApprover(TimeApprover assignedApprover) {
		this.assignedApprover = assignedApprover;
	}
	public CasualStaff getAssignedStaffMember() {
		return assignedStaffMember;
	}
	public void setAssignedStaffMember(CasualStaff assignedStaffMember) {
		this.assignedStaffMember = assignedStaffMember;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName() {
		return taskName;
	}
	public Double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	} 
	
	
}
