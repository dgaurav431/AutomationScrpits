package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClick5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
		
		WebElement registerButton = driver.findElement(By.tagName("button"));
		
		Actions action= new Actions(driver);
		
		action.click(registerButton).perform();
		
		WebElement error = driver.findElement(By.xpath("//p[text()='Name is required']"));
		
		if(error.isDisplayed())
		{
			System.out.println("Pass: the error is verified");
		}
		else
			System.out.println("Fail: the error is not verified");

	}

}
