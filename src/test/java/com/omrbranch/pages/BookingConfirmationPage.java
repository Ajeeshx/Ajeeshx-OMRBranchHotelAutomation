package com.omrbranch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.Baseclass;

public class BookingConfirmationPage extends Baseclass {
	WebDriver driver;
	public void BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//strong[contains(text(),'#')]")
	private WebElement txtOrderId;
	@FindBy(xpath="//h2[contains(text(),'Booking is Confirmed')]")
	private WebElement txtBookingHotel;
	@FindBy(xpath="//strong[text()='Hyatt Regency Chennai']")
    private WebElement txtHotelName;
	
	
public void getOrderId() {
	elementGetText(txtOrderId);
}
public void getBookinSuccessMsg() {
	elementGetText(txtBookingHotel);
}
public void getBookedHotelName() {
  elementGetText(txtHotelName);
}

}
