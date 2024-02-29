package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/table/dynamic-table");
		Thread.sleep(2000);
		String levisShirtPrice = driver.findElement(By.xpath("//th[contains(text(),'Levi')]/..//td[text()='387']")).getText();
		System.out.println(levisShirtPrice);
	
		String discount = driver.findElement(By.xpath("//th[contains(text(), 'Levi')]/..//td[3]")).getText();
		
		System.out.println("Current discount is: "+discount);
		
	}

}
