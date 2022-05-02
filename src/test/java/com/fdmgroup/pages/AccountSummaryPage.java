package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSummaryPage {
	
	public static WebElement tansferFundsLink(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space()='Transfer Funds']"));
	}
	
}
