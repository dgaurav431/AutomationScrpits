package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRightClick7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?scenario=1&sublist=1");
		
		WebElement rightClickButton = driver.findElement(By.id("btn30"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickButton).perform();
		
	}

}
