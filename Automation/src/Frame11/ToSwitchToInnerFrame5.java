package Frame11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToInnerFrame5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		  //Switching to outer frame
		driver.switchTo().frame("nestedFrameName");
		
		 //Switching to inner frame
		driver.switchTo().frame("newWindow");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		
		 //Switching to Parent frame
		driver.switchTo().parentFrame();
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		
		System.out.println(email);
		
	}

}
