/**
 * 
 */
package com.myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myPages.HomePage;
import com.myPages.LoginPage;

/**
 * @author Mahabarath
 *
 */
public class LogInTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLogInPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLogInPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}

//	@Test(priority = 2)
//	public void verifyLogInPageHeaderTest() {
//		String header = page.getInstance(LoginPage.class).getLogInPageHeader();
//		System.out.println(header);
//		Assert.assertEquals(header, " ");
//	}
	@Test(priority = 3)
	public void doLogInTest() {
		HomePage homepage = page.getInstance(LoginPage.class).doLogIn("barath89@gmail.com", "mahabarath");
		String title = homepage.getHomePageTitle();
		Assert.assertEquals(title, "My Account");
	}
	
	
	
}
