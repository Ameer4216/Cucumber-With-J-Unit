package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResellerModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Become a reseller']")

	private WebElement becomeResellerClick;

	@FindBy(xpath = "//input[starts-with(@name,'txt_use')]")

	private WebElement reSellerLoginId;

	@FindBy(xpath = "//input[starts-with(@name,'txt_first')]")

	private WebElement reSellerFirstName;

	@FindBy(xpath = "//input[starts-with(@name,'txt_last')]")

	private WebElement reSellerLastName;

	@FindBy(xpath = "//select[starts-with(@name,'cmb_c')]//option")

	private List<WebElement> reSellerCity;

	@FindBy(xpath = "//input[starts-with(@name,'txt_m')]")

	private WebElement reSellerMobileNumber;

	@FindBy(xpath = "//input[starts-with(@id,'vali')]")

	private WebElement reSellerAboveText;

	@FindBy(xpath = "//input[starts-with(@name,'chk')]")

	private WebElement checkBox;

	@FindBy(xpath = "//input[@type='submit']")

	private WebElement continueClick;

	@FindBy(xpath = "//input[@type='submit']")

	private WebElement continueClick2;

	public ResellerModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getBecomeResellerClick() {

	return becomeResellerClick;

	}

	public WebElement getReSellerLoginId() {

	return reSellerLoginId;

	}

	public WebElement getReSellerFirstName() {

	return reSellerFirstName;

	}

	public WebElement getReSellerLastName() {

	return reSellerLastName;

	}

	public List<WebElement> getReSellerCity() {

	return reSellerCity;

	}

	public WebElement getReSellerMobileNumber() {

	return reSellerMobileNumber;

	}

	public WebElement getReSellerAboveText() {

	return reSellerAboveText;

	}

	public WebElement getCheckBox() {

	return checkBox;

	}

	public WebElement getContinueClick() {

	return continueClick;

	}

	public WebElement getContinueClick2() {

	return continueClick2;

	}
}
