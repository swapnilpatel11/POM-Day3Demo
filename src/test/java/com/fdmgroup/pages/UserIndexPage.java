package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIndexPage {
	
	public static WebElement usernameDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space()='username']"));
	}
	
	public static WebElement logoutLink(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@id='logout_link']"));
	}
	
	public static WebElement OnlineBankingLink(WebDriver driver) {
		return driver.findElement(By.xpath("//strong[normalize-space()='Online Banking']"));
	}
	
	
	
	
}
