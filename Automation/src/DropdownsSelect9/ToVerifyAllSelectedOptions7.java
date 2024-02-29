package DropdownsSelect9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAllSelectedOptions7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select= new Select(carDropdown);
		
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		
		System.out.println("The no of selected options are: "+allSelectedOptions.size());
		
		for(WebElement selected : allSelectedOptions) {
			System.out.println(selected.getText());
			
		}
	}

}
