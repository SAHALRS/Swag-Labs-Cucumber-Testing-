package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = " @test",features = {"src/test/resources/Features"},
glue = {"project"}, 
plugin = {"pretty","html:target/Login.html"})
public class Test_Runner extends AbstractTestNGCucumberTests {
	
	

}
