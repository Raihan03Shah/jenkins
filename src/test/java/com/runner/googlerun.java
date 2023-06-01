package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\jenkins\\src\\test\\java\\com\\feature",
glue = "com.stepdefnition", plugin = {"html:Reports/Cucumber_Report.html","pretty",
		"json:Reports/JsonFile.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class googlerun {

}
