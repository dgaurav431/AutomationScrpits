package TestNg16;

import org.testng.annotations.Test;

public class Disable3 {

	@Test(priority=2)
	public void login() {
		System.out.println("user has logged in");
	}
	@Test(priority=1, enabled=false)
	public void register() {
		System.out.println("user has registered");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("user has logged out");
	}
}
