package com.stepdefnition;

import com.jenkins.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class googlestep extends BaseClass  {
	
	@Given("User must launch the {string} browser")
	public void user_must_launch_the_browser(String string) {
		launchBrowser(string);
	

	}
	@When("User launch the URL {string}")
	public void user_launch_the_url(String string) {
		launchUrl(string);

		
	}

}
