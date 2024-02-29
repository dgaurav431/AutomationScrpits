package WebDriver1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver19 {

	public static void main(String[] args) {

		TestGoogleTitle18.googleTitle(new ChromeDriver());
		System.out.println("the title is verified on chrome");
		
		TestGoogleTitle18.googleTitle(new EdgeDriver());
		System.out.println("the title is verified on edge");
		
	//	TestGoogleTitle18.googleTitle(new FirefoxDriver());
	//  System.out.println("the title is verified on firefox");
	}

}
