package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsEnabled1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/signup");
		Thread.sleep(5000);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		
		 boolean continueButtonEnabled = driver.findElement(By.xpath("//input[@id='email']/../../..//button[contains(text(), 'Contiunue')]")).isEnabled();
		
		if(continueButtonEnabled) {
			System.out.println("Pass: the button is enabled");
		}
		else
			System.out.println("Fail: the button is not enabled");
	}

}
