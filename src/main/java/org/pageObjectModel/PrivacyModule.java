package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Privacy']")

	private WebElement privacyClick;

	@FindBy(xpath = "(//a[text()='http://support.rediff.com/'])[1]")

	private WebElement rediffUrlScrollView;

	@FindBy(xpath = "(//a[text()='http://support.rediff.com/'])[1]")

	private WebElement rediffUrlClick;

	@FindBy(xpath = "//input[@id='s']")

	private WebElement issueField;

	@FindBy(xpath = "//input[@id='searchsubmit']")

	private WebElement searchClick;

	public PrivacyModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getPrivacyClick() {

	return privacyClick;

	}

	public WebElement getRediffUrlScrollView() {

	return rediffUrlScrollView;

	}

	public WebElement getRediffUrlClick() {

	return rediffUrlClick;

	}

	public WebElement getIssueField() {

	return issueField;

	}

	public WebElement getSearchClick() {

	return searchClick;

	}
}
