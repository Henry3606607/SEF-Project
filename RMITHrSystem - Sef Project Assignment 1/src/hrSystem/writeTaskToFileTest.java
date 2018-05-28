package hrSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class writeTaskToFileTest {
	Admin admin;
	CasualStaff casualStaff;
	TimeApprover timeApprover;
	Task task;
	Course course;
	
	@Before
	void setup() {
		admin = (Admin) Login.findUserType("Admin", "henry","edmeades", "s3606607", admin); //fake user
		casualStaff = (CasualStaff) Login.findUserType("CasualStaff", "Josh","Males", "e1234568", casualStaff); //fake user
		timeApprover = (TimeApprover) Login.findUserType("TimeApprover", "Tim","Burton", "e5940596", timeApprover); //fake user
		course = new Course("SEF", "2");
		task = new Task(course, timeApprover, casualStaff,"SEF Tutorial",
				"Monday", "430AM", 15.2);
	}
	@Test
	void writeTaskToFile() {		
		setup();
		assertEquals(true, task.writeTaskToFile());
	}

}
