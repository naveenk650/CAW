package com.utilities;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtils extends FileUtils{

	public static WebDriver driver = null;
	public static boolean browserlaunch(String value) {
		boolean flag = false;
		try {
			switch (value) {
			case  "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				flag = true;
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				flag = true;
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				flag = true;
				break;
			case "Safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				flag = true;
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return flag;
	}

	public static void browserClose() {

		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void  implicitWait(int value) {

		try {
			driver.manage().timeouts().implicitlyWait(value,TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void explicitWait(WebElement element, int value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, value);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void geturl(String value) {

		try {
			driver.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickbtn(WebElement element) {

		try {
			explicitWait(element, 5);
			element.click();

		} catch (Exception e) {
			e.printStackTrace();}
		}

		public static void clear(WebElement element) {

			try {
				explicitWait(element, 5);
				element.clear();

			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static void sendkey(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getText(WebElement element) {
		String value = null;
		try {
			value = element.getText();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return value;
	}}




























































































