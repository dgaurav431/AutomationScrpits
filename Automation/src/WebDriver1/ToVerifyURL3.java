package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL3 {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();    // to launch empty browser
        driver.get("https://www.google.com/");   // navigate to main url
        
        String currentURL = driver.getCurrentUrl();    // to get current Url
        System.out.println(currentURL);
        
        if(currentURL.contains("google"))
        {
        	System.out.println("pass: the url is verified");
        }
        else 
        {
        	System.out.println("fail: the url is not verified");
        }
	}

}
