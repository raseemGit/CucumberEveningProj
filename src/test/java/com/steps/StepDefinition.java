package com.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.base.GlobalClass;
import com.objects.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends GlobalClass {

	WebDriver driver;

	@Given("user laucnh chrome browser")
	public void user_laucnh_chrome_browser() {

		System.out.println("user laucnh chrome browser");

		// System.out.println("");
		// driver = launchBrowser();
	}

	@Given("user enter url")
	public void user_enter_url() {
		System.out.println("user enter url");
		// loadUrl("https://www.facebook.com/");
	}

	/*
	 * @When("user enter {string} and {string}") public void user_enter_and(String
	 * s1, String s2) { System.out.println("");
	 * 
	 * LoginPageObjects obj = new LoginPageObjects();
	 * 
	 * typeValue(obj.getTxtBox(), s1); typeValue(obj.getPassBox(), s2);
	 * 
	 * }
	 */

	/*
	 * //One D List
	 * 
	 * @When("user enter userName and passWord") public void
	 * user_enter_userName_and_passWord(io.cucumber.datatable.DataTable onedList) {
	 * 
	 * List<String> li = onedList.asList();
	 * 
	 * LoginPageObjects obj = new LoginPageObjects();
	 * 
	 * typeValue(obj.getTxtBox(), li.get(1)); typeValue(obj.getPassBox(),
	 * li.get(4));
	 * 
	 * }
	 */

	/*
	 * // Oned MAp
	 * 
	 * @When("user enter userName and passWord") public void
	 * user_enter_userName_and_passWord(io.cucumber.datatable.DataTable onedMap) {
	 * 
	 * Map<String, String> mp = onedMap.asMap(String.class, String.class);
	 * 
	 * LoginPageObjects obj = new LoginPageObjects();
	 * 
	 * typeValue(obj.getTxtBox(), mp.get("username2")); typeValue(obj.getPassBox(),
	 * mp.get("pass2"));
	 * 
	 * }
	 */

	/*
	 * // Twod List
	 * 
	 * @When("user enter userName and passWord") public void
	 * user_enter_userName_and_passWord(io.cucumber.datatable.DataTable twoDList) {
	 * 
	 * List<List<String>> li = twoDList.asLists();
	 * 
	 * LoginPageObjects obj = new LoginPageObjects();
	 * 
	 * typeValue(obj.getTxtBox(), li.get(2).get(2)); typeValue(obj.getPassBox(),
	 * li.get(1).get(2));
	 * 
	 * }
	 */

	// Twod Map
	@When("user enter userName and passWord")
	public void user_enter_userName_and_passWord(io.cucumber.datatable.DataTable twoDMap) {

		System.out.println("user enter userName and passWord");

		/*
		 * List<Map<String, String>> mp = twoDMap.asMaps();
		 * 
		 * LoginPageObjects obj = new LoginPageObjects();
		 * 
		 * typeValue(obj.getTxtBox(), mp.get(0).get("empEmailId"));
		 * typeValue(obj.getPassBox(), mp.get(1).get("empName"));
		 */

	}

	@When("user click login button")
	public void user_click_login_button() {

		System.out.println("user click login button");

		/*
		 * LoginPageObjects obj = new LoginPageObjects();
		 * 
		 * clickButton(obj.getButton());
		 */
	}

	@Then("user verify result")
	public void user_verify_result() {

		System.out.println("Test PAss");

	}

	@Then("user verify result scenario two")
	public void user_verify_result_scenario_two() {
		Assert.assertTrue(false);

	}

	/*
	 * @When("user enter invalid credintial") public void
	 * user_enter_invalid_credintial() { //*
	 * System.out.println("user enter invalid credintial"); }
	 * 
	 * @When("user enter invalid credintial two") public void
	 * user_enter_invalid_credintial_two() {
	 * System.out.println("user enter invalid credintial two"); }
	 */

}
