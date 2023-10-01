package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.base.Baseclass;

public class ExploreHotelPage extends Baseclass {
@FindBy(xpath="//a[@data-testid='username']")
private WebElement textloginsuccessmsg;
@FindBy(id="state")
private  WebElement selectstate;
@FindBy(xpath="//b[@role='presentation']")
private WebElement selectcity;
@FindBy(xpath="//input[@class='select2-search__field']")
private WebElement standradroom;
@FindBy(xpath="//input[@name='check_in']")
private WebElement dateselect; 
@FindBy(xpath="//input[@name='check_out']")
private WebElement checkout;
@FindBy(id="no_rooms")
private WebElement roomno;
@FindBy(id="no_adults")
private WebElement noofadult;
@FindBy(id="no_child")
private WebElement noofchildn ;
public WebElement getTextloginsuccessmsg() {
	return textloginsuccessmsg;
}
public void setTextloginsuccessmsg(WebElement textloginsuccessmsg) {
	this.textloginsuccessmsg = textloginsuccessmsg;
}
public WebElement getSelectstate() {
	return selectstate;
}
public void setSelectstate(WebElement selectstate) {
	this.selectstate = selectstate;
}
public WebElement getSelectcity() {
	return selectcity;
}
public void setSelectcity(WebElement selectcity) {
	this.selectcity = selectcity;
}
public WebElement getStandradroom() {
	return standradroom;
}
public void setStandradroom(WebElement standradroom) {
	this.standradroom = standradroom;
}
public WebElement getDateselect() {
	return dateselect;
}
public void setDateselect(WebElement dateselect) {
	this.dateselect = dateselect;
}
public WebElement getCheckout() {
	return checkout;
}
public void setCheckout(WebElement checkout) {
	this.checkout = checkout;
}
public WebElement getRoomno() {
	return roomno;
}
public void setRoomno(WebElement roomno) {
	this.roomno = roomno;
}
public WebElement getNoofadult() {
	return noofadult;
}
public void setNoofadult(WebElement noofadult) {
	this.noofadult = noofadult;
}
public WebElement getNoofchildn() {
	return noofchildn;
}
public void setNoofchildn(WebElement noofchildn) {
	this.noofchildn = noofchildn;
}
public String getFrame() {
	return frame;
}
public void setFrame(String frame) {
	this.frame = frame;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public void setSearchbtn(WebElement searchbtn) {
	this.searchbtn = searchbtn;
}
public WebElement getTxtselecthotel() {
	return txtselecthotel;
}
public void setTxtselecthotel(WebElement txtselecthotel) {
	this.txtselecthotel = txtselecthotel;
}
public WebElement getRoomtypes() {
	return roomtypes;
}
public void setRoomtypes(WebElement roomtypes) {
	this.roomtypes = roomtypes;
}
public WebElement getInvalid1() {
	return invalid1;
}
public void setInvalid1(WebElement invalid1) {
	this.invalid1 = invalid1;
}
public WebElement getFindLocatorbyId() {
	return findLocatorbyId;
}
public void setFindLocatorbyId(WebElement findLocatorbyId) {
	this.findLocatorbyId = findLocatorbyId;
}
public WebElement getInvalid3() {
	return invalid3;
}
public void setInvalid3(WebElement invalid3) {
	this.invalid3 = invalid3;
}
public WebElement getInvalid4() {
	return invalid4;
}
public void setInvalid4(WebElement invalid4) {
	this.invalid4 = invalid4;
}
public WebElement getInvalid5() {
	return invalid5;
}
public void setInvalid5(WebElement invalid5) {
	this.invalid5 = invalid5;
}
public WebElement getInvalid6() {
	return invalid6;
}
public void setInvalid6(WebElement invalid6) {
	this.invalid6 = invalid6;
}

@FindBy(id="hotelsearch_iframe")
private String frame;
@FindBy(xpath="//button[text()='Search']")
private WebElement searchbtn;
@FindBy(xpath="//h5[text()='Select Hotel']")
private WebElement txtselecthotel;
@FindBy(className="select2-search__field")
private WebElement roomtypes;
@FindBy(xpath="//div[text()='Please select state']")
private WebElement invalid1;
@FindBy(id="invalid-city")
private WebElement findLocatorbyId;
@FindBy(id="invalid-check_in")
private WebElement invalid3;
@FindBy(id="invalid-check_out")
private WebElement invalid4;
@FindBy(id="invalid-no_rooms")
private WebElement invalid5;
@FindBy(id="invalid-no_adults")
private WebElement invalid6;
public String getloginsuccessmsg() {
	String elementGetText = elementGetText(textloginsuccessmsg);
	System.out.println(elementGetText);
	return elementGetText;
}
	public String Searchhotel(String statename,String cityname, String roomtype,String Checkindate,String checkoutdate,String noofrooms,String Adultcount,String Child) throws InterruptedException {
		
		selectOptionByValue(selectstate, statename);
		Thread.sleep(3000);
		elementSendKeys(selectcity, cityname);
	elementSendKeys(standradroom, roomtype);
	elementSendKeys(dateselect, Checkindate);
	elementSendKeys(checkout, checkoutdate);
	selectOptionByValue(roomno,noofrooms);
	selectOptionByValue(noofadult,Adultcount );
	elementSendKeys(noofchildn, Child);
	switchFrameById(frame);
	elementlickJS(searchbtn);
	String getText2 = elementGetText(txtselecthotel);
	System.out.println(getText2);
	return getText2;

	}
	public String searchhotelmandtoryfield(String statename,String cityname, String Checkindate,String checkoutdate,String noofrooms,String Adultcount) throws InterruptedException {
		selectOptionByValue(selectstate, statename);
		Thread.sleep(3000);
		elementSendKeys(selectcity, cityname);	
		elementSendKeys(dateselect, Checkindate);
		elementSendKeys(checkout, checkoutdate);
		selectOptionByValue(roomno,noofrooms);
		selectOptionByValue(noofadult,Adultcount );
		switchFrameById(frame);
		elementlickJS(searchbtn);
		String getText2 = elementGetText(txtselecthotel);
		System.out.println(getText2);
		return getText2;
	}
	
	public void selectroomtype(String roomtype) {
		
		String[] split =roomtype.split("/");
		for (String v : split) {
			selectOptionByText(textloginsuccessmsg, roomtype);
		}
	}
	
	public String gettextstateerrormsg() {
		String elementGetText00 = elementGetText(invalid1);
		System.out.println(elementGetText00);
		Assert.assertEquals("verify error msg", true);
		return elementGetText00;
	}
	public String getcityerrormsg() {
		String text = elementGetText(findLocatorbyId);
		System.out.println(text);
		Assert.assertEquals("verify error msg", true);
		return text;
	}
	public String getcheckindateerrormsg() {
		String elementGetText02 = elementGetText(invalid3);
		System.out.println(elementGetText02);
		Assert.assertEquals("verify error msg", true);
		return elementGetText02;

	}
	
	public String getcheckouterrormsg() {
		String elementGetText03 = elementGetText(invalid4);
		System.out.println(elementGetText03);
		Assert.assertEquals("verify error msg", true);
		return elementGetText03;

	}
	
	public String getnofroomerrormsg() {
		String elementGetText04 = elementGetText(invalid5);
		System.out.println(elementGetText04);
		Assert.assertEquals("verify error msg", true);
		return elementGetText04;
	}
	
	public String getnoofadulterrormsg() {
		String elementGetText05 = elementGetText(invalid6);
		System.out.println(elementGetText05);
		Assert.assertEquals("verify error msg", true);
		return elementGetText05;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

