package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Britto\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\Facebooklogin.feature",
glue = "org.stepdef", monochrome=true)
public class TestRunnerClass {

}
