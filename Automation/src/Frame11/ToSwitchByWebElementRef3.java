package Frame11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchByWebElementRef3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/dell/Desktop/frame.html");
		
		WebElement frameRef = driver.findElement(By.xpath("//iframe[@src='https://www.selenium.dev/']"));
		
		driver.switchTo().frame(frameRef);
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
	}

}
