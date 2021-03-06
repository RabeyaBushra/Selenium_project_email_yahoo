package com.commonFunction;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.objectRepositery.ObjectRepository_xpath;
import com.utilities.PageActions;

public class ResuableFunction extends PageActions {
	ExtentReports extent;
	ExtentTest test;
	
	public static void enterUserID() {
		String userName = getData.getCellData(sheetName, startIter, "UserId");
		
		getElement("Yahoo login page","User Id Textbox Found",(By.xpath(ObjectRepository_xpath.yahooUserName)),defaultElementLoadTime,"sendKeys",userName);
	}
	public static void clickUserIdSignIn() {
		
		getElement("Yahoo login page","User Id sign in button Found",(By.xpath(ObjectRepository_xpath.yahooUserSignIn)),defaultElementLoadTime,"click","");
	}
	
	public static void enterUserPassword() {
		String password = getData.getCellData(sheetName, startIter, "Password");
		
		getElement("Yahoo login page","Password Textbox Found",(By.xpath(ObjectRepository_xpath.yahooPassWord)),defaultElementLoadTime,"sendKeys",password);
	}
	
public static void clickPasswordSignIn() {
		
		getElement("Yahoo login page","User password signin button Found",(By.xpath(ObjectRepository_xpath.yahooPassSignIn)),defaultElementLoadTime,"click","");
	}
		

}
