package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineBankingPage {
	public static WebElement accountSummaryLink(WebDriver driver) {
		return driver.findElement(By.id("account_summary_link"));
	}
}
