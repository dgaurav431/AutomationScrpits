package TestNg16;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void demo1() {
		String actualData = "Qspiders";
		String expectedData = "Jspiders";
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("Pass1=========");
		sa.assertAll();
		System.out.println("Pass2=========");
	}
	@Test
	public void demo2() {
		String actualData = "Qspiders";
		String expectedData = "Jspiders";

		SoftAssert sa= new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("Pass1=========");
		sa.assertAll();
		System.out.println("Pass2=========");

	}

}
