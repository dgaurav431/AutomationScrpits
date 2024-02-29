package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingPageDown13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		
		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ENTER).perform();
		
	}

}
