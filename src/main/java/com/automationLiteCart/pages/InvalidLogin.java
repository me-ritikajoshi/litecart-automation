package com.automationLiteCart.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationLiteCart.base.BaseClass;

public class InvalidLogin extends BaseClass {
	
	WebDriver driver;
	private String secretFilePath="./src/main/java/configs/secret.properties";
	Properties prop;
	FileInputStream credentials;
	
	@FindBy(xpath="//a[contains(.,'Sign In')]")
	WebElement loginBtnElement;
	
	@FindBy(xpath="//input[contains(@name,'username')]")
	WebElement userNameElement;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement passwordElement;
	
	@FindBy(xpath="//input[contains(@name,'remember_me')]")
	WebElement rememberMeElement;
	
	@FindBy(xpath="//button[contains(.,'Sign In')]")
	WebElement submitElement;
	
		
	public InvalidLogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void loadSecretInformation() {
		prop=new Properties();
		try {
			credentials=new FileInputStream(secretFilePath);
			prop.load(credentials);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setUserName() {
		
		userNameElement.sendKeys(getUserName());
	}
	
	public void setPassword() {
		
		passwordElement.sendKeys(getPassword());
	}
	
	public void loginBtn() {
		loginBtnElement.click();
	}
	
	public String getUserName() {
		loadSecretInformation();
		String userName=prop.getProperty("invaliduserName");
		return userName;
	}
	
	public String getPassword() {
		loadSecretInformation();
		String password=prop.getProperty("invalidpassword");
		return password;
	}
	
	public void rememberMeBtn() {
		rememberMeElement.click();
	}
	
	
	public void submitBtn() {
		submitElement.click();
	}
	
	
}
