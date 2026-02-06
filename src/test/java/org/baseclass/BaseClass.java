package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	// reusable, utility, base class
	// 2 things -> input, return (output) - und(return is different from activity / action alone)
	
	// browser lanuch, element finding, sending values to input field, screenshot, data retrival
	
	public static void browserLaunch(String url) {
		// for different browser input use switch case 
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static WebElement findElementXpath(String xpath) {
		WebElement elementxpath = driver.findElement(By.xpath(xpath));
		return elementxpath;
	}
	
	public static void sendValues(WebElement elementref, String data) {
		elementref.sendKeys(data);
	}
	
	public static void screenShot(String path) throws IOException {
		TakesScreenshot tkscr = (TakesScreenshot) driver;
		File source = tkscr.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
	}
	
	// how to read a data from excel file - data driven framework
	static String exceldata;
	public static String getDataFromExcelFile(String pathname, String sheetname, int rownum, int cellnum) throws IOException, ParseException {
//		String exceldata;
		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		
		// use for loop for reading multiple data
		// earlier return type of getCellType() method = int (return 1, 0) ver:3 series
		// 4 series return type of getCellType() method = CellType (return NUMERIC, STRING)
		
		CellType cellType = cell.getCellType();
		System.out.println(cellType+" -->line:73");
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			if ((stringCellValue.matches("\\d{2}-\\d{2}-\\d{4}"))) {
				SimpleDateFormat inputdate = new SimpleDateFormat("dd-MM-yyyy");
				SimpleDateFormat outputdate = new SimpleDateFormat("dd-MMM-yyyy"); // 21-Jan-2026
				Date parse = inputdate.parse(stringCellValue);
				exceldata = outputdate.format(parse); // dont give any concat to string(means date to string)
			}
			else {
				exceldata = (cell.getStringCellValue()+" -->line:85");
			}
			break;

		case NUMERIC:
				double numericCellValue = cell.getNumericCellValue();
				long longValue = (long) numericCellValue;
				exceldata = String.valueOf(longValue+" -->line:92");
			break;
		}
		return exceldata;
	}
	
	// framework 
	// junit -> annotation, assertion
	// POM -> page wise variables, execution
	// testNG -> priority, parallel, groups, data provider, parameter
	// Cucumber -> scenario, outline, few options, hooks, tags
	
	
	

}



