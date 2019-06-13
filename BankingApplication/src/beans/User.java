package beans;

import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.GregorianCalendar;


public class User    {

	private String fName = "";
	private String lName = "";
	private int userID = 0;
	private String password = "";
	private String eMail = "";
	private String gender = "";
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//private Calendar myCalendar;
	private String phoneNumber = "";

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	/*
	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	
	public Calendar getMyCalendar() {
		return myCalendar;
	}

	public void setMyCalendar(Calendar myCalendar) {
		this.myCalendar = myCalendar;
	}
*/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public void getUserInfo() {
		System.out.println(getfName());
		System.out.println(getlName());
		System.out.println(getUserID());
		System.out.println(getPassword());
		System.out.println(geteMail());
		//System.out.println(getDateFormat());
		System.out.println(getGender());
		System.out.println(getPhoneNumber());
					
	}
	public void setUserInfo(String fName, String lName, int userID, String password, String eMail, String gender,String phoneNumber) {
		setfName(fName);
		setlName(lName);
		setUserID(userID);
		setPassword(password);
		seteMail(eMail);
		setGender(gender);
		//setMyCalendar(myCalendar);
		setPhoneNumber(phoneNumber);
		
		
		
	

	}
}
