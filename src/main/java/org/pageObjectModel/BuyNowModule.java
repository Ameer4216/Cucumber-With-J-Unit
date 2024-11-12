package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Buy Now']")

	private WebElement buyNowClick;

	@FindBy(xpath = "(//a[text()='Login'])[2]")

	private WebElement loginClick;

	@FindBy(xpath = "//input[starts-with(@id,'username_d')]")

	private WebElement panelEmail;

	@FindBy(xpath = "//input[starts-with(@id,'clpass_d')]")

	private WebElement panelPassword;

	@FindBy(xpath = "(//input[starts-with(@class,'rw-p')])[1]")

	private WebElement panelCaptcha;

	@FindBy(xpath = "(//input[starts-with(@id,'rem')])[1]")

	private WebElement rememberClick;

	@FindBy(xpath = "(//a[text()='Forgot Password?'])[1]")

	private WebElement forgotPassword;

	public BuyNowModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getBuyNowClick() {

	return buyNowClick;

	}

	public WebElement getLoginClick() {

	return loginClick;

	}

	public WebElement getPanelEmail() {

	return panelEmail;

	}

	public WebElement getPanelPassword() {

	return panelPassword;

	}

	public WebElement getPanelCaptcha() {

	return panelCaptcha;

	}

	public WebElement getRememberClick() {

	return rememberClick;

	}

	public WebElement getForgotPassword() {

	return forgotPassword;

	}
}
