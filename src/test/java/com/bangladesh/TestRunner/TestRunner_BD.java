package com.bangladesh.TestRunner;






import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bangladesh.Util.TestBase_BD;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/recources/Featuresssss"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDepBD", tags= {"@BD"})

public class TestRunner_BD extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void LaunchApplicationURL() {
		TestBase_BD lunch= new TestBase_BD();
		lunch.initz();
		
		
	}
	
	@AfterTest
	public void CloseApplicationURL() {
		TestBase_BD lunch = new TestBase_BD();	
		lunch.driver.quit();
		
	}
	
		

}
