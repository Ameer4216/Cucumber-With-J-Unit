package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='privacy policy']")

	private WebElement policyClick;

	@FindBy(xpath = "//a[text()='feedback form']")

	private WebElement feedbackScrollView;

	@FindBy(xpath = "//a[text()='feedback form']")

	private WebElement feedbackClick;

	@FindBy(xpath = "//input[@name='username']")

	private WebElement nameField;

	@FindBy(xpath = "//input[@name='emailId']")

	private WebElement emailField;

	@FindBy(xpath = "//textarea[@name='comments']")

	private WebElement commentField;

	@FindBy(xpath = "//input[@name='captcha']")

	private WebElement captchaEnter;

	@FindBy(xpath = "//input[@value='Submit']")

	private WebElement submitClick;

	public PolicyModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getPolicyClick() {

	return policyClick;

	}

	public WebElement getFeedbackScrollView() {

	return feedbackScrollView;

	}

	public WebElement getFeedbackClick() {

	return feedbackClick;

	}

	public WebElement getNameField() {

	return nameField;

	}

	public WebElement getEmailField() {

	return emailField;

	}

	public WebElement getCommentField() {

	return commentField;

	}

	public WebElement getCaptchaEnter() {

	return captchaEnter;

	}

	public WebElement getSubmitClick() {

	return submitClick;

	}
}
