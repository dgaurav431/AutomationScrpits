package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyButtonColorIsChanging6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("btn"));
		button.click();
		Thread.sleep(2000);
		
		String buttonColor = button.getCssValue("background-color");
		
		if(buttonColor.contains("134, 239, 172")) {
			System.out.println("Pass: the button color is verified");
		}
		else
			System.out.println("Fail: the button color is not verified");
		
	}

}
