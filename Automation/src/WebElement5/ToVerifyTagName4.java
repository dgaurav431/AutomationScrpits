package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		String tagName = driver.findElement(By.tagName("button")).getTagName();
		
		if(tagName.equals("button")) {
			System.out.println("Pass: the tagName is verified");
		}
		else
			System.out.println("Pass: the tagName is verified");
	}

}
