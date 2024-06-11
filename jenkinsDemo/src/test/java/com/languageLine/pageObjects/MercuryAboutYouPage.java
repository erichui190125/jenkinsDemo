package com.languageLine.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

public class MercuryAboutYouPage extends BaseClass {

	
	WebDriver ldriver;
	public MercuryAboutYouPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";

	
	@FindBy(xpath="//button[contains(text(),'Get a Quote')]")
	@CacheLookup
	WebElement getAQuoteButton;
	
	@FindBy(xpath="//h1[contains(text(),'Get your quote in less than 7 minutes!')]")
	@CacheLookup
	WebElement getYourQuoteInLessThan7MinutesText;
	
	
	

	public void verifyNavigationToAboutYouPage(String aboutYouTitleText) throws InterruptedException
	{
		getYourQuoteInLessThan7MinutesText.getText().equals(aboutYouTitleText);
	}
	

	
	
	
}
