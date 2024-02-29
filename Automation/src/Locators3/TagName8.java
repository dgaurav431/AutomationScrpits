package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName8 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/dell/Desktop/SELENIUM/Html%20file/Demo%20Qspiders.html");
		
		WebElement headingEle = driver.findElement(By.tagName("h1"));
		String headerText = headingEle.getText();
		System.out.println(headerText);
	}

}
