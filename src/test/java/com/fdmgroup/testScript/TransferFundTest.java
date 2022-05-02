package com.fdmgroup.testScript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AccountSummaryPage;
import com.fdmgroup.pages.IndexPage;
import com.fdmgroup.pages.OnlineBankingPage;
import com.fdmgroup.pages.TransferFundsConfirmPage;
import com.fdmgroup.pages.TransferFundsPage;
import com.fdmgroup.pages.TransferFundsVerifyPage;
import com.fdmgroup.util.DriverUtilities;

public class TransferFundTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@Test
	public void transferFundFunctionality() {
		IndexPage.onlineBankingMenu(driver).click();
		OnlineBankingPage.accountSummaryLink(driver).click();
		AccountSummaryPage.tansferFundsLink(driver).click();
		
		TransferFundsPage.fromAccountDropdown(driver).selectByIndex(0);
		TransferFundsPage.toAccountDropdown(driver).selectByIndex(4);
		
		TransferFundsPage.amountField(driver).sendKeys(DataFile.amount);
		TransferFundsPage.descriptionField(driver).sendKeys(DataFile.description);
		
		TransferFundsVerifyPage.submitButton(driver).click();
		TransferFundsVerifyPage.submitButton(driver).click();
		
		String actual = TransferFundsConfirmPage.submittionText(driver).getText();
		System.out.println(actual);
		assertEquals("Transfer Money & Make Payments - Confirm",actual);
	}
}
