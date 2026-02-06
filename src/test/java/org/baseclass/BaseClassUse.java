package org.baseclass;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebElement;

public class BaseClassUse extends BaseClass {
	
	public static void main(String[] args) throws IOException, ParseException {
		
//		BaseClass bs = new BaseClass();
////		 object and public access method
//		bs.browserLaunch("https://demo.automationtesting.in/Register.html");
//		
//		// i want to call method directly without object ref
//		browserLaunch("https://demo.automationtesting.in/Register.html");
//		
//		WebElement elementref = findElementXpath("//input[@placeholder='First Name']");
//		
//		sendValues(elementref, "anand");
		
		String dataFromExcelFile = getDataFromExcelFile("C:\\Users\\user\\MavenProject3\\src\\test\\resources\\Excelfiles\\exceldata.xlsx", 
				"datasheet", 0, 4);
		System.out.println(dataFromExcelFile);
		
		
	}

}
