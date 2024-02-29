package CrossBrowserTesting2;

import org.openqa.selenium.WebDriver;

public class TestGoogleTitle {
	public static void googleTitle(WebDriver driver) {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google")) {
			System.out.println("pass: the title is verified");
		}
		else {
			System.out.println("fail: the title is not verified");
			driver.quit();
		}
	}
}
