package practice_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.msn.com/en-in/feed?ocid=wn_startbrowsing&form=MA13FJ&bundles=staging");
        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL);
        if(currentURL.contains("www.msn.com")) {
        	System.out.println("pass: the url is verified");
        }
        else {
        	System.out.println("fail: the url is not verified");
        }
	}

}
