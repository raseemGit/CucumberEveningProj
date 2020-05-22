package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.GlobalClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends GlobalClass {

	// Executes Before For All Scenario
	@Before
	public void beforeScenario(Scenario sc) {

		String scenarioName = sc.getName();

		System.out.println("This is Scenario NAme : " + scenarioName);

	}

	// Executes After For All Scenario
	@After
	public void afterScenario(Scenario sc) {

		Status status = sc.getStatus();

		System.out.println("This Scenario Status : " + status);

		if (sc.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] shot = tk.getScreenshotAs(OutputType.BYTES);

			sc.embed(shot, "failedScenario/png");

		}

	}

}
