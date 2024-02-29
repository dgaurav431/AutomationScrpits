package POM15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://www.google.com/");

	WebElement text = driver.findElement(By.name("q"));
	text.sendKeys("hrithik");

	driver.navigate().refresh();
	text.sendKeys("sunny");
}

}
