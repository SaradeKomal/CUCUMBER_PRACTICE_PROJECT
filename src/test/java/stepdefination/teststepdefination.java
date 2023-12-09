package stepdefination;

import java.io.IOException;

import com.qa.automation.pageobjectmodel.testloginpagediffdata;

import io.cucumber.java.en.*;
import resources.basesetup;

public class teststepdefination extends basesetup {

	@Given("intialize browser")
	public void initializeBrowser() throws IOException {
		intializedriver();
	}

	@When("user navigates url {string}")
	public void navigateToURL(String url) {
		driver.get(url);
		System.out.println("url entered");
	}

	@And("user enter {string} and {string}")
	public void enterUsernameAndPassword(String username, String password) {
		testloginpagediffdata tlp=new testloginpagediffdata(driver);
		//tlp.loginpagedd(username, password);
		tlp.USERNAME().sendKeys(username);
		tlp.PASSWORD().sendKeys(password);
		tlp.SUBMIT().click();
		
	}

	@Then("user should be able to login successfully")
	public void verifyLogin() {
		System.out.println("done");
	}
}
