package hrSystem;

public class Admin extends User {

	String id;
	String Rmitid;
	int userID;


	public Admin(String id, int userID) {
		this.setRmitId(id);
		this.setUserID(userID);
	}
	
}
