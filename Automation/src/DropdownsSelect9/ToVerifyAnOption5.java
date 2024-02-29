package DropdownsSelect9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOption5 {

	public static void main(String[] args) {
		boolean flag= false; 
		// or int flag=1;
		// or int a=1;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select select = new Select(yearDropdown);
		
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option : allOptions) {
			if(option.getText().contains("1910")) {
				
				flag= true;
				break;
			//	flag=1;
			//	break;
			//	or
            //	a=1;
			//	break;
			}
		}
		
		if(flag== true) {
		// or if(flag== 1) {
		// or if(a== 1) {
			
			System.out.println("Pass: the option is present");
		}
		else
		System.out.println("Fail: the option is not present");

	}

}
