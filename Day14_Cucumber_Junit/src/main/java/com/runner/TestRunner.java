package com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\java\\com\\features",
		glue="com.stepdef",
		dryRun=false,
		monochrome=true,
		plugin="html:target",
		tags="@login" // used to run particular scenario
		)


public class TestRunner {

}
