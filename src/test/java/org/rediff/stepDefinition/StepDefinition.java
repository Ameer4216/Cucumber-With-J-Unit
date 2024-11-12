package org.rediff.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.reddiff.baseClass.BaseClass;
import org.rediff.testRunnerClass.TestRunnerClass;
import org.singletonDesignPattern.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass{
	public static WebDriver driver = TestRunnerClass.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user Launch The Rediff Website Url In The Chrome Browser$")
	public void user_Launch_The_Rediff_Website_Url_In_The_Chrome_Browser() throws Throwable {
		getUrl("https://www.rediff.com/");

	}

	@When("^user Click The Rediff Mail Module$")
	public void user_Click_The_Rediff_Mail_Module() throws Throwable {
		clickOnElement(pom.getInstanceRediffMailModule().getRediffMailClick());

	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		sendTheValue(pom.getInstanceRediffMailModule().getUsername(), "admin");

	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceRediffMailModule().getPassword(), "admin@123");

	}

	@When("^user Click The SignIn button$")
	public void user_Click_The_SignIn_button() throws Throwable {
		clickOnElement(pom.getInstanceRediffMailModule().getSignInClick());

	}

	@Then("^user Click The Back To Send button and Navigate To Createnew Account Module$")
	public void user_Click_The_Back_To_Send_button_and_Navigate_To_Createnew_Account_Module() throws Throwable {
		clickOnElement(pom.getInstanceRediffMailModule().getBackToLoginClick());

	}

	@When("^user Click The Create New Account Module$")
	public void user_Click_The_Create_New_Account_Module() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getNewAccountClick());
		
		

	}

	@When("^user Enter The Fullname In The Fullname Field$")
	public void user_Enter_The_Fullname_In_The_Fullname_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getFullName(), "siva");
		
	}

	@When("^user Enter The Mailid In The Mailid Field$")
	public void user_Enter_The_Mailid_In_The_Mailid_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getMailId(), "siva123@gmail.com");

	}

	@When("^user Click The Check Availability button$")
	public void user_Click_The_Check_Availability_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCheckAvailability());

	}

	@When("^user Enter The Account Password In The Account Password Field$")
	public void user_Enter_The_Account_Password_In_The_Account_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getAccountPassword(), "Kumaran@Testers");

	}

	@When("^user Click The First Eyecon button$")
	public void user_Click_The_First_Eyecon_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getFirstEyeIcon());

	}

	@When("^user Enter The Password In The Retype Password Field$")
	public void user_Enter_The_Password_In_The_Retype_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getReTypePassword(), "Kumaran@Testers");
	}

	@When("^user Click The Second Eyecon button$")
	public void user_Click_The_Second_Eyecon_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getSecondEyeIcon());

	}

	@When("^user Enter The Emailid In The Alternate Email Field$")
	public void user_Enter_The_Emailid_In_The_Alternate_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getAlternateEmail(), "Kumaran@gmail.com");

	}

	@When("^user Click The Mobile Number Field$")
	public void user_Click_The_Mobile_Number_Field() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCountry());

	}

	@When("^user Select The Algeria country From Country DropDown$")
	public void user_Select_The_Algeria_country_From_Country_DropDown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllCountries(), "Algeria (+213)");
		
	}

	@When("^user Enter The Password In The Recover Password Field$")
	public void user_Enter_The_Password_In_The_Recover_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getRecoverPassword(), "7653766876");

	}

	@When("^user Click The Day DropDown button$")
	public void user_Click_The_Day_DropDown_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getDayClick());

	}

	@When("^user Select The Twenty Fourth Day From Day DropDown$")
	public void user_Select_The_Twenty_Fourth_Day_From_Day_DropDown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllDays(), "24");

	}

	@When("^user Click The Month DropDown button$")
	public void user_Click_The_Month_DropDown_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getMonthClick());

	}

	@When("^user Select The Augest Month From Month DropDown$")
	public void user_Select_The_Augest_Month_From_Month_DropDown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllMonths(), "AUG");

	}

	@When("^user Click The Year DropDown button$")
	public void user_Click_The_Year_DropDown_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getYearClick());

	}

	@When("^user Select The Two Thousand Twentyth Year From Year DropDown$")
	public void user_Select_The_Two_Thousand_Twentyth_Year_From_Year_DropDown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllYears(), "2020");
	}

	@When("^user Click The Female Radio button$")
	public void user_Click_The_Female_Radio_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getFemaleClick());

	}

	@When("^user Click The Male Radio button$")
	public void user_Click_The_Male_Radio_button() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getMaleClky());

	}

	@When("^user Click The Live In All Country Dropdown$")
	public void user_Click_The_Live_In_All_Country_Dropdown() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCountryClick());

	}

	@When("^user Select The China Country From All Country Dropdown$")
	public void user_Select_The_China_Country_From_All_Country_Dropdown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceCreateNewAccountModule().getAllCountry(), "China");

	}

	@When("^user Enter The Captcha In Captcha Field$")
	public void user_Enter_The_Captcha_In_Captcha_Field() throws Throwable {
		sendTheValue(pom.getInstanceCreateNewAccountModule().getEnterCaptcha(), "Robot");

	}

	@Then("^user Click The Click My Account button and Navigate To Policy Module$")
	public void user_Click_The_Click_My_Account_button_and_Navigate_To_Policy_Module() throws Throwable {
		clickOnElement(pom.getInstanceCreateNewAccountModule().getCreateAccountClick());

	}

	@When("^user Handle The Simple Alert$")
	public void user_Handle_The_Simple_Alert() throws Throwable {
		handleTheSimpleAlert();

	}

	@When("^user Click The Policy Link$")
	public void user_Click_The_Policy_Link() throws Throwable {
		clickOnElement(pom.getInstancePolicyModule().getPolicyClick());

	}

	@When("^user Navigate To Second Window$")
	public void user_Navigate_To_Second_Window() throws Throwable {
		handleTheWindow(1);

	}

	@When("^user Scroll Into View The Feedback Link$")
	public void user_Scroll_Into_View_The_Feedback_Link() throws Throwable {
		javaScriptExecutorUsingScrollIntoView(pom.getInstancePolicyModule().getFeedbackScrollView());

	}

	@When("^user Click The Feedback Link$")
	public void user_Click_The_Feedback_Link() throws Throwable {
		clickOnElement(pom.getInstancePolicyModule().getFeedbackClick());

	}

	@When("^user Navigate To Third Window$")
	public void user_Navigate_To_Third_Window() throws Throwable {
		handleTheWindow(2);

	}

	@When("^User Enter The Name In The Name Field$")
	public void user_Enter_The_Name_In_The_Name_Field() throws Throwable {
		sendTheValue(pom.getInstancePolicyModule().getNameField(), "Karuppannan");

	}

	@When("^User Enter The Email In The Email Field$")
	public void user_Enter_The_Email_In_The_Email_Field() throws Throwable {
		sendTheValue(pom.getInstancePolicyModule().getEmailField(), "Karuppannan123@gmail.com");

	}

	@When("^user Enter The Command In The Command Field$")
	public void user_Enter_The_Command_In_The_Command_Field() throws Throwable {
		sendTheValue(pom.getInstancePolicyModule().getCommentField(), "All login page is not open");

	}

	@When("^user Second Time Enter The Captcha In The Captcha Field$")
	public void user_Second_Time_Enter_The_Captcha_In_The_Captcha_Field() throws Throwable {
		sendTheValue(pom.getInstancePolicyModule().getCaptchaEnter(), "Robot2");

	}

	@Then("^user Click The Submit button and Navigate To The Advertise Module$")
	public void user_Click_The_Submit_button_and_Navigate_To_The_Advertise_Module() throws Throwable {
		clickOnElement(pom.getInstancePolicyModule().getSubmitClick());

	}

	@When("^user Click The Advertise Link$")
	public void user_Click_The_Advertise_Link() throws Throwable {
		clickOnElement(pom.getInstanceAdvertiseModule().getAdvertiseClick());
		
	}

	@When("^user Enter The Rediff Name In The Rediff Name Field$")
	public void user_Enter_The_Rediff_Name_In_The_Rediff_Name_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedName(), "Rediff");

	}

	@When("^user Enter The Rediff Company Name In The Rediff Company Name Field$")
	public void user_Enter_The_Rediff_Company_Name_In_The_Rediff_Company_Name_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedCompany(), "RediffCompany");

	}

	@When("^user Enter The Rediff Url In The Rediff Url Field$")
	public void user_Enter_The_Rediff_Url_In_The_Rediff_Url_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedUrl(), "https://clients.rediff.com/rediff_advertisewithus/contact.htm");

	}

	@When("^user Enter The Rediff Email In The Rediff Email Field$")
	public void user_Enter_The_Rediff_Email_In_The_Rediff_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedEmail(), "Rediff@gmail.com");

	}

	@When("^user Enter The Rediff Phone Number In The Rediff Phone Number Field$")
	public void user_Enter_The_Rediff_Phone_Number_In_The_Rediff_Phone_Number_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedPhone(), "5464746767");

	}

	@When("^user Enter The Rediff Usercity In The Rediff Usercity Field$")
	public void user_Enter_The_Rediff_Usercity_In_The_Rediff_Usercity_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedUserCity(), "Chennai");

	}

	@When("^user Enter The Rediff Query In The Rediff Query Field$")
	public void user_Enter_The_Rediff_Query_In_The_Rediff_Query_Field() throws Throwable {
		sendTheValue(pom.getInstanceAdvertiseModule().getRedQuery(), "No Query");
	}

	@When("^user Click The Advertise Submit button$")
	public void user_Click_The_Advertise_Submit_button() throws Throwable {
		clickOnElement(pom.getInstanceAdvertiseModule().getSubmitClick1());

	}

	@When("^user Second Time Handle The Simple Alert$")
	public void user_Second_Time_Handle_The_Simple_Alert() throws Throwable {
		handleTheSimpleAlert();

	}

	@Then("^user Click The Navigate Back button and Handle The Privacy Moidule$")
	public void user_Click_The_Navigate_Back_button_and_Handle_The_Privacy_Moidule() throws Throwable {
		navigateBack();

	}

	@When("^user Click The Privacy Link$")
	public void user_Click_The_Privacy_Link() throws Throwable {
		clickOnElement(pom.getInstancePrivacyModule().getPrivacyClick());
	}

	@When("^user Scroll Into View The Rediff Url Link Using JavaScript Executor$")
	public void user_Scroll_Into_View_The_Rediff_Url_Link_Using_JavaScript_Executor() throws Throwable {
		javaScriptExecutorUsingScrollIntoView(pom.getInstancePrivacyModule().getRediffUrlScrollView());

	}

	@When("^user Click The Rediff Url$")
	public void user_Click_The_Rediff_Url() throws Throwable {
		clickOnElement(pom.getInstancePrivacyModule().getRediffUrlClick());

	}

	@When("^user Navigate To Fourth Window$")
	public void user_Navigate_To_Fourth_Window() throws Throwable {
		handleTheWindow(3);

	}

	@When("^user Enter The Issue In The Issue Field$")
	public void user_Enter_The_Issue_In_The_Issue_Field() throws Throwable {
		sendTheValue(pom.getInstancePrivacyModule().getIssueField(), "I have lot of issues about the rediff website");

	}

	@Then("^user Click The Search button and Navigate To Become A Reseller Module$")
	public void user_Click_The_Search_button_and_Navigate_To_Become_A_Reseller_Module() throws Throwable {
		clickOnElement(pom.getInstancePrivacyModule().getSearchClick());

	}

	@When("^user Click The Become A Reseller button$")
	public void user_Click_The_Become_A_Reseller_button() throws Throwable {
		clickOnElement(pom.getInstanceResellerModule().getBecomeResellerClick());
		
	}

	@When("^user Enter The Reseller LogIn Id In The Reseller Login Id Field$")
	public void user_Enter_The_Reseller_LogIn_Id_In_The_Reseller_Login_Id_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerModule().getReSellerLoginId(), "uewyrye@gmail.com");

	}

	@When("^user Enter The Reseller First Name In The Reseller First Name Field$")
	public void user_Enter_The_Reseller_First_Name_In_The_Reseller_First_Name_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerModule().getReSellerFirstName(), "Karthick");

	}

	@When("^user Enter The Reseller Last Name In The Reseller Last Name Field$")
	public void user_Enter_The_Reseller_Last_Name_In_The_Reseller_Last_Name_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerModule().getReSellerLastName(), "Raja");

	}

	@When("^user Select The Salem City In The Dropdown$")
	public void user_Select_The_Salem_City_In_The_Dropdown() throws Throwable {
		forEachLoopUsingSelectTheDropDown(pom.getInstanceResellerModule().getReSellerCity(), "Salem");

	}

	@When("^user Enter The Reseller Phone Number In The Reseller Phone Number Field$")
	public void user_Enter_The_Reseller_Phone_Number_In_The_Reseller_Phone_Number_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerModule().getReSellerMobileNumber(), "9578603452");

	}

	@When("^user Enter The Text In The Reseller Above Text Field$")
	public void user_Enter_The_Text_In_The_Reseller_Above_Text_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerModule().getReSellerAboveText(), "Hi how are You?");
	}

	@When("^user Click The Accept Check Box$")
	public void user_Click_The_Accept_Check_Box() throws Throwable {
		clickOnElement(pom.getInstanceResellerModule().getCheckBox());

	}

	@When("^user Click The Continue button$")
	public void user_Click_The_Continue_button() throws Throwable {
		clickOnElement(pom.getInstanceResellerModule().getContinueClick());

	}

	@Then("^user Again One Time Click The Continue button and Navigate To Buynow Module$")
	public void user_Again_One_Time_Click_The_Continue_button_and_Navigate_To_Buynow_Module() throws Throwable {
		clickOnElement(pom.getInstanceResellerModule().getContinueClick2());

	}

	@When("^user Third Time Handle The Simple Alert$")
	public void user_Third_Time_Handle_The_Simple_Alert() throws Throwable {
		handleTheSimpleAlert();
	}

	@When("^user Click The Buynow Module$")
	public void user_Click_The_Buynow_Module() throws Throwable {
		clickOnElement(pom.getInstanceBuyNowModule().getBuyNowClick());

	}

	@When("^user Click The Buynow Login button$")
	public void user_Click_The_Buynow_Login_button() throws Throwable {
		clickOnElement(pom.getInstanceBuyNowModule().getLoginClick());

	}

	@When("^user Enter The User Panel Email Id In The User Panel Email Field$")
	public void user_Enter_The_User_Panel_Email_Id_In_The_User_Panel_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceBuyNowModule().getPanelEmail(), "hfhuhf@gmail.com");

	}

	@When("^user Enter The User Panel Password Id In The User Panel Password Field$")
	public void user_Enter_The_User_Panel_Password_Id_In_The_User_Panel_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceBuyNowModule().getPanelPassword(), "Kumaran@Test");

	}

	@When("^user Third Time Enter The Captcha In The Captcha Field$")
	public void user_Third_Time_Enter_The_Captcha_In_The_Captcha_Field() throws Throwable {
		sendTheValue(pom.getInstanceBuyNowModule().getPanelCaptcha(), "Robot3");

	}

	@When("^user Click The Remember Checkbox$")
	public void user_Click_The_Remember_Checkbox() throws Throwable {
		clickOnElement(pom.getInstanceBuyNowModule().getRememberClick());

	}

	@Then("^user Click The Forgot Password button and Navigate To Signin Module$")
	public void user_Click_The_Forgot_Password_button_and_Navigate_To_Signin_Module() throws Throwable {
		clickOnElement(pom.getInstanceBuyNowModule().getForgotPassword());

	}

	@When("^user Navigate To Fifth Window$")
	public void user_Navigate_To_Fifth_Window() throws Throwable {
		handleTheWindow(4);
		
	}

	@When("^user Navigate To Fifth Window and Maximize The Window$")
	public void user_Navigate_To_Fifth_Window_and_Maximize_The_Window() throws Throwable {
		maximize();

	}

	@When("^user Enter The Forgot Username In The Forgot Username Field$")
	public void user_Enter_The_Forgot_Username_In_The_Forgot_Username_Field() throws Throwable {
		sendTheValue(pom.getInstanceSignInModule().getForgotUserName(), "Reena");

	}

	@When("^user Click The Please Continue Click button$")
	public void user_Click_The_Please_Continue_Click_button() throws Throwable {
		clickOnElement(pom.getInstanceSignInModule().getPleaseContinueClick());

	}

	@When("^user closed The Fifth Browser Window$")
	public void user_closed_The_Fifth_Browser_Window() throws Throwable {
		driverClose();

	}

	@When("^user Again Navigate To Fourth Browser Window$")
	public void user_Again_Navigate_To_Fourth_Browser_Window() throws Throwable {
		handleTheWindow(3);

	}

	@When("^user Again Click The Signin button$")
	public void user_Again_Click_The_Signin_button() throws Throwable {
		clickOnElement(pom.getInstanceSignInModule().getSignClick());

	}

	@When("^user Again Enter The User Panel Email Id In The User Panel Email Field$")
	public void user_Again_Enter_The_User_Panel_Email_Id_In_The_User_Panel_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceSignInModule().getUserEmail(), "Reena@gmail.com");
	}

	@When("^user Again Enter The User Panel Password Id In The User Panel Password Field$")
	public void user_Again_Enter_The_User_Panel_Password_Id_In_The_User_Panel_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceSignInModule().getUserPassword(), "Reena@gmail.com");

	}

	@Then("^user Click The Navigate Back button and Navigate To Reseller Panel Module$")
	public void user_Click_The_Navigate_Back_button_and_Navigate_To_Reseller_Panel_Module() throws Throwable {
		navigateBack();

	}

	@When("^user Click The Reseller Panel button$")
	public void user_Click_The_Reseller_Panel_button() throws Throwable {
		clickOnElement(pom.getInstanceUserPanelModule().getReSellerPanel());
	}

	@When("^user Enter The Reseller Panel Username In The Reseller Panel Username Field$")
	public void user_Enter_The_Reseller_Panel_Username_In_The_Reseller_Panel_Username_Field() throws Throwable {
		sendTheValue(pom.getInstanceUserPanelModule().getPanelUsername(), "Reena@gmail.com");

	}

	@When("^user Enter The Reseller Panel Password In The Reseller Panel Password Field$")
	public void user_Enter_The_Reseller_Panel_Password_In_The_Reseller_Panel_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceUserPanelModule().getPanelPassword2(), "Reena@123");

	}

	@When("^user Enter The Text In Reseller Panel Above Text Field$")
	public void user_Enter_The_Text_In_Reseller_Panel_Above_Text_Field() throws Throwable {
		sendTheValue(pom.getInstanceUserPanelModule().getPanelAboveText(), "Hi Reena!");

	}

	@When("^user Click The Reseller Panel Remember Check Box$")
	public void user_Click_The_Reseller_Panel_Remember_Check_Box() throws Throwable {
		clickOnElement(pom.getInstanceUserPanelModule().getRememberClick2());

	}

	@Then("^user Click The Reseller Panel Signin button and Navigate To Disclaimer Module$")
	public void user_Click_The_Reseller_Panel_Signin_button_and_Navigate_To_Disclaimer_Module() throws Throwable {
		clickOnElement(pom.getInstanceUserPanelModule().getSignInClick2());

	}

	@When("^user Enter The Service Mail Id In The Service Mail Id Field$")
	public void user_Enter_The_Service_Mail_Id_In_The_Service_Mail_Id_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerPanelModule().getServiceMailId(), "Hi Reena!");
		

	}

	@When("^user Enter The Service Password In The Service Password Field$")
	public void user_Enter_The_Service_Password_In_The_Service_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceResellerPanelModule().getServicePassword(), "Hi Reena!");

	}

	@When("^user Click The Disclaimer button$")
	public void user_Click_The_Disclaimer_button() throws Throwable {
		clickOnElement(pom.getInstanceResellerPanelModule().getDisclaimer());

	}

	@When("^user Navigatw To Sixth Window$")
	public void user_Navigatw_To_Sixth_Window() throws Throwable {
		handleTheWindow(4);

	}

	@When("^user Click The Rediff Home button$")
	public void user_Click_The_Rediff_Home_button() throws Throwable {
		clickOnElement(pom.getInstanceResellerPanelModule().getRediffHome());

	}

	@When("^user Click The Money Module$")
	public void user_Click_The_Money_Module() throws Throwable {
		handleTheWindow(5);
		clickOnElement(pom.getInstanceResellerPanelModule().getMoneyModule());
		driverClose();
		
	}

	@When("^user Close The Sixth Browser Window$")
	public void user_Close_The_Sixth_Browser_Window() throws Throwable {
		handleTheWindow(4);
		clickOnElement(pom.getInstanceResellerPanelModule().gethelpClick());

	}

	@When("^user Close The Fourth Browser Window$")
	public void user_Close_The_Fourth_Browser_Window() throws Throwable {
		navigateBack();
		driverClose();
	}

	@When("^user Again Navigate To Third Browser Window$")
	public void user_Again_Navigate_To_Third_Browser_Window() throws Throwable {
		handleTheWindow(3);
		driverClose();
	}

	@When("^user Close The Third Browser Window$")
	public void user_Close_The_Third_Browser_Window() throws Throwable {
		handleTheWindow(2);
		driverClose();
	}

	@When("^user Again Navigate To Browser Second Window$")
	public void user_Again_Navigate_To_Browser_Second_Window() throws Throwable {
		handleTheWindow(1);

	}

	@When("^user Close The Browser Second Window$")
	public void user_Close_The_Browser_Second_Window() throws Throwable {
		driverClose();
	}

	@Then("^user Again Navigate To Browser First Window$")
	public void user_Again_Navigate_To_Browser_First_Window() throws Throwable {
		handleTheWindow(0);

	}


}