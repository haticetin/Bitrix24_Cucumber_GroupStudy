package com.nextbasecrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/nextbasecrm/step_definitions",
        dryRun = false, // method içine girmedn run ediyordu ,eksik stepleri yazdırmak kullan!
        tags = "@wip"

)
public class CukesRunner {

}
