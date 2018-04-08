package hrSystem;

public class Admin extends User {

	String id;
	String Rmitid;
	int userID;

public Admin(String id, int userID) {

		this.setRmitId(id);
		this.setUserID(userID);
		this.addStaff(Rmitid, id);
		this.removeStaff(Rmitid, id);
	}
	
    public void removeStaff(String Rmitid, String id) 
    {
    	

	}

	public void addStaff(String Rmitid, String id) 
	{
		
	}
	
	public void setRmitId(String Rmitid, String id)
	{
		
	}
	
	public void setUserID(int userID, String Rmitid)
	{
		
	}
	
	public String getId(String Rmitid, int userID) 
	{
		return id;
	}
	
	public void setId(String id, String setRmitId) 
	{
		setRmitId = id;
	}
	
	public String getName() 
	{
		return getName();
	}
	
	public void setName(String name, String getName) 
	{
		getName = name;
	}
	
	public String getDepartment() 
	{
	return getDepartment();
	}
	
	public void setDepartment(String department, String Department) 
	{
	Department = department;
	}
	
	public String getSalary() {
	return getSalary();
	}
	
	public void setSalary(String salary, String Salary) {
	Salary = salary;
	}
	

}
