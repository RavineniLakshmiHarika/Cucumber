package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"C:\\WF\\Automation Workspace\\CucumberProject\\CucumberFramework\\src\\test\\java\\com\\automation\\feature\\objective.feature" }, 
        glue ={"C:\\WF\\Automation Workspace\\CucumberProject\\CucumberFramework\\src\\test\\java\\com\\automation\\stepdefinition\\ObjectivePageSteps.java" }

)

public class TestRunner {
}
