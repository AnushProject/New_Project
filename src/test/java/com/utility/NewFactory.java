package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFactory {
	public static WebDriver startApplication(WebDriver driver,String browsername,String appUrl) {
		
		
		
		if(browsername.equals("Chrome")){
			driver = new ChromeDriver();
		}else {
			System.err.print("Wrong Browser");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		
		return driver;
		
	}
	public static void quitBrowser (WebDriver driver) {
		driver.close();
	}
	

}
