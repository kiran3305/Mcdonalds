package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features ="src/test/resources/Feature/Grill.feature",glue={"Stepdefinition"},plugin= {"pretty","html:IssueReport/htmlreport",
		"json:IssueReport/jsonreport.json",
		"junit:IssueReport/xmlreport.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:IssueReport/cucumber-reports/report.html"})

                    
		public class TestNGRunner extends AbstractTestNGCucumberTests{

}