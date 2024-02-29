package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoubleClick6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDoubleClick?scenario=1&sublist=2");
		
		WebElement button = driver.findElement(By.id("btn20"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(button).perform();
		
		boolean errorDisplayed = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		
		if(errorDisplayed) {
			System.out.println("Pass: the error is verified");
		}
		else
			System.out.println("Fail: the error is not verified");	
		
	}

}
