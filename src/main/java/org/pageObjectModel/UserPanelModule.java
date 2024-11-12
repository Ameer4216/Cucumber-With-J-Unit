package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPanelModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Reseller Panel']")

	private WebElement reSellerPanel;

	@FindBy(xpath = "//input[starts-with(@id,'username_b')]")

	private WebElement panelUsername;

	@FindBy(xpath = "//input[starts-with(@id,'clpass_b')]")

	private WebElement panelPassword2;

	@FindBy(xpath = "(//input[starts-with(@name,'va')])[2]")

	private WebElement panelAboveText;

	@FindBy(xpath = "//input[@id='remember_r']")

	private WebElement rememberClick2;

	@FindBy(xpath = "(//button[text()='Sign in'])[2]")

	private WebElement signInClick2;

	public UserPanelModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getReSellerPanel() {

	return reSellerPanel;

	}

	public WebElement getPanelUsername() {

	return panelUsername;

	}

	public WebElement getPanelPassword2() {

	return panelPassword2;

	}

	public WebElement getPanelAboveText() {

	return panelAboveText;

	}

	public WebElement getRememberClick2() {

	return rememberClick2;

	}

	public WebElement getSignInClick2() {

	return signInClick2;

	}
}
