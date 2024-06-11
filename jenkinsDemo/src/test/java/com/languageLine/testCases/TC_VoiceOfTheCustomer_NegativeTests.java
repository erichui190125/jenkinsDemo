package com.languageLine.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.languageLine.pageObjects.HomePage;
import com.languageLine.pageObjects.MercuryAboutYouPage;
import com.languageLine.pageObjects.MercuryInsuranceHomePage;
import com.languageLine.pageObjects.VoiceOfTheCustomerPage;

public class TC_VoiceOfTheCustomer_NegativeTests extends BaseClass{
	
	//get a quote
	@Test (enabled=true)
	public void clickGetAQuoteButton() throws InterruptedException{
		MercuryInsuranceHomePage mhp = new MercuryInsuranceHomePage(driver);
		MercuryAboutYouPage mayp = new MercuryAboutYouPage(driver);

		mhp.fillInZipCodeTextBox("90680");
		mhp.clickGetAQuoteButton();
		mayp.verifyNavigationToAboutYouPage("Get your quote in less than 7 minutes!");
	}


	
}
