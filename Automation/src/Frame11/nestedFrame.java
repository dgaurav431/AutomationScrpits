package Frame11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		WebElement outerFrame = driver.findElement(By.xpath("iframe"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("iframe"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.id("email")).sendKeys("admin");
		
		//immediate Parent frame
		driver.switchTo().parentFrame();
		
		String password = driver.findElement(By.xpath("//p[text()='Admin']")).getText();
		
		System.out.println(password);
	}

}
