package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("The title of the current webpage is: "+title);
		
		//if(title.contains("Facebook"))
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass : the title is verified");
		}
		else {
	   System.out.println("fail : the title is not verified");
	   }
   
	}

}
