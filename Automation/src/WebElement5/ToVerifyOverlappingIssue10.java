package WebElement5;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		
		WebElement yesButton1 = driver.findElement(By.id("btn"));
		WebElement noButton1 = driver.findElement(By.id("btn1"));
		
		Rectangle yesButton1Rect = yesButton1.getRect();
		Rectangle noButton1Rect = noButton1.getRect();
		
		int yesButton1StartX = yesButton1Rect.getX();
		int yesButton1Width = yesButton1Rect.getWidth();
		
		int noButton1StartX = noButton1Rect.getX();
		int yesButton1EndX = yesButton1StartX + yesButton1Width;
		
		if( noButton1StartX >= yesButton1EndX ) {
			System.out.println("Pass: the buttons are not overlapping");
		}
		else
			System.out.println("Fail: the buttons are overlapping");
		
	}

}
