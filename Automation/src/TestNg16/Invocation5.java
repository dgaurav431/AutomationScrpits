package TestNg16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Invocation5 {

	@Test(priority=2)
	public void login() {
		//Assert.fail();
		System.out.println("user1 has logged in");
	}
	@Test(priority=1, invocationCount=3)
	public void register() {
		System.out.println("user1 has registered");
	}
	@Test(priority=4, dependsOnMethods="login")
	public void logout() {
		System.out.println("user1 has logged out");
	}
	@Test(priority=3)
	public void cart() {
		System.out.println("add to cart");
	}
}
