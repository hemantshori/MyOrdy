package com.MyOdryPOS;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options
(format = {"pretty", "html:target/html"},
features = "src/test/feature")
public class RunnerTest {

}
