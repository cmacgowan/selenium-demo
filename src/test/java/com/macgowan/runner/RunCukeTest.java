package com.macgowan.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by macgowan on 3/23/17.
 */

@RunWith(Cucumber.class)

@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.macgowan",
        tags = "@Regression",
        features = "classpath:features"
)
public class RunCukeTest
{
}

