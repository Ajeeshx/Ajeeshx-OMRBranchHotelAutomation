package com.omrbranch.pom;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfirmationPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.ExploreHotelPage;
import com.omrbranch.pages.SelectHotelPage;
import com.omrbranch.pages.Loginpage;

public class pageobjectmanager {
	public Loginpage loginpage;
	public ExploreHotelPage explorehotelpage;
	public SelectHotelPage selecthotelpage;
	public BookHotelPage bookhotelpage;
	public BookingConfirmationPage bookingconfirmationpage;
	public MyBookingPage mybookingpage;

	public Loginpage getLoginpage() {

		return (loginpage == null) ? loginpage = new Loginpage() : loginpage;
	}

	public ExploreHotelPage getexplorehotelpage() {

		return (explorehotelpage == null) ? explorehotelpage = new ExploreHotelPage() : explorehotelpage;
	}

	public SelectHotelPage getselecthotelpage() {

		return (selecthotelpage == null) ? selecthotelpage = new SelectHotelPage() : selecthotelpage;
	}

	public BookHotelPage getbookhotelpage() {

		return (bookhotelpage == null) ? bookhotelpage = new BookHotelPage() : bookhotelpage;
	}

	public BookingConfirmationPage getbookingconfirmationpage() {

		return (bookingconfirmationpage == null) ? bookingconfirmationpage = new BookingConfirmationPage()
				: bookingconfirmationpage;
	}

	public MyBookingPage getmybookingpage() {

		return (mybookingpage == null) ? mybookingpage = new MyBookingPage() : mybookingpage;
	}

}
