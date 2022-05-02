package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferFundsConfirmPage {
	
	public static WebElement submittionText(WebDriver driver) {
		return driver.findElement(By.cssSelector(".board-header"));
	}

}
