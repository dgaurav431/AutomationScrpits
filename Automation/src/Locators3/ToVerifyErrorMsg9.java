package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg9 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		String nameErrorMsg = driver.findElement(By.xpath("//p[text()='Name is required']")).getText();
		
		String emailErrorMsg = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
		
		String passwordErrorMsg = driver.findElement(By.xpath("//p[text()='Password is required']")).getText();
		
		if(nameErrorMsg.contains("Name is required") && emailErrorMsg.contains("Email is required") && passwordErrorMsg.contains("Password is required"))
		{
			System.out.println("Pass: The error msgs are verified");
		}
		else
			System.out.println("Fail: The error msgs are not verified");
		driver.quit();
	
		
	}

}
