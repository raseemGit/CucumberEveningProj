package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GlobalClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		//WebDriverManager.firefoxdriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Library\\Chrome81\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void typeValue(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickButton(WebElement element) {
		element.click();

	}

	public static void quiteBrowser() {

		driver.quit();

	}

}
