package com.automationLiteCart.base;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationLiteCart.utilities.Utilities;


public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		Utilities.initGlobalConfiguration();
		String browserName= Utilities.getBrowserName();
		
		if(browserName.equals("chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			driver=new FirefoxDriver();
			
		}else if(browserName.equals("edge")) {
			
			driver=new EdgeDriver();
			
		}else {
			
			Reporter.log("Incorrect browser selection. \n Therefore, loading default browser as chrome");
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.get(Utilities.getBaseUrl());
		System.out.println("Press Enter to continue");
		Scanner input=new Scanner(System.in);
		input.nextLine();
		
		
	}
	
	@AfterMethod
	public void closeBrowserSession() {
		
		driver.quit();
	}

}
