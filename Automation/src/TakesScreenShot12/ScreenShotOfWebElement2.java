package TakesScreenShot12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		
        File source = driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]")).getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\dell\\eclipse-workspace-Gaurav_Dubey\\Automation\\Screenshots\\logoSelenium.png");
		
		Files.copy(source, target);
	}

}
