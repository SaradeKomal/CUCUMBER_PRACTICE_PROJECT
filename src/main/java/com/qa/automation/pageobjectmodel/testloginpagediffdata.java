package com.qa.automation.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.constant;

public class testloginpagediffdata {
	public WebDriver driver;
	private By username = By.id("username");
	private By password = By.id("password");
	private By submit = By.id("submit");


public testloginpagediffdata(WebDriver driver2) {
		this.driver=driver2;
	}


public void loginpagedd(String USERNAME, String PASSWORD) {
	WebElement user = driver.findElement(username);
	user.sendKeys(USERNAME);
	WebElement pasword = driver.findElement(password);
	pasword.sendKeys(PASSWORD);
	WebElement sbmit = driver.findElement(submit);
	sbmit.click();
}

public WebElement USERNAME() {
	return driver.findElement(username);
}
public WebElement PASSWORD() {
	return driver.findElement(password);
}
public WebElement SUBMIT() {
	return driver.findElement(submit);
}






}