package com.fdmgroup.testScript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

public class LogoutTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@Test
	public void testLogoutFunctionality() {
		UserIndexPage.usernameDropdown(driver).click();
		if(UserIndexPage.logoutLink(driver).isDisplayed()) {
			UserIndexPage.logoutLink(driver).click();
		}
		assertTrue(IndexPage.signInButton(driver).isDisplayed());
	}
}
