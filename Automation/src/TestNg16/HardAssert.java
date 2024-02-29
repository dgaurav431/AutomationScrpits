package TestNg16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo1() {
		String actualData = "Qspiders";
		String expectedData = "Jspiders";
		
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Pass=========");
	}
	@Test
	public void demo2() {
		String actualData = "Qspiders";
		String expectedData = "Jspiders";

		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("Pass=========");

	}

}
