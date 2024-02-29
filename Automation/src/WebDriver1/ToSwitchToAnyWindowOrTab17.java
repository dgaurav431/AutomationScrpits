package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAnyWindowOrTab17 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.findElement(By.linkText("Payments")).click();
		
		driver.findElement(By.linkText("Return Policy")).click();
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Thread.sleep(3000);
		
		Set<String> allIDs = driver.getWindowHandles();
		//System.out.println(allIDs);
		
		for(String id: allIDs) {
			
			driver.switchTo().window(id);
			
			String currentTitle = driver.getTitle();
			
			if(currentTitle.contains("Facebook")) {
				driver.close();
			}
		}
	}

}
