package hrSystem;

public class Task {
	//Course course;
	String course;
	TimeApprover assignedApprover;
	CasualStaff assignedStaffMember;
	String taskName;
	String dateTime;
	Double payRate;
	boolean verified = false;
	boolean completed = false;
	
	//Trialing course as a string
	//Can compare Course Name to Course Task Name to search/sort in database 
	/*public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}*/
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
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
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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
