package hrSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class loginTest {
	protected String uId1, pWord1, uId2, pWord2;

	@Before
	void setup() {
		uId1 = "e9403392";
		pWord1 = "test";
		uId2 = "3411231";
		pWord2 = "ta359124fj";
	}
	
	@Test
	void testLogin() {
		setup();
		assertEquals(true, Login.searchForUser(uId1, pWord1));
		assertEquals(false, Login.searchForUser(uId2, pWord2));
	}

}
