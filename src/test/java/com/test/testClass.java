package com.test;
import org.testng.annotations.Test;
import com.engine.BaseClass;
import com.pagecomponent.HomePage;

public class testClass extends BaseClass {

	@Test
	public void testDataValidation(){
		try {
			HomePage obj = new HomePage();
			obj.inputData(readProperty("Data"));
		} catch (Exception e) {
			e.printStackTrace();}}}



