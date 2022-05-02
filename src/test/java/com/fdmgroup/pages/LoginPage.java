package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement usernameField(WebDriver driver) {
		return driver.findElement(By.id("user_login"));
	}
	
	public static WebElement passwordField(WebDriver driver) {
		return driver.findElement(By.id("user_password"));
	}
	
	public static WebElement signInButton(WebDriver driver) {
		return driver.findElement(By.name("submit"));
	}
	
}
