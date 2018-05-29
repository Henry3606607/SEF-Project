package hrSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class WriteTimeToFileTest {
	class writeTaskToFileTest {
		CasualStaff casualStaff;
		AvailableTimes availableTimes;
		
		@Before
		void setup() {
			casualStaff = (CasualStaff) Login.findUserType("CasualStaff", "James","May", "s3661022", casualStaff);  
			availableTimes = (AvailableTimes) AvailableTimes.DateAllocated("AvailableTimes", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", availableTimes); 
		}
		@Test
		void WriteTimeToFile() {		
			setup();
			assertEquals(true, AvailableTimes.WriteToFile());
		}

	}
}


