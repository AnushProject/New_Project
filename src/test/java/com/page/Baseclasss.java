package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.NewFactory;

public class Baseclasss {
 public	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver = NewFactory.startApplication(driver,"Chrome","https://demoblaze.com/#carouselExampleIndicators");
			
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		NewFactory.quitBrowser(driver);
	}
	
	
}
