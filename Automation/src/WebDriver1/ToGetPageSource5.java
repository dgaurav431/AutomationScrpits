package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		if(pageSource.contains("business")) {
			System.out.println("pass : the information is verified");
		}
		else {
			System.out.println("fail : the information is not verified");
		}
	}

}
