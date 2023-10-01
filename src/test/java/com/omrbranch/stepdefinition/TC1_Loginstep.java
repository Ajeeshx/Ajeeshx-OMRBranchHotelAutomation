package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.base.Baseclass;
import com.omrbranch.pom.pageobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Loginstep extends Baseclass {

	pageobjectmanager pom = new pageobjectmanager();

	@Given("User is on the omrbranch hotel page")
	public void userIsOnTheOmrbranchHotelPage() throws FileNotFoundException, IOException {
		getpropertfile("browser");
		getpropertfile("url");
		implicitWait(30);
	}

	@When("User login {string} and {string}")
	public void userLoginAnd(String username, String password) {
		pom.getLoginpage().login(username, password);
	}

	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String username, String password) {
		String actloginsuccessmsg = pom.getexplorehotelpage().getloginsuccessmsg();
		Assert.assertEquals("verify login success msg", actloginsuccessmsg);
	}

	@When("User login {string} and {string} with EnterKey")
	public void userLoginAndWithEnterKey(String username, String password) throws AWTException {
		pom.getLoginpage().loginenterkey(username, password);
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String string) {
		String actloginerrormsg = pom.getLoginpage().getloginerrormsg();
		boolean b = actloginerrormsg.contains(string);
		Assert.assertEquals("verify login error msg", b);
	}

}
