package Frame11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingWebElementRef3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/frames/multiple?sublist=2");
		
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src=\"../signin.html\"]"));
		
		driver.switchTo().frame(secondFrame);
		
		driver.findElement(By.id("email")).sendKeys("Akash");
		
	}

}
