package DropdownsSelect9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAOption {

	public static void main(String[] args) {
		String optionToCheck = "1995";
		boolean flag= false; 
		// or int flag=1;
		// or int a=1;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();	
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(yearDropdown);
		
		List<WebElement> allOptionsInYear = selectYear.getOptions();
		
		int noOfOptionsInYear= allOptionsInYear.size();
		System.out.println("the number of options in year dropdowns are: "+noOfOptionsInYear);
		
		for(WebElement option : allOptionsInYear) {
			if(option.getText().equals(optionToCheck)) {
				
				flag= true;
				break;
			//	flag=1;
			//	break;
			//	or
            //	a=1;
			//	break;
			}
		}
		
		if(flag) {
		// or if(flag== 1) {
		// or if(a== 1) {
			
			System.out.println("Pass: the option is present");
		}
		else
		System.out.println("Fail: the option is not present");

	}

}
