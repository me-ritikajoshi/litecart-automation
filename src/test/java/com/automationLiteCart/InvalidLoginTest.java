package com.automationLiteCart;

import org.testng.annotations.Test;

import com.automationLiteCart.base.BaseClass;
import com.automationLiteCart.pages.InvalidLogin;
import com.automationLiteCart.pages.LoginPage;

public class InvalidLoginTest extends BaseClass {
	
	@Test
	public void verifyInvalidLoginTest() throws InterruptedException {
		
		InvalidLogin login=new InvalidLogin(driver);
		
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
		
	}
}
