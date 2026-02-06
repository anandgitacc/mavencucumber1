package org.hooks;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void browserLaunch() {
		browserLaunch("https://www.facebook.com/");
		System.out.println("browser launch successful");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
		System.out.println("user checking unsuccessful / error message");
	}

}
