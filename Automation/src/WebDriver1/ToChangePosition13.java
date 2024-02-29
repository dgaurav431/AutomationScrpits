package WebDriver1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangePosition13 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		Point newpos = new Point(200,100);
		driver.manage().window().setPosition(newpos);
	}

}
