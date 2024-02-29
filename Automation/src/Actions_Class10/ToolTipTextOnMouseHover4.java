package Actions_Class10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTextOnMouseHover4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/mouseHoverimage?sublist=1");
		
		WebElement img = driver.findElement(By.xpath("//img[@alt=\"order placed\"]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(img).perform();
		
		String toolTipText = img.getAttribute("title");
		
		System.out.println(toolTipText);
		
		if(toolTipText.contains("Order Placed Image")) {
			System.out.println("Pass: the tooltip is verified");
		}
		else
			System.out.println("Fail: the tooltip is not verified");

	}

}
