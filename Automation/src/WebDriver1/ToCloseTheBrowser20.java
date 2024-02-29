package WebDriver1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheBrowser20 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.facebook.com/");
		
		//Close will close facebook.com
		driver.close();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Quit will close all windows
		//driver.quit();
		 

	}
}
