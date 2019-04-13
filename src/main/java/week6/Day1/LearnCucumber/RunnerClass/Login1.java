package week6.Day1.LearnCucumber.RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/main/java/week6/Day1/LearnCucumber/features/Login.feature",
						glue="week6/Day1/LearnCucumber/ImplementClass",
						monochrome=true)
//dryRun=true,
//snippets=SnippetType.CAMELCASE

public class Login1 extends AbstractTestNGCucumberTests {

}
