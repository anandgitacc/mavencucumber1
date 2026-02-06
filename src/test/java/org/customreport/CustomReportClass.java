package org.customreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CustomReportClass {
	
	public static void generateCustomCucumberReport(String jsonFile) {
		
		File file = new File("C:\\Users\\user\\MavenCucumber\\target\\CucumberReports\\CustomReport");
		
		Configuration configuration = new Configuration(file, "Facebook functionality validation");
		configuration.addClassifications("Browser Name", "Chrome");
		configuration.addClassifications("Version Name", "v 2.3.1");
		configuration.addClassifications("Sprint Number", "04");
		configuration.addClassifications("Test Number", "02");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
	}

}
