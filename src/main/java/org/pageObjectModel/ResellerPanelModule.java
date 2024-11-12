package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResellerPanelModule {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='username_ba']")

	private WebElement serviceMailId;

	@FindBy(xpath = "//input[@id='clpass_ba']")

	private WebElement servicePassword;

	@FindBy(xpath = "//a[text()='Disclaimer']")

	private WebElement disclaimer;

	@FindBy(xpath = "//a[text()='Rediff Home']")

	private WebElement rediffHome;
	
	@FindBy(xpath = "//a[text()='Money']")

	private WebElement moneyModule;
	
	@FindBy(xpath = "//a[text()='Help']")

	private WebElement helpClick;

	public ResellerPanelModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getServiceMailId() {

	return serviceMailId;

	}
	public WebElement getMoneyModule() {

		return moneyModule;

		}
	public WebElement gethelpClick() {

		return helpClick;

		}

	public WebElement getServicePassword() {

	return servicePassword;

	}

	public WebElement getDisclaimer() {

	return disclaimer;

	}

	public WebElement getRediffHome() {

	return rediffHome;

	}
}
