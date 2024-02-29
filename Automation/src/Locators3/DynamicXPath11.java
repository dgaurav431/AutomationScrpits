package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath11 {

	public static void main(String[] args) {
		
			// test data
		String priceOfIPhone = "₹59,900";
		String productName = "APPLE iPhone 13 (Midnight, 128 GB)";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		// dynamic xpath
		String price = driver.findElement(By.xpath("//div[text()='"+productName+"']/../../..//div[text()='₹"+priceOfIPhone+"']")).getText();
		System.out.println(price);
	}

}
