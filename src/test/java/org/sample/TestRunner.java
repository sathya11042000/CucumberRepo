package org.sample;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features",   // path of feature files
    glue = "org.sample",                        // step definition package
    plugin = {
        "pretty", 
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    }
)

public class TestRunner  {
}