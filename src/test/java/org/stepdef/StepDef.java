package org.stepdef;

import org.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class StepDef extends BaseClass {
	
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//		browserLaunch("https://www.facebook.com/");
//	}
	
	// for background keyword 2nd line in feature file as a example
	@Given("user verifying successful login")
	public void user_verifying_successful_login() {
	    // Write code here that turns the phrase above into concrete actions
	}



	
	@When("user providing {string} and {string}")
	public void user_providing_and(String username, String password) {
		sendValues(findElementXpath("//input[@id='email']"), username);
		sendValues(findElementXpath("//input[@id='pass']"), password);
	}

//	@When("user providing username and password")
//	public void user_providing_username_and_password() {
//		sendValues(findElementXpath("//input[@id='email']"), "anand@gmail.com");
//		sendValues(findElementXpath("//input[@id='pass']"), "anand@123");
//	}
	
	@When("user click the login button")
	public void user_click_the_login_button() {
		findElementXpath("//button[@name='login']").click();
	}
	
//	@Then("user checking with unsuccessful login message or error message")
//	public void user_checking_with_unsuccessful_login_message_or_error_message() {
//		System.out.println("user check the unsuccessful login / error message");
//		driver.quit();
//	}




}
