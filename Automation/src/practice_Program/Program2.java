package practice_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Navigation nav =driver.navigate();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//nav.to("https://www.facebook.com/");
		// or we can also write as below to store this in variable
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
