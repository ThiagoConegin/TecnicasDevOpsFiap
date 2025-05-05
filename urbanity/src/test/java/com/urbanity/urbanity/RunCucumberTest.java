package com.urbanity.urbanity;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.urbanity.urbanity",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
