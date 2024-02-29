package DropdownsSelect9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect1 {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoqa.com/select-menu");
	
	WebElement dropdown = driver.findElement(By.id("cars"));
	
	Select select= new Select(dropdown);
	
	boolean multiple = select.isMultiple();
	
	if(multiple) {
		System.out.println("Pass: the dropdown is multiselect");
	}
	else
		System.out.println("Fail: the dropdown is not multiselect");
	
	}
}
