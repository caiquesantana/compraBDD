package br.com.rsinet.hub_bdd.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "Feature"
		 ,glue="br.com.rsinet.hub_bdd.stepDefinition"
			, monochrome = true
			, dryRun = false
			, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\caique.oliveira\\eclipse-workspace\\compraBDD\\Report\\report.html"}
//			, tags = "@BuscaHomeFalha"
			)

public class TestRunner {
	@AfterClass
	public static void Report(){
		Reporter.loadXMLConfig(new File("C:\\Users\\caique.oliveira\\eclipse-workspace\\compraBDD\\report.xml"));
	}

}
