package Locators3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDisplayedOrNot1 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
	Thread.sleep(5000);
	
	WebElement emailTextBox = driver.findElement(By.id("email"));
	emailTextBox.sendKeys("gauravqsp.123@gmail.com");
	
	WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
	
	boolean emailDisplayed = emailTextBox.isDisplayed();
	if(emailDisplayed) {
		System.out.println("Pass: the email text box is displayed");
	}
	else
		System.out.println("Fail: the email text box is not displayed");	

	/*
	WebElement passwordTextBox = driver.findElement(By.id("password"));
	passwordTextBox.sendKeys("gaurav@123");
	
	*/
	}
	
	
}
