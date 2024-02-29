package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForDynamicElement {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/search?q=iphone+15&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_2_0_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_2_0_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=iphone+15&requestId=6595c9db-0e7b-4a63-9d49-a0489f389fbb");
		
		WebElement text = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']/../../..//div[text()='₹79,900']"));
		/*
		text.clear();
		text.sendKeys("79,900");
		*/
	}

}
