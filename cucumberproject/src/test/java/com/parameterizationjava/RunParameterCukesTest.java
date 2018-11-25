package com.parameterizationjava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )


//In the following options we can specify multiple feature files and glue code by comma seperated strings, we can run it
//If we have same StepDef name, then Cucumber wont run it
@CucumberOptions(features = {"src/test/resources/com/parameterization/" },
					glue={"com/parameterizationjava/"},  //glue means java code
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1676+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							}
					)







public class RunParameterCukesTest {
}