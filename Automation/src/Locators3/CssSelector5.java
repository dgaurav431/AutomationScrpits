package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("name"));
		
		WebElement email = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement registerButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		name.sendKeys("Gaurav");
		email.sendKeys("gaurav@gmail.com");
		password.sendKeys("jspiders");
		registerButton.click();
	}

}
