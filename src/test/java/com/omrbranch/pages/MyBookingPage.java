package com.omrbranch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.Baseclass;

public class MyBookingPage extends Baseclass {
	WebDriver driver;
	public  MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement ddnWelcome;
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement btnAccount;
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement txtBooking;
	public WebElement getDdnWelcome() {
		return ddnWelcome;
	}
	public WebElement getBtnAccount() {
		return btnAccount;
	}
	public WebElement getTxtBooking() {
		return txtBooking;
	}
	
	//edit booking & cancel
	@FindBy(xpath="//div[@class='room-code']//span[contains(text(),'#')]")
	private WebElement prorderid;
	@FindBy(xpath="//input[@name='search']")
	private WebElement orderidtxt;
	@FindBy(xpath="//h5[contains(text(),'Hyatt')]")
	private WebElement prhotelname;
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement pramount;
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement btnedit;
	@FindBy(name="check_in")
private WebElement date11;
	@FindBy(xpath="//button[text()='Confirm']")
private WebElement confirmclick;	
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement bookstatus;
	@FindBy(xpath="//a[@class='cancle btn filter_btn']")
	private WebElement btncancel;
	@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
	private WebElement printcancel;
	
public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getProrderid() {
		return prorderid;
	}
	public void setProrderid(WebElement prorderid) {
		this.prorderid = prorderid;
	}
	public WebElement getOrderidtxt() {
		return orderidtxt;
	}
	public void setOrderidtxt(WebElement orderidtxt) {
		this.orderidtxt = orderidtxt;
	}
	public WebElement getPrhotelname() {
		return prhotelname;
	}
	public void setPrhotelname(WebElement prhotelname) {
		this.prhotelname = prhotelname;
	}
	public WebElement getPramount() {
		return pramount;
	}
	public void setPramount(WebElement pramount) {
		this.pramount = pramount;
	}
	public WebElement getBtnedit() {
		return btnedit;
	}
	public void setBtnedit(WebElement btnedit) {
		this.btnedit = btnedit;
	}
	public WebElement getDate11() {
		return date11;
	}
	public void setDate11(WebElement date11) {
		this.date11 = date11;
	}
	public WebElement getConfirmclick() {
		return confirmclick;
	}
	public void setConfirmclick(WebElement confirmclick) {
		this.confirmclick = confirmclick;
	}
	public WebElement getBookstatus() {
		return bookstatus;
	}
	public void setBookstatus(WebElement bookstatus) {
		this.bookstatus = bookstatus;
	}
	public WebElement getBtncancel() {
		return btncancel;
	}
	public void setBtncancel(WebElement btncancel) {
		this.btncancel = btncancel;
	}
	public WebElement getPrintcancel() {
		return printcancel;
	}
	public void setPrintcancel(WebElement printcancel) {
		this.printcancel = printcancel;
	}
	public void setDdnWelcome(WebElement ddnWelcome) {
		this.ddnWelcome = ddnWelcome;
	}
	public void setBtnAccount(WebElement btnAccount) {
		this.btnAccount = btnAccount;
	}
	public void setTxtBooking(WebElement txtBooking) {
		this.txtBooking = txtBooking;
	}
public void navigatetomybookingpage() {
	elementlickJS(ddnWelcome);
	btnAccount.click();
}
public String getmybookingmsg() {
	String elementGetText1 = elementGetText(txtBooking);
	System.out.println(elementGetText1);
	return elementGetText1;
}
public String searchorderid() {
	String text = prorderid.getText();
	String replace = text.replace("#", "");
	System.out.println(replace);
orderidtxt.sendKeys(replace);
return replace;
}
public String getorderidmsg() {
	String text = prorderid.getText();
	System.out.println(text);
	return text;
}
public String gethotelnamemsg() {
	String elementGetText02 = elementGetText(prhotelname);
	System.out.println(elementGetText02);
	return elementGetText02;
}
public String gethotelpricemsg() {
	String elementGetText03 = elementGetText(pramount);
	System.out.println(elementGetText03);
	return elementGetText03;

}
public void modifycheckindate(String checkInDate) {
	elementlickJS(btnedit);
	elementSendKeys(date11, checkInDate);

}
public String getchangebookingsuccuessmsg() {
	confirmclick.click();

	String getText12 = elementGetText(bookstatus);
	System.out.println(getText12);
	return getText12;

}
public String cancelorderid() {
	String text = prorderid.getText();
	String replace = text.replace("#", "");
	System.out.println(replace);
orderidtxt.sendKeys(replace);
elementClick(btncancel);
return replace;
}
public String getcancelorderidsuccessmsg() {
	alertClickOk();
	String elementGetText11 = elementGetText(printcancel);
	System.out.println(elementGetText11);
	return elementGetText11;

}
}
