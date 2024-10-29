package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.Baseclasss;
//import com.page.Loginpage;
import com.page.NewLoginpage;

public class NewLogin extends Baseclasss {
	
	
	@Test
	public void Log_in() {
		
		NewLoginpage Logpage = PageFactory.initElements(driver, NewLoginpage.class);
		Logpage.loginTosite("Rohn","Rohn12");
	}
	
	
	

}
