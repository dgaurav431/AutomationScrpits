package WebTable7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleWebTable1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		
		List<WebElement> allItems = driver.findElements(By.xpath("//th[@class='px-6 py-4 font-medium text-gray-900 whitespace-nowrap']"));
		
		System.out.println("The No of Items are: "+allItems.size());
		
		System.out.println("All Items are: " );
		
		for(WebElement item: allItems) {
			System.out.println(item.getText());
			
		}
	}

}
