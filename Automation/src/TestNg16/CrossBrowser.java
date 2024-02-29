package TestNg16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void googleTest(String browserFromXML) {
		if(browserFromXML.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(browserFromXML.equals("firefox")) {
			driver=new FirefoxDriver();
		}

		if(browserFromXML.equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.get("https://www.google.co.in/");
		
	}	
}
