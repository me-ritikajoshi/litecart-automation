package com.automationLiteCart;

import org.testng.annotations.Test;

import com.automationLiteCart.base.BaseClass;
import com.automationLiteCart.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void verifyLoginTest() throws InterruptedException {
		
		LoginPage login=new LoginPage(driver);
		
		login.loginBtn();
		Thread.sleep(3000);

		login.setUserName();
		Thread.sleep(3000);
		
		login.setPassword();
		Thread.sleep(3000);
		
		login.rememberMeBtn();
		Thread.sleep(3000);

		login.submitBtn();
		Thread.sleep(3000);
		
		login.nameBtn();
		Thread.sleep(3000);
		
		login.logoutBtn();
		Thread.sleep(3000);

		
		
	}
	
}
