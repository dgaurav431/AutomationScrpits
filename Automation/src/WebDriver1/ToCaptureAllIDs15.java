package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAllIDs15 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.findElement(By.linkText("Payments")).click();
		
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		System.out.println(allWindowIDs);

        String parentTitle = driver.getTitle();
         System.out.println(parentTitle);
	}
}