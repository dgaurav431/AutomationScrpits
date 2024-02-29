package WebDriver1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindThePositionOfDefaultWindow12 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		int xCoordinate = pos.getX();
		
		int yCoordinate = pos.getY();
		
		System.out.println("the X coordinate is: "+xCoordinate);
		System.out.println("the Y coordinate is: "+yCoordinate);
	}

}
