package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInModule {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='login']")

	private WebElement forgotUserName;

	@FindBy(xpath = "//input[starts-with(@value,'Please Continue')]")

	private WebElement pleaseContinueClick;

	@FindBy(xpath = "(//button[starts-with(@class,'m')])[1]")

	private WebElement signClick;

	@FindBy(xpath = "//input[starts-with(@id,'us')]")

	private WebElement userEmail;

	@FindBy(xpath = "//input[starts-with(@id,'cl')]")

	private WebElement userPassword;

	public SignInModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getForgotUserName() {

	return forgotUserName;

	}

	public WebElement getPleaseContinueClick() {

	return pleaseContinueClick;

	}

	public WebElement getSignClick() {

	return signClick;

	}

	public WebElement getUserEmail() {

	return userEmail;

	}

	public WebElement getUserPassword() {

	return userPassword;

	}
}
