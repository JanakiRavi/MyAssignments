package week7assignment.runner;

import io.cucumber.testng.CucumberOptions;
import week7assignment.steps.BaseClass;

@CucumberOptions(features="src/test/java/week7assignment/features/CreateAccounts.feature",
			monochrome = true,glue="week7assignment.steps",publish = true)
public class CucumberRunner extends BaseClass{

}
