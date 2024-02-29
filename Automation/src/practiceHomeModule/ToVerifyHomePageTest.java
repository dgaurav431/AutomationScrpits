package practiceHomeModule;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM15.LoginPage;

public class ToVerifyHomePageTest extends practiceTestNg.BaseClass{
	@Test
	public void toVerifyHomePageTest() throws IOException {
		String expectedHomePageTitle = FileUtils.fetchStringDataFromExcelSheet("Sheet2", 3, 0);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));

		String actaulHomePageTitle = driver.getTitle();

		Assert.assertTrue(actaulHomePageTitle.contains(expectedHomePageTitle));
		System.out.println("Pass: the title is verified");

	}
}
