package hrSystem;

public class CourseCoordinator extends User {
	Course[] courses = new Course[5];
	Task task;
	
	public CourseCoordinator(String id, int userID) {
		this.setRmitId(id);
		this.setUserID(userID);
	}
	
	
}
