package com.languageLine.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

public class MercuryInsuranceHomePage extends BaseClass {

	
	WebDriver ldriver;
	public MercuryInsuranceHomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	
	@FindBy(xpath="//input[@placeholder='Enter Zip Code']")
	@CacheLookup
	WebElement zipCodeTextBox;
	
	@FindBy(xpath="//button[contains(text(),'Get a Quote')]")
	@CacheLookup	
	WebElement getAQuoteButton;
	

	public void clickGetAQuoteButton() throws InterruptedException
	{
		getAQuoteButton.click();
	}
	
	public void fillInZipCodeTextBox(String zipCode) throws InterruptedException
	{
		zipCodeTextBox.click();
		zipCodeTextBox.sendKeys(zipCode);
	}
	
	
	
}
