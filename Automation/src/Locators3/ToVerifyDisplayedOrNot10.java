package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDisplayedOrNot10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup");
		Thread.sleep(5000);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		boolean emailDisplayed = emailTextBox.isDisplayed();
		
		if(emailDisplayed) {
			System.out.println("Pass: the email text box is displayed");
		}
		else
			System.out.println("Fail: the email text box is not displayed");
		
		emailTextBox.sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("data-continue-to=\"password-container\"")).click();
		driver.findElement(By.xpath("//input[@id='email']/../../..//button[contains(text(),'Continue')]")).click();
		
	}

}
