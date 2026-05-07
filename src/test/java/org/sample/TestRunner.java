package org.sample;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features",   // path of feature files
    glue = "org.sample",
    		plugin = {
    		        "pretty",
    		        "html:target/cucumber-reports.html",
    		        "json:target/cucumber.json",
    		        "junit:target/cucumber.xml"
    		    }
   
)

public class TestRunner  {
}