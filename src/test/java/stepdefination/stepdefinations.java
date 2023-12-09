package stepdefination;

import java.io.IOException;

import com.qa.automation.pageobjectmodel.testloginpage;

import io.cucumber.java.en.*;
import resources.basesetup;

public class stepdefinations extends basesetup{
	@Given("initialize browser")
	public void initialize_browser() throws IOException {
		intializedriver();
	}

	@When("user navigates url")
	public void user_navigates_url() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@And("click on username and password")
	public void click_on_username_and_password() {
		testloginpage tlp=new testloginpage(driver);
		tlp.loginpage();
	}

	@Then("user should be login successfuly")
	public void user_should_be_login_successfuly() {
		System.out.println("hello");
	}

}
