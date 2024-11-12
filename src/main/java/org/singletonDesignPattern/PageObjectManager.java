package org.singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.pageObjectModel.AdvertiseModule;
import org.pageObjectModel.BuyNowModule;
import org.pageObjectModel.CreateNewAccountModule;
import org.pageObjectModel.PolicyModule;
import org.pageObjectModel.PrivacyModule;
import org.pageObjectModel.RediffMailModule;
import org.pageObjectModel.ResellerModule;
import org.pageObjectModel.ResellerPanelModule;
import org.pageObjectModel.SignInModule;
import org.pageObjectModel.UserPanelModule;

public class PageObjectManager {
	
	public static WebDriver driver;

	
	private RediffMailModule rm;
	private CreateNewAccountModule cm;
	private PolicyModule pm;
	private AdvertiseModule am;
	private PrivacyModule pme;
	private ResellerModule rme;
	private BuyNowModule bm;
	private SignInModule sm;
	private UserPanelModule um;
	private ResellerPanelModule rpm;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public RediffMailModule getInstanceRediffMailModule() {
		 rm = new RediffMailModule(driver);
		 return rm;
	}
	public CreateNewAccountModule getInstanceCreateNewAccountModule() {
		cm =   new CreateNewAccountModule(driver);
		return cm;
	}
	public PolicyModule getInstancePolicyModule() {
		 pm = new PolicyModule(driver);
		 return pm;
	}
	public AdvertiseModule getInstanceAdvertiseModule() {
		 am = new AdvertiseModule(driver);
		 return am;
	}
	public PrivacyModule getInstancePrivacyModule() {
		 pme = new PrivacyModule(driver);
		return pme;
	}
	public ResellerModule getInstanceResellerModule() {
		 rme = new ResellerModule(driver);
		 return rme;
	}
	public BuyNowModule getInstanceBuyNowModule() {
		 bm = new BuyNowModule(driver);
		 return bm;
	}
	public SignInModule getInstanceSignInModule() {
		 sm = new SignInModule(driver);
		return sm;
	}
	public UserPanelModule getInstanceUserPanelModule() {
		 um = new UserPanelModule(driver);
		return um;
	}
	public ResellerPanelModule getInstanceResellerPanelModule() {
		 rpm = new ResellerPanelModule(driver);
		return rpm;
	}
	
	
	
	
	
	
	
	
	
	
	
}
