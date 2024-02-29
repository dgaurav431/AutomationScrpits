package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentInXYPlane9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		WebElement yesButton1 = driver.findElement(By.id("btn"));
		WebElement yesButton2 = driver.findElement(By.id("btn2"));
		
		Point yesButton1Position = yesButton1.getLocation();
		Point yesButton2Position = yesButton2.getLocation();
		
		int yesButton1StartX = yesButton1Position.getX();
		int yesButton2StartX = yesButton2Position.getX();
		
		int yesButton1StartY = yesButton1Position.getY();
		int yesButton2StartY = yesButton2Position.getY();
		
		if( yesButton1StartX == yesButton2StartX && yesButton1StartY == yesButton2StartY ) {
			System.out.println("Pass: the allignment is verified");
		}
		else
			System.out.println("Fail: the allignment is not verified");

	}

}
