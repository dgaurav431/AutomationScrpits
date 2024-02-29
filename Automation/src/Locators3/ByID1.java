package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/dell/Desktop/Html%20file/QSpiders.html");
		
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		//System.out.println(username);
		username.sendKeys("pass ho gaya na: ");
	}

}
