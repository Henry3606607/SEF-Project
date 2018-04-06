package hrSystem;

import java.io.FileWriter;

public class Query extends AbstractUser{
	FileWriter filewriter = null;

	public void writeCsvFile(String fileName) {
		try {
			filewriter = new FileWriter("../"+fileName);
			filewriter.append("test");
		}
		catch (Exception e) {
			System.out.println("Error In FileWrite");
		}
	}
}

