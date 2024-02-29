package PopUp14;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/browser/multipleWindow?sublist=2");
		
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			
			driver.switchTo().window(id);
			
			String currentWindowTitle = driver.getTitle();
			
			if(currentWindowTitle.contains("Sign Up Page")) {
				driver.close();
				break;
			}
		}
	}

}
