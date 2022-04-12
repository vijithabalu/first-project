package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91819\\eclipse-workspace\\Cucumber\\src\\test\\resources\\FacebookLogin.feature",
dryRun = false,
glue="org.steps",
monochrome=true)
public class TestRunnerClass {

}
