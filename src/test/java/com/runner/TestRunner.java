package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\FeaturesFolder" }, glue = { "com.steps" }, dryRun = false, tags = {
		"@login" }, plugin = { "pretty", "json:src\\test\\resources\\jsonReport\\cucumberJsonRepo.json",
				"rerun:src\\test\\resources\\FeaturesFolder\\failedFeature.txt" }, monochrome = true)
public class TestRunner {

	@AfterClass
	public static void afterScenario() {

		JVMClass.jvmReportGenerate(
				System.getProperty("user.dir") + "\\src\\test\\resources\\jsonReport\\cucumberJsonRepo.json");

	}

}
