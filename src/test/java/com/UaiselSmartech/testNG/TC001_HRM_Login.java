package com.UaiselSmartech.testNG;

import org.testng.annotations.Test;

import com.Uaisel.selenium.java.BasePage;
import com.Uaisel.selenium.java.PageUI;

//import atu.testrecorder.ATUTestRecorder;
//import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.testng.annotations.BeforeTest;

public class TC001_HRM_Login extends BasePage {
	//public ATUTestRecorder recorder;

	@Test(description = "To verify login")
	public void login() throws Exception {
		PageUI p = new PageUI(driver); // has A relation
		p.HRMLogin();

	}

	@BeforeTest
	public void beforeTest() throws Exception {
		//recorder=new ATUTestRecorder("C:\\rec", "HRMLOGIN", false);
		//recorder.start();

		// browsrLaunch("firefox", "https://www.google.com/");
		browsrLaunch("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// browsrLaunch("ie", "https://www.google.com/");
	}

}
