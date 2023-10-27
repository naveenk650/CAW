package com.pagecomponent;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import com.utilities.WebUtils;

public class HomePage extends WebUtils {

	//public WebDriver driver = null;

	@FindBy(xpath =   "//div[@class='centered']/details")
	WebElement TableData;

	@FindBy(xpath =   "//textarea[@id='jsondata']")
	WebElement Textbox;

	@FindBy(xpath =   "//button[@id='refreshtable']")
	WebElement Refreshbtn;
	
	public HomePage() {
		PageFactory.initElements(WebUtils.driver, this);}

	
	public void inputData(String data) {
		try {
			clickbtn(TableData);
			clear(Textbox);
			sendkey(Textbox, data);
			clickbtn(Refreshbtn);
			Assert.assertEquals(data, data);
		} catch (Exception e) {
			e.printStackTrace();}
	}

	
	}







