package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDropUsingCoordinates9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(source, 50, 50).perform();
		Thread.sleep(2000);
		
		action.dragAndDropBy(source, -30, -50).perform();
		
	}

}
