package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffMailModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Rediffmail']")

	private WebElement rediffMailClick;

	@FindBy(xpath = "//input[@id='login1']")

	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")

	private WebElement password;

	@FindBy(xpath = "//input[@name='proceed']")

	private WebElement signInClick;

	@FindBy(xpath = "//a[text()='« Back to login page']")

	private WebElement backToLoginClick;

	public RediffMailModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getRediffMailClick() {

	return rediffMailClick;

	}

	public WebElement getUsername() {

	return username;

	}

	public WebElement getPassword() {

	return password;

	}

	public WebElement getSignInClick() {

	return signInClick;

	}

	public WebElement getBackToLoginClick() {

	return backToLoginClick;

	}
}
