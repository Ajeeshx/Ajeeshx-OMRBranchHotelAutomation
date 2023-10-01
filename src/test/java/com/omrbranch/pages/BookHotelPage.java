package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.Baseclass;

public class BookHotelPage extends Baseclass {
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private WebElement txtBookHotel;
	@FindBy(xpath="//input[@value='own']")
	private WebElement rdoMySelf;
	@FindBy(xpath="//select[@id='user_title']")
	private WebElement ddnSalutation;
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtFirstName;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtLastName;
	@FindBy(xpath="//input[@id='user_phone']")
	private WebElement txtMobile;
	@FindBy(xpath="//input[@id='user_email']")
	private WebElement txtEmail;
	@FindBy(xpath="//input[@id='gst']")
	private WebElement rdoGst;
	@FindBy(xpath="//input[@id='gst_registration']")
	private WebElement txtGstRegNo;
	@FindBy(xpath="//input[@id='company_name']")
	private WebElement txtCompanyName;
	@FindBy(xpath="//input[@id='company_address']")
	private WebElement txtCompanyAddress;
	@FindBy(xpath="//button[@id='step1next']")
	private WebElement btnNext;
	
	//special request
	@FindBy(xpath="//input[@value='Large bed']")
	private WebElement rdoSpecialRequest;
	@FindBy(xpath="//textarea[@name='other_request']")
	private WebElement txtOtherRequest;
	@FindBy(xpath="//button[@id='step2next']")
	private WebElement btnNext2;
	
	//payment
	@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
	private WebElement sltDebit;
	@FindBy(xpath="//select[@id='payment_type']")
	private WebElement ddnPayType;
	@FindBy(xpath="//select[@id='card_type']")
	private WebElement ddnCardType;
	@FindBy(xpath="//input[@id='card_no']")
	private WebElement txtCardNo;
	@FindBy(xpath="//input[@id='card_name']")
	private WebElement txtCardName;
	@FindBy(xpath="//select[@id='card_month']")
	private WebElement ddnCardMonth;
	@FindBy(xpath="//select[@id='card_year']")
	private WebElement ddnCardYear;
	@FindBy(xpath="//input[@name='cvv']")
	private WebElement txtCvv;
	@FindBy(xpath="//button[@id='submitBtn']")
	private WebElement btnSubmit;
	
	//Error msg
	@FindBy(xpath="//div[text()='Please select your card type']")
	private WebElement txtErrorPaytype;
	@FindBy(xpath="//div[@id='invalid-card_type']")
	private WebElement txtErrorCardtype;
	@FindBy(xpath="invalid-card_no")
	private WebElement txtErrorCardno;
	@FindBy(xpath="invalid-card_name")
	private WebElement txtErrorCardName;
	@FindBy(xpath="invalid-card_month")
	private WebElement txtErrorMonth;
	@FindBy(xpath="invalid-cvv")
	private WebElement txtErrorCvv;
	
	
	public String getBookHotelSuccessMsg() {
	String getText = elementGetText(txtBookHotel);
	return getText;
	}
	public void addGuestDetails(String salutation,String firstName,String lastName,String mobile,String email) {
		elementClick(rdoMySelf);
		selectOptionByValue(ddnSalutation, salutation);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lastName);
		elementSendKeys(txtMobile, mobile);
		elementSendKeys(txtEmail, email);
	}
	public void addGstDetails(String regNo,String companyName,String companyAddress) {
		elementClick(rdoGst);
		elementSendKeys(txtGstRegNo, regNo);
		elementSendKeys(txtCompanyName, companyName);
		elementSendKeys(txtCompanyAddress, companyAddress);
		elementClick(btnNext);
	}
	public void addSpecialRequest(String specialRequest) {
	elementClick(rdoSpecialRequest);
	elementSendKeys(txtOtherRequest,specialRequest);
	elementClick(btnNext2);
	}
	public void addPaymentDetails(String paytype,String cardType,String cardNo,String cardName,String cardMonth,String cardYear,String cvv) {
		elementClick(sltDebit);
		selectOptionByValue(ddnPayType, paytype);
		selectOptionByValue(ddnCardType, cardType);
		elementSendKeys(txtCardNo, cardNo);
		elementSendKeys(txtCardName, cardName);
		selectOptionByValue(ddnCardMonth, cardMonth);
		selectOptionByValue(ddnCardYear, cardYear);
		elementSendKeys(txtCvv, cvv);
		elementClick(btnSubmit);
	}
	public String getPayTypeErrorMsg() {
		String getText = elementGetText(txtErrorPaytype);
		return getText;
	}
	public String getCardTypeErrorMsg() {
		String getText = elementGetText(txtErrorCardtype);
		return getText;
	}
	public String getCardNoErrorMsg() {
		String getText = elementGetText(txtErrorCardno);
		return getText;
	}
	public String getCardNameErrorMsg() {
		String getText = elementGetText(txtErrorCardName);
		return getText;
	}
	public String getCardMonthErrorMsg() {
		String getText = elementGetText(txtErrorMonth);
		return getText;
	}
	public String getCvvErrorMsg() {
		String getText = elementGetText(txtErrorCvv);
		return getText;
	}
}
