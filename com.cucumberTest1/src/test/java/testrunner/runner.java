package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-workspace\\com.cucumberTest1\\Features\\", dryRun = false, glue = "stepDefinitions", plugin = {
		"pretty", "html:target/cucumber-reports.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, tags = "@negative_testcase")
public class runner {

}