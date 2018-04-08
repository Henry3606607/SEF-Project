package hrSystem;

public abstract class AbstractUser {
	private String rmitId;
	private String firstName;
	private String lastName;
	private int userID;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getRmitId() {
		return rmitId;
	}
	public void setRmitId(String rmitId) {
		this.rmitId = rmitId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

