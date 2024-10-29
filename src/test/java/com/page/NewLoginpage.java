package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginpage {
	WebDriver driver;
	
	public void new_log(WebDriver ldriver) {
		this.driver = ldriver;
		
		
	}
	
	@FindBy(id="login2")
	WebElement btn;
	
	@FindBy(id="loginusername")
	WebElement user;
	
	@FindBy(id="loginpassword")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement clk;
	
	
	public void loginTosite(String User , String passs) {
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException g) {
			g.printStackTrace();
		}
		btn.click();
		user.sendKeys(User);
		pass.sendKeys(passs);
		clk.click();
		
		
		
	}

}
