package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
	
	public static Select fromAccountDropdown(WebDriver driver) {
		WebElement drop = driver.findElement(By.xpath("//select[@id='tf_fromAccountId']"));
		Select dropdown = new Select(drop);
		return dropdown;
	}
	
	public static Select toAccountDropdown(WebDriver driver) {
		WebElement drop = driver.findElement(By.xpath("//select[@id='tf_toAccountId']"));
		Select dropdown = new Select(drop);
		return dropdown;
	}
	
	public static WebElement amountField(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='tf_amount']"));
	}
	
	public static WebElement descriptionField(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='tf_description']"));
	}
	
	public static WebElement continueButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='btn_submit']"));
	}
	
}
