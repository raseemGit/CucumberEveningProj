package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.GlobalClass;

public class LoginPageObjects extends GlobalClass {

	public LoginPageObjects() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement txtBox;

	@FindBy(id = "pass")
	private WebElement passBox;

	@FindBy(id = "loginbutton")
	private WebElement button;

	// ===============================
	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getButton() {
		return button;
	}

}
