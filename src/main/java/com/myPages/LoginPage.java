/**
 * 
 */
package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Mahabarath
 *
 */
public class LoginPage extends BasePage {

	// By Locator
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By btnLogIn = By.xpath("//*[@value='Login']");
	private By header = By.xpath("//img[@title='naveenopencart']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the btnLogIn
	 */
	public WebElement getBtnLogIn() {
		return getElement(btnLogIn);
	}

	/**
	 * @return the titleLogInPage
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLogInPageTitle() {
		return getPageTitile();
	}

	public HomePage doLogIn(String username, String password) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getBtnLogIn().click();

		return getInstance(HomePage.class);
	}

	public void doLogIn() {
		getEmailId().sendKeys();
		getPassword().sendKeys();
		getBtnLogIn().click();

	}

	public String getLogInPageHeader() {
		return getPageHeader(header);
	}
}
