package org.rediff.sampleRunnerClass;

import org.openqa.selenium.WebDriver;
import org.reddiff.baseClass.BaseClass;
import org.singletonDesignPattern.PageObjectManager;

public class TestRunnerClasses extends BaseClass{
	
	public static WebDriver driver = BaseClass.browserLaunch("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	

	public static void main(String[] args) throws InterruptedException {

		maximize();
		implicitWait(15);
		getUrl("https://www.rediff.com/");
		
		
		
		
		clickOnElement(pom.getInstanceRediffMailModule().getRediffMailClick());
		sendTheValue(pom.getInstanceRediffMailModule().getUsername(), "admin");
		sendTheValue(pom.getInstanceRediffMailModule().getPassword(), "admin@123");
		clickOnElement(pom.getInstanceRediffMailModule().getSignInClick());
		clickOnElement(pom.getInstanceRediffMailModule().getBackToLoginClick());

		//


		clickOnElement(pom.getInstanceCreateNewAccountModule().getNewAccountClick());
		sendTheValue(pom.getInstanceCreateNewAccountModule().getFullName(), "siva");
		sendTheValue(pom.getInstanceCreateNewAccountModule().getMailId(), "siva123@gmail.com");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCheckAvailability());
		sendTheValue(pom.getInstanceCreateNewAccountModule().getAccountPassword(), "Kumaran@Testers");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getFirstEyeIcon());
		sendTheValue(pom.getInstanceCreateNewAccountModule().getReTypePassword(), "Kumaran@Testers");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getSecondEyeIcon());
		sendTheValue(pom.getInstanceCreateNewAccountModule().getAlternateEmail(), "Kumaran@gmail.com");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCountry());
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllCountries(), "Algeria (+213)");
		sendTheValue(pom.getInstanceCreateNewAccountModule().getRecoverPassword(), "7653766876");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getDayClick());
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllDays(), "24");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getMonthClick());
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllMonths(), "AUG");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getYearClick());
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllYears(), "2020");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getFemaleClick());
		clickOnElement(pom.getInstanceCreateNewAccountModule().getMaleClky());
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCountryClick());
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllCountry(), "China");
		sendTheValue(pom.getInstanceCreateNewAccountModule().getEnterCaptcha(), "Robot");
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCreateAccountClick());

		//

		handleTheSimpleAlert();
		clickOnElement(pom.getInstancePolicyModule().getPolicyClick());
		handleTheWindow(1);
		javaScriptExecutorUsingScrollIntoView(pom.getInstancePolicyModule().getFeedbackScrollView());
		clickOnElement(pom.getInstancePolicyModule().getFeedbackClick());
		handleTheWindow(2);
		sendTheValue(pom.getInstancePolicyModule().getNameField(), "Karuppannan");
		sendTheValue(pom.getInstancePolicyModule().getEmailField(), "Karuppannan123@gmail.com");
		sendTheValue(pom.getInstancePolicyModule().getCommentField(), "All login page is not open");
		sendTheValue(pom.getInstancePolicyModule().getCaptchaEnter(), "Robot2");
		clickOnElement(pom.getInstancePolicyModule().getSubmitClick());

		//

		clickOnElement(pom.getInstanceAdvertiseModule().getAdvertiseClick());
		sendTheValue(pom.getInstanceAdvertiseModule().getRedName(), "Rediff");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedCompany(), "RediffCompany");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedUrl(), "https://clients.rediff.com/rediff_advertisewithus/contact.htm");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedEmail(), "Rediff@gmail.com");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedPhone(), "5464746767");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedUserCity(), "Chennai");
		sendTheValue(pom.getInstanceAdvertiseModule().getRedQuery(), "No Query");
		clickOnElement(pom.getInstanceAdvertiseModule().getSubmitClick1());
		handleTheSimpleAlert();
		navigateBack();

		//

		clickOnElement(pom.getInstancePrivacyModule().getPrivacyClick());
		javaScriptExecutorUsingScrollIntoView(pom.getInstancePrivacyModule().getRediffUrlScrollView());
		clickOnElement(pom.getInstancePrivacyModule().getRediffUrlClick());
		handleTheWindow(3);
		sendTheValue(pom.getInstancePrivacyModule().getIssueField(), "I have lot of issues about the rediff website");
		clickOnElement(pom.getInstancePrivacyModule().getSearchClick());

		//
		
		clickOnElement(pom.getInstanceResellerModule().getBecomeResellerClick());
		sendTheValue(pom.getInstanceResellerModule().getReSellerLoginId(), "uewyrye@gmail.com");
		sendTheValue(pom.getInstanceResellerModule().getReSellerFirstName(), "Karthick");
		sendTheValue(pom.getInstanceResellerModule().getReSellerLastName(), "Raja");
		forEachLoopUsingSelectTheDropDown(pom.getInstanceResellerModule().getReSellerCity(), "Salem");
		sendTheValue(pom.getInstanceResellerModule().getReSellerMobileNumber(), "9578603452");
		sendTheValue(pom.getInstanceResellerModule().getReSellerAboveText(), "Hi how are You?");
		clickOnElement(pom.getInstanceResellerModule().getCheckBox());
		clickOnElement(pom.getInstanceResellerModule().getContinueClick());
		clickOnElement(pom.getInstanceResellerModule().getContinueClick2());

		//

		handleTheSimpleAlert();
		clickOnElement(pom.getInstanceBuyNowModule().getBuyNowClick());
		clickOnElement(pom.getInstanceBuyNowModule().getLoginClick());
		sendTheValue(pom.getInstanceBuyNowModule().getPanelEmail(), "hfhuhf@gmail.com");
		sendTheValue(pom.getInstanceBuyNowModule().getPanelPassword(), "Kumaran@Test");
		sendTheValue(pom.getInstanceBuyNowModule().getPanelCaptcha(), "Robot3");
		clickOnElement(pom.getInstanceBuyNowModule().getRememberClick());
		clickOnElement(pom.getInstanceBuyNowModule().getForgotPassword());

		//

		
		handleTheWindow(4);
		maximize();
		sendTheValue(pom.getInstanceSignInModule().getForgotUserName(), "Reena");
		clickOnElement(pom.getInstanceSignInModule().getPleaseContinueClick());
		driverClose();
		handleTheWindow(3);
		clickOnElement(pom.getInstanceSignInModule().getSignClick());
		sendTheValue(pom.getInstanceSignInModule().getUserEmail(), "Reena@gmail.com");
		sendTheValue(pom.getInstanceSignInModule().getUserPassword(), "Reena@gmail.com");
		navigateBack();

		//

		clickOnElement(pom.getInstanceUserPanelModule().getReSellerPanel());
		sendTheValue(pom.getInstanceUserPanelModule().getPanelUsername(), "Reena@gmail.com");
		sendTheValue(pom.getInstanceUserPanelModule().getPanelPassword2(), "Reena@123");
		sendTheValue(pom.getInstanceUserPanelModule().getPanelAboveText(), "Hi Reena!");
		clickOnElement(pom.getInstanceUserPanelModule().getRememberClick2());
		clickOnElement(pom.getInstanceUserPanelModule().getSignInClick2());
		//

		sendTheValue(pom.getInstanceResellerPanelModule().getServiceMailId(), "Hi Reena!");
		sendTheValue(pom.getInstanceResellerPanelModule().getServicePassword(), "Hi Reena!");
		clickOnElement(pom.getInstanceResellerPanelModule().getDisclaimer());
		handleTheWindow(4);
		clickOnElement(pom.getInstanceResellerPanelModule().getRediffHome());
		handleTheWindow(5);
		clickOnElement(pom.getInstanceResellerPanelModule().getMoneyModule());
		driverClose();
		handleTheWindow(4);
		clickOnElement(pom.getInstanceResellerPanelModule().gethelpClick());
		navigateBack();
		driverClose();
		handleTheWindow(3);
		driverClose();
		handleTheWindow(2);
		driverClose();
		handleTheWindow(1);
		driverClose();
		handleTheWindow(0);


	}
}
