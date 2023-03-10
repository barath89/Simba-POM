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
public class HomePage extends BasePage {

	By header = By.xpath("//ul[@class='breadcrumb']//a//i");
	
	/**
	 * @param header the header to set
	 */
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getHomePageTitle() {
		return getPageTitile();
	}
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}

}
