package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="D:\\Selenium_codes\\com.btesMech12\\src\\main\\java\\featurefiles",glue= {"Stepdefination"})	
//@cucumber- is annotation which helps to run the cucumber file, glue = package name of step defination)
public class LogintestRun extends AbstractTestNGCucumberTests {
// here AbstractTestNg- is a inbuilt class in cucumber dependency

}
