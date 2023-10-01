package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelstep {
	
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    
	}
	@Then("User should verify search hotels after success message {string}")
	public void userShouldVerifySearchHotelsAfterSuccessMessage(String string) {
	   
	}
	

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String string, String string2, String string3, String string4, String string5, String string6) {
	    
	}

	

	@Then("User should verify each hotel name ends with the {string}")
	public void userShouldVerifyEachHotelNameEndsWithThe(String string) {
	   
	}

	

	@When("User should click search hotel without enter mandatory field")
	public void userShouldClickSearchHotelWithoutEnterMandatoryField() {
	 
	}
	@Then("User Should verify the error messages {string},{string},{string},{string},{string},{string}")
	public void userShouldVerifyTheErrorMessages(String string, String string2, String string3, String string4, String string5, String string6) {
	  
	}

	

	@Then("User should verify same selected room type is header {string}")
	public void userShouldVerifySameSelectedRoomTypeIsHeader(String string) {
	  
	}
	

	@When("User should click price low to high radio button")
	public void userShouldClickPriceLowToHighRadioButton() {
	   
	}
	@Then("User should verify the hotel price is listed in low to high")
	public void userShouldVerifyTheHotelPriceIsListedInLowToHigh() {
	   
	}
	

	@When("User should click name descending order radio button")
	public void userShouldClickNameDescendingOrderRadioButton() {
	   
	}
	@Then("User should verify the hotel name is listed in descending order")
	public void userShouldVerifyTheHotelNameIsListedInDescendingOrder() {
	   
	}













}
