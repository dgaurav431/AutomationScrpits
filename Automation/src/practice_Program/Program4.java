package practice_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		String tagName = driver.findElement(By.tagName("button")).getTagName();

	}

}
