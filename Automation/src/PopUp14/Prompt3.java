package PopUp14;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
		
		driver.findElement(By.id("buttonAlert1")).click();
		
		Alert a = driver.switchTo().alert();
		
		String alertMsg = a.getText();
		
		System.out.println(alertMsg);
		
		a.sendKeys("yes");
		
		a.accept();
		
	}

}
