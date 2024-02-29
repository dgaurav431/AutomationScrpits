package CrossBrowserTesting2;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		TestGoogleTitle.googleTitle(new ChromeDriver());
		System.out.println("the title is verified on chrome");
		
		TestGoogleTitle.googleTitle(new EdgeDriver());
		System.out.println("the title is verified on edge");
		
		TestGoogleTitle.googleTitle(new FirefoxDriver());
		System.out.println("the title is verified on firefox");


	}

}
