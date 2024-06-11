package com.languageLine.testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.languageLine.pageObjects.HomePage;
import com.languageLine.pageObjects.VoiceOfTheCustomerPage;

public class TC_VoiceOfTheCustomer_HappyPath extends BaseClass{
	@Test(enabled=false) 
	public void navigateToVoiceOfTheCustomerPage() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		VoiceOfTheCustomerPage votcp = new VoiceOfTheCustomerPage(driver);
		hp.hoverOverClientResourcesHeaderTabThenClickTabName("Voice of the Customer");
		votcp.verifyURL();
	}
	
	@Test 
	public void FillVOCFormWithAllFields() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		VoiceOfTheCustomerPage votcp = new VoiceOfTheCustomerPage(driver);
		hp.hoverOverClientResourcesHeaderTabThenClickTabName("Voice of the Customer");
		votcp.switchToVOCFormIframe();
		votcp.fillInFirstNameTextBox("test First Name");
		votcp.fillInLastNameTextBox("test Last Name");
		votcp.fillInEmailTextBox("erichui190122@gmail.com");
		votcp.fillInClientIdTextBox("111111");
		votcp.fillInPhoneNumberTextBox("1111111111");
		votcp.selectProductDropDownOption("LanguageLine Phone Interpreting");
		votcp.selectCategoryDropDownOption("Administration");
		votcp.selectSubCategoryDropDownOption("Administrative staff did not treat me professionally");
		votcp.selectEventTimeZoneDropDownOption("Pacific Time");
		votcp.clickEventCalendarMenu();
		votcp.selectEventDate_Yesterday();
		votcp.selectEventTime();
		votcp.fillInDialedNumberTextBox("111111");
		votcp.selectLanguageDropDownOption("ENGLISH");
		votcp.fillInInterpreterIdNumberTextBox("111111");
		votcp.fillInDescriptionTextBox("This is a Technology Quality Assurance Team test, please disregard");
		votcp.switchToRecaptchaIframe();
		votcp.clickRecaptcha();
		votcp.switchToDefaultContentFrame();
		votcp.switchToVOCFormIframe();
		votcp.clickSubmitButton();
		votcp.verifyThankYouMessageText();
	}
	



}
