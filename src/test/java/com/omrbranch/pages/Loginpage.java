package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.Baseclass;

public class Loginpage extends Baseclass {
	@FindBy(id = "email")
	private WebElement txtemail;
	@FindBy(id = "pass")
	private WebElement txtpass;
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnlogin;

	public void login(String username, String password) {
		elementSendKeys(txtemail, username);
		elementSendKeys(txtpass, password);
		elementClick(btnlogin);
	}

	public void loginenterkey(String username, String password) throws AWTException {
		elementSendKeys(txtemail, username);
		elementSendKeys(txtpass, password);
		enterkey();

	}

	public String getloginerrormsg() {
		String elementGetText = elementGetText(btnlogin);
		return elementGetText;

	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(WebElement txtemail) {
		this.txtemail = txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(WebElement btnlogin) {
		this.btnlogin = btnlogin;
	}
}
