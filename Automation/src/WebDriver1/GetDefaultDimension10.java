package WebDriver1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDefaultDimension10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	
		 Dimension dim = driver.manage().window().getSize();
		 System.out.println(dim);
		 
		  int height = dim.getHeight();
		  int weight = dim.getWidth();
		  
		  System.out.println("the height of the window is:" +height);
		  System.out.println("the weight of the window is:" +weight);
	}

}
