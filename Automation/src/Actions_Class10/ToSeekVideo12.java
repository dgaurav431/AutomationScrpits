package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSeekVideo12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.youtube.com/watch?v=6stlCkUDG_s&list=PL4Gr5tOAPttLOY9IrWVjJlv4CtkYI5cI_");
		
		WebElement seekButton = driver.findElement(By.xpath("//div[@class='ytp-scrubber-button ytp-swatch-background-color']"));
		
		Actions action = new Actions(driver);

		action.moveToElement(seekButton).clickAndHold().moveByOffset(40, 0).release().perform();
		
		
	}

}
