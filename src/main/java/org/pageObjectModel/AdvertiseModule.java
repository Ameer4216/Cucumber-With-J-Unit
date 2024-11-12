package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertiseModule {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Advertise']")

	private WebElement advertiseClick;

	@FindBy(xpath = "//input[@id='firstname']")

	private WebElement redName;

	@FindBy(xpath = "//input[@id='company_name']")

	private WebElement redCompany;

	@FindBy(xpath = "//input[@id='company_url']")

	private WebElement redUrl;

	@FindBy(xpath = "//input[@id='email']")

	private WebElement redEmail;

	@FindBy(xpath = "//input[@id='phone']")

	private WebElement redPhone;

	@FindBy(xpath = "//input[@id='user_city']")

	private WebElement redUserCity;

	@FindBy(xpath = "//textarea[@id='company_query']")

	private WebElement redQuery;

	@FindBy(xpath = "//input[starts-with(@type,'sub')]")

	private WebElement submitClick1;

	public AdvertiseModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getAdvertiseClick() {

	return advertiseClick;

	}

	public WebElement getRedName() {

	return redName;

	}

	public WebElement getRedCompany() {

	return redCompany;

	}

	public WebElement getRedUrl() {

	return redUrl;

	}

	public WebElement getRedEmail() {

	return redEmail;

	}

	public WebElement getRedPhone() {

	return redPhone;

	}

	public WebElement getRedUserCity() {

	return redUserCity;

	}

	public WebElement getRedQuery() {

	return redQuery;

	}

	public WebElement getSubmitClick1() {

	return submitClick1;

	}
}
