package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtils {


	public String readProperty(String key) {

		String value = null;
		try {
			FileInputStream input = new FileInputStream(
					"C:\\Users\\Naveen\\eclipse-workspace\\CAW Studios\\src\\test\\resources\\Config.Properties");
			Properties prop = new Properties();  
			prop.load(input);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	

	} 






