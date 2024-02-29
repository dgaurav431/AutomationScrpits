package TestNg16;

import org.testng.annotations.Test;

public class GroupExecution {

	@Test(priority=2, groups="regression")
	public void login() {
		System.out.println("user has logged in");
	}
	@Test(priority=1, groups="smoke")
	public void register() {
		System.out.println("user has registered");
	}
	@Test(priority=3, groups="regression")
	public void logout() {
		System.out.println("user has logged out");
	}
}
