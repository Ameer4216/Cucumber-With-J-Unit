package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountModule {

	public static WebDriver driver;

	@FindBy(xpath = "//u[contains(text(),'C')]")

	private WebElement newAccountClick;

	@FindBy(xpath = "//input[starts-with(@name,'name')]")

	private WebElement fullName;

	@FindBy(xpath = "//input[starts-with(@name,'login')]")

	private WebElement mailId;

	@FindBy(xpath = "//input[starts-with(@name,'btnchka')]")

	private WebElement checkAvailability;

	@FindBy(xpath = "//input[@id='newpasswd']")

	private WebElement accountPassword;

	@FindBy(xpath = "//em[@id='eyeiconNew']")

	private WebElement firstEyeIcon;

	@FindBy(xpath = "//input[starts-with(@name,'confirm_pas')]")

	private WebElement reTypePassword;

	@FindBy(xpath = "//em[@id='eyeiconRe']")

	private WebElement secondEyeIcon;

	@FindBy(xpath = "//input[starts-with(@name,'altem')]")

	private WebElement alternateEmail;

	@FindBy(xpath = "//div[starts-with(@onclick,'java')]")

	private WebElement country;

	@FindBy(xpath = "//div[@id='country_id']//li")

	private List<WebElement> allCountries;

	@FindBy(xpath = "//input[starts-with(@name,'mob')]")

	private WebElement recoverPassword;

	@FindBy(xpath = "//select[starts-with(@name,'DOB_Day')]")

	private WebElement dayClick;

	@FindBy(xpath = "//select[starts-with(@name,'DOB_Day')]//option")

	private List<WebElement> allDays;

	@FindBy(xpath = "//select[starts-with(@name,'DOB_Month')]")

	private WebElement monthClick;

	@FindBy(xpath = "(//select[starts-with(@name,'DOB')])[2]//option")

	private List<WebElement> allMonths;

	@FindBy(xpath = "//select[starts-with(@name,'DOB_Year')]")

	private WebElement yearClick;

	@FindBy(xpath = "(//select[starts-with(@name,'DOB')])[3]//option")

	private List<WebElement> allYears;

	@FindBy(xpath = "(//input[starts-with(@name,'gender')])[2]")

	private WebElement femaleClick;

	@FindBy(xpath = "(//input[starts-with(@name,'gender')])[1]")

	private WebElement maleClky;

	@FindBy(xpath = "//select[@id='country']")

	private WebElement countryClick;

	@FindBy(xpath = "//select[@id='country']//option")

	private List<WebElement> allCountry;

	@FindBy(xpath = "//input[starts-with(@class,'captcha')]")

	private WebElement enterCaptcha;

	@FindBy(xpath = "//input[@id='Register']")

	private WebElement createAccountClick;

	public CreateNewAccountModule(WebDriver driver) {

	this.driver = driver;

	PageFactory.initElements(driver, this);

	}

	public WebElement getNewAccountClick() {

	return newAccountClick;

	}

	public WebElement getFullName() {

	return fullName;

	}

	public WebElement getMailId() {

	return mailId;

	}

	public WebElement getCheckAvailability() {

	return checkAvailability;

	}

	public WebElement getAccountPassword() {

	return accountPassword;

	}

	public WebElement getFirstEyeIcon() {

	return firstEyeIcon;

	}

	public WebElement getReTypePassword() {

	return reTypePassword;

	}

	public WebElement getSecondEyeIcon() {

	return secondEyeIcon;

	}

	public WebElement getAlternateEmail() {

	return alternateEmail;

	}

	public WebElement getCountry() {

	return country;

	}

	public List<WebElement> getAllCountries() {

	return allCountries;

	}

	public WebElement getRecoverPassword() {

	return recoverPassword;

	}

	public WebElement getDayClick() {

	return dayClick;

	}

	public List<WebElement> getAllDays() {

	return allDays;

	}

	public WebElement getMonthClick() {

	return monthClick;

	}

	public List<WebElement> getAllMonths() {

	return allMonths;

	}

	public WebElement getYearClick() {

	return yearClick;

	}

	public List<WebElement> getAllYears() {

	return allYears;

	}

	public WebElement getFemaleClick() {

	return femaleClick;

	}

	public WebElement getMaleClky() {

	return maleClky;

	}

	public WebElement getCountryClick() {

	return countryClick;

	}

	public List<WebElement> getAllCountry() {

	return allCountry;

	}

	public WebElement getEnterCaptcha() {

	return enterCaptcha;

	}

	public WebElement getCreateAccountClick() {

	return createAccountClick;

	}
}
