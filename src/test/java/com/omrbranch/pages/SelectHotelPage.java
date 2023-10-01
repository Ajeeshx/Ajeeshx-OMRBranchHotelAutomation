package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.omrbranch.base.Baseclass;

public class SelectHotelPage extends Baseclass{
@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Standard']")
private WebElement txthotelname;
@FindBy(xpath="//strong[text()='$ 10,384']")
private WebElement txtamount;
@FindBy(xpath="//a[text()='Continue'][1]")
private WebElement btncontinue;
@FindBy(xpath="//h2[text()='Book Hotel - Hyatt Regency Chennai Standard']")
private WebElement txtbookhotel;
@FindBy(id="room_type")
private WebElement roomtypes;
@FindBys({@FindBy(className="total-prize")})
private WebElement price;
@FindBys({@FindBy(xpath="//h5[contains(text(),'Standard')]")})
private WebElement hotelname;


public String getroomtypeheadersuccessmsg() {
	String elementGetText = elementGetText(roomtypes);
	System.out.println(elementGetText);
	return elementGetText;
}

	public String firsthotelname() {
		String getText3 = elementGetText(txthotelname);
		System.out.println(getText3);
		return getText3;

	}
	
	public String firsthotelprice() {
		String getText4 = elementGetText(txtamount);
		System.out.println(getText4);
		return getText4;

	}
	public String gethotelsuccessmsg() {
		btncontinue.click();
		alertClickOk();
		String getText5 = elementGetText(txtbookhotel);
		System.out.println(getText5);
		return getText5;
	}
	public void accepthotel() {
		alertClickOk();
	}
public void dismisshotelbooking() {
alertClickCancel();
}
public void sorthotelpriceasc() {
	List<WebElement> price = findLocatorsByClassName("total-prize");
	List<String> exp= new ArrayList<String>();
	for (WebElement x :price) {
		exp.add(x.getText());
	}
	System.out.println(exp);
	List<String> act= new ArrayList<String>();
		act.addAll(exp);
		Collections.sort(act);
		System.out.println(act);
		if (exp.equals(act)) {
			
			System.out.println("True");
			
		}else {
			System.out.println("False");

	}
		System.out.println(act);
	}

public void namedecending() {
	List<WebElement> hotelname = findLocatorsByXpath("//h5[contains(text(),'Standard')]");
	List<String>exp=new ArrayList<String>();
	for (WebElement x : hotelname) {
		exp.add(x.getText());
		
	}
	
	System.out.println(exp);
	List<String>act=new ArrayList<String>();
	act.addAll(exp);
	Collections.sort(act);
	Collections.reverse(act);
	System.out.println(act);
	
	if (exp.equals(act)) {
		System.out.println("True");
		
	}else {
		System.out.println("False");
	}	
}

public WebElement getTxthotelname() {
	return txthotelname;
}

public void setTxthotelname(WebElement txthotelname) {
	this.txthotelname = txthotelname;
}

public WebElement getTxtamount() {
	return txtamount;
}

public void setTxtamount(WebElement txtamount) {
	this.txtamount = txtamount;
}

public WebElement getBtncontinue() {
	return btncontinue;
}

public void setBtncontinue(WebElement btncontinue) {
	this.btncontinue = btncontinue;
}

public WebElement getTxtbookhotel() {
	return txtbookhotel;
}

public void setTxtbookhotel(WebElement txtbookhotel) {
	this.txtbookhotel = txtbookhotel;
}

public WebElement getRoomtypes() {
	return roomtypes;
}

public void setRoomtypes(WebElement roomtypes) {
	this.roomtypes = roomtypes;
}

public WebElement getPrice() {
	return price;
}

public void setPrice(WebElement price) {
	this.price = price;
}

public WebElement getHotelname() {
	return hotelname;
}

public void setHotelname(WebElement hotelname) {
	this.hotelname = hotelname;
}	

	
}


