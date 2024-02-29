package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement yesButton1 = driver.findElement(By.id("btn"));
		WebElement yesButton2 = driver.findElement(By.id("btn2"));
		
		Dimension yesButton1Dimension = yesButton1.getSize();
		Dimension yesButton2Dimension = yesButton2.getSize();
		
		int yesButton1Height = yesButton1Dimension.getHeight();
		int yesButton1Width = yesButton1Dimension.getWidth();
		
		int yesButton2Height = yesButton2Dimension.getHeight();
		int yesButton2Width = yesButton2Dimension.getWidth();
		
		if( yesButton1Height == yesButton2Height && yesButton1Width == yesButton2Width ) {
			System.out.println("Pass: the dimensions are verified");
		}
		else
			System.out.println("Fail: the dimensions are not verified");

	}

}
