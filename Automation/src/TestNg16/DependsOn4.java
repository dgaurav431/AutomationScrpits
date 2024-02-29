package TestNg16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn4 {

	@Test(priority=2)
	public void login() {
		Assert.fail();
		System.out.println("user has logged in");
	}
	@Test(priority=1)
	public void register() {
		System.out.println("user has registered");
	}
	@Test(priority=3, dependsOnMethods="login")
	public void logout() {
		System.out.println("user has logged out");
	}
}
