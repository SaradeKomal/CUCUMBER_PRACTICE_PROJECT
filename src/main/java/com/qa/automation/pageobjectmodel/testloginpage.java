package com.qa.automation.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.constant;

public class testloginpage {
	public WebDriver driver;
	private By username = By.id("username");
	private By password = By.id("password");
	private By sumbit = By.id("submit");

	
	  public testloginpage(WebDriver driver2) {
		  this.driver=driver2; }
	 

	public void loginpage() {
		WebElement user = driver.findElement(username);
		user.sendKeys(constant.USERNAME);
		WebElement pasword = driver.findElement(password);
		pasword.sendKeys(constant.PASSWORD);
		WebElement sbmit = driver.findElement(sumbit);
		sbmit.click();
	}

}
