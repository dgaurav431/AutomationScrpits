package WebDriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeDimension11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		
		Dimension newDim = new Dimension(800,300);
		driver.manage().window().setSize(newDim);
		//System.out.println(newDim);

	}

}
