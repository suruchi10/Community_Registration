package com.usgbc.dev;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver =null;
	
	@BeforeMethod
	public WebDriver  getDriver(String url) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox Launched ");
		driver.get(url);
		return driver;
	}
	
	@AfterMethod
	public WebDriver  closeDriver() {
		driver.quit();
		System.out.println("Browser Closed");
		return driver;
	}
	
}
