package org.runnerclass;

import org.customreport.CustomReportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\Tagsfile.feature",
					glue = {"org.tagsstepdef"},
					tags = "@Reg"
//					plugin = {"html:target\\CucumberReports\\report1.html","json:target\\CucumberReports\\report2.json"},
//					dryRun = true
					)
public class TestRunnerClass {
	
	
//	@AfterClass
//	public static void generateReport() {
//		CustomReportClass
//		.generateCustomCucumberReport("C:\\Users\\user\\MavenCucumber\\target\\CucumberReports\\report2.json");
//	}
	

}
