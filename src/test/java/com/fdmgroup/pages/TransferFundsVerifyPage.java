package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferFundsVerifyPage {

	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.id("btn_submit"));
	}
	
	public static WebElement cancelButton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@id='btn_cancel']"));
	}
}
