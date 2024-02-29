package DataDrivenTesting15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\eclipse-workspace-Gaurav_Dubey\\Automation\\TestData\\CommonData.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("username");
		
		System.out.println(value);

	}

}
