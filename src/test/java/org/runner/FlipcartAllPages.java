package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Britto\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\FlipkartAllPage.feature", glue = "org.stepdef")
public class FlipcartAllPages {
	
}
