package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @description: This class acts as an interlink between cucumber feature files and step definition classes 
 * @author Hariharan
 * @version 1.0
 * @since 11/09/2022
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"stepDefinition"},
		features = "C:/Users/harid/IdeaProjects/APITest/src/main/java/feature/featureFile1.feature"
			)
public class TestRunner {

}