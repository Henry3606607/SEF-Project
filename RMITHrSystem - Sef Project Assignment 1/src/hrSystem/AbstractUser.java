package hrSystem;

public abstract class AbstractUser {
	private String rmitId;
	private String firstName;
	private String lastName;
	private int userID;
	String userType;
	public void initUserInformation(String rmitID, String firstName, String lastName, String userType){
		setRmitId(rmitID);
		setFirstName(firstName);
		setLastName(lastName);
		setUserType(userType);
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

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

