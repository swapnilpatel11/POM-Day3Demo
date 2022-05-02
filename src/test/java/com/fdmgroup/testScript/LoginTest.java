package com.fdmgroup.testScript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

public class LoginTest {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}

	@Test
	public void testLoginFunctionality() {
		driver.manage().window().maximize();
		driver.get(DataFile.homePageURL);
		IndexPage.signInButton(driver).click();
		LoginPage.usernameField(driver).sendKeys(DataFile.usr);
		LoginPage.passwordField(driver).sendKeys(DataFile.pwd);
		LoginPage.signInButton(driver).click();
		driver.navigate().back();
		String actual = UserIndexPage.usernameDropdown(driver).getText();
		assertEquals(DataFile.usr,actual );
		
	}
}
