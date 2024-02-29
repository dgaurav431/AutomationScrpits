package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath6 {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/dell/Desktop/xpath.html");
			
			WebElement btextField = driver.findElement(By.xpath("html/body/div[1]/input[2]"));
			btextField.clear();
			btextField.sendKeys("king");
			
			WebElement ctextField = driver.findElement(By.xpath("html/body/div[2]/input[1]"));
			ctextField.clear();
			ctextField.sendKeys("kong");
			
		}
	}

