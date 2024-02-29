package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation8 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Navigation nav =driver.navigate();    // navigate to sub url
		//nav.to("https://www.facebook.com/");
		// or we can also write as below to store this in variable
		
		nav.back();
		
		nav.forward();
		
		nav.refresh();
	}

}
