package hrSystem;

public class CasualStaff extends User {
	private String phoneNumber;
	
	public CasualStaff(String id, int userID) {
		this.setRmitId(id);
		this.setUserID(userID);
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
