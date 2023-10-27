package com.engine;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.utilities.WebUtils;

public class BaseClass extends WebUtils{

	@BeforeMethod()
	public void beforemethod() {
		browserlaunch(readProperty("browser"));
		geturl(readProperty("url"));
	}

	@AfterMethod()
	public void aftermethod() {
		browserClose();
		


	}

}
