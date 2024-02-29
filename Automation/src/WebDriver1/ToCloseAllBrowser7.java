package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllBrowser7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Link in New Tab")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.linkText("Payments")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
