package com.languageLine.pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.languageLine.testCases.BaseClass;

public class VoiceOfTheCustomerPage extends BaseClass {

	
	WebDriver ldriver;
	public VoiceOfTheCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	public WebDriverWait wait = new WebDriverWait(driver,10);
	
	
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	String element_Option_ValueReplace = "//option[contains(text(),'Value')]";
	
	String thankYouMessageTextXpath = "//div[@class='thankYouPopup']/p";
	String selectProduct_Category_SubCategory_ErrorMessage = "//span[contains(text(),'A Product, Category and Sub-Category must be selected.')]";
	String firstNameTextBoxErrorMessage = "//div[contains(@class,'hs_firstname field')]/ul/li/label";		
	String lastNameTextBoxErrorMessage = "//div[contains(@class,'hs_lastname field')]/ul/li/label";
	String emailTextBoxErrorMessage = "//div[contains(@class,'hs_email')]/ul/li/label";
	String clientIdTextBoxErrorMessage = "//div[contains(@class,'hs_client_id')]/ul/li/label";
	String clientIdOrDialedNumberNotProvidedWithEmailPopUp = "//div[@class='mpopup-main']";
	String eventDateErrorMessage = "//span[contains(text(),'An Event Date is Required.')]";
	String eventTimeErrorMessage = "//span[contains(text(),'An Event Time is Required.')]";
	String descriptionErrorMessage = "//span[contains(text(),'A description must be provided.')]";
	String captchaErrorMessage = "//span[contains(text(),'Please verify the captcha to submit this form.')]";
	String dialedNumberErrorMessage = "//div[contains(@class,'hs_dialed_number')]/ul/li/label";
	String languageErrorMessage = "//div[contains(@class,'hs_language field')]/ul/li/label";
	String futureDateErrorMessage = "//div[contains(text(),' The date entered cannot be in the future. Please check your date selection.')]";
	String invalidEmailAddressErrorMessage = "//span[contains(text(),'Please enter a valid email address.')]";
	String productErrorMessage = "//div[contains(@class,'hs_voc_product')]/ul/li/label";
	String categoryErrorMessage = "//div[contains(@class,'hs_category')]/ul/li/label";
	String subCategoryErrorMessage = "(//div[contains(@class,'hs_category')]/ul/li/label)[2]";
	
	String eventDateMissingErrorMessage = "//span[@id='pg:frm:datePnl']/ul/li/label";
	String eventTimeMissingErrorMessage = "//span[@id='pg:frm:timePnl']/ul/li/label";
	String dialedNumberMissingErrorMessage = "//div[contains(@class,'hs_dialed_number')]/ul/li/label";
	String languageMissingErrorMessage = "//div[contains(@class,'hs_language')]/ul/li/label";
	String descriptionMissingErrorMessage = "//div[contains(@class,'hs_description')]/ul/li/label";

	
	@FindBy(xpath="//a[contains(text(),'Client Resources')]")
	@CacheLookup
	WebElement clientResourcesHeaderTab;
	
	@FindBy(xpath="//a[contains(text(),'Voice of the Customer')]")
	@CacheLookup
	WebElement clientResourcesVoiceOfTheCustomer;
	
	@FindBy(xpath="//iframe[@id='voc-submission']")
	@CacheLookup
	WebElement vocIframe;
	
	@FindBy(xpath="//input[@id='pg:frm:firstname']")
	@CacheLookup
	WebElement firstNameTextBox;
	
	@FindBy(xpath="//span[@id='pg:frm:fnPnl']")
	@CacheLookup
	WebElement firstNameField;
	
	@FindBy(xpath="//input[@id='pg:frm:lastname']")
	@CacheLookup
	WebElement lastNameTextBox;
	
	@FindBy(xpath="//span[@id='pg:frm:lnPnl']")
	@CacheLookup
	WebElement lastNameField;
	
	@FindBy(xpath="//input[@id='pg:frm:email']")
	@CacheLookup
	WebElement emailTextBox;
	
	@FindBy(xpath="//input[@id='pg:frm:client_id']")
	@CacheLookup
	WebElement clientIdTextBox;
	
	
	@FindBy(xpath="//input[@id='pg:frm:phone']")
	@CacheLookup
	WebElement phoneNumberTextBox;
	
	@FindBy(xpath="//input[@id='pg:frm:company']")
	@CacheLookup
	WebElement companyNameTextBox;
	
	@FindBy(xpath="//select[@id='pg:frm:voc_product']")
	@CacheLookup
	WebElement productDropDown;
	
	@FindBy(xpath="//select[@id='pg:frm:category']")
	@CacheLookup
	WebElement categoryDropDown;
	
	@FindBy(xpath="//span[@id='pg:frm:subcategoryPnl']")
	@CacheLookup
	WebElement subCategoryDropDown;
	
	@FindBy(xpath="//input[@class='hs-dateinput hs-input']")
	@CacheLookup
	WebElement eventDateCalendarMenu;
	
	@FindBy(xpath="//td[contains(@class,'todayDate')]")
	@CacheLookup
	WebElement eventDateTodaySelection;
	
	@FindBy(xpath="//input[@id='pg:frm:timepicker']")
	@CacheLookup
	WebElement eventTimeDropDown;
	
	@FindBy(xpath="//input[@id='pg:frm:dialed_number']")
	@CacheLookup
	WebElement dialedNumberTextBox;
	
	@FindBy(xpath="//input[@id='pg:frm:interpreter_id_number']")
	@CacheLookup
	WebElement interpreterIDNumber;
	
	@FindBy(xpath="//textarea[@id='pg:frm:description']")
	@CacheLookup
	WebElement descriptionTextBox;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	@CacheLookup
	WebElement recaptcha;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement submitButton;
	
	@FindBy(xpath="//div[@class='thankYouPopup']/p")
	@CacheLookup
	WebElement thankYouMessageText;
	
	@FindBy(xpath="//a[contains(text(),'Reset')]")
	@CacheLookup
	WebElement eventTimeResetButton;
	
	@FindBy(xpath="//div[contains(@class,'hs_language')]")
	@CacheLookup
	WebElement languageField;
	
	
	
	public void hoverOverClientResourcesHeaderTabThenClickTabName(String tabName) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(clientResourcesHeaderTab).moveToElement(ldriver.findElement(By.xpath(element_A_ValueReplace.replace("Value", tabName)))).click().perform();
	}
	
	public void verifyURL() throws InterruptedException{
		logger.info(ldriver.getTitle());
		
		
		wait.until(ExpectedConditions.titleContains("Voice of Customer | LanguageLine Solutions"));
		if(ldriver.getTitle().equals("Voice of Customer | LanguageLine Solutions")){
			logger.info("Verified Title");
			Assert.assertTrue(true);
		} else {
			logger.info("Voice of Customer | LanguageLine Solutions - Register not displayed");
			Assert.fail("Voice of Customer | LanguageLine Solutions - Register not displayed");
		}
	}
	
	public void switchToVOCFormIframe() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("voc-submission");
		logger.info("switched to Iframe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickFirstNameTextBox() {
		firstNameField.click();
		logger.info("Clicked First Name Field");
	}
	
	public void clickLastNameTextBox() {
		lastNameField.click();
		logger.info("Clicked Last Name Field");
	}
	
	public void fillInFirstNameTextBox(String firstName) throws InterruptedException
	{
		firstNameTextBox.sendKeys(firstName);
		logger.info("Filled in First Name Textbox: " + firstName);
	}
	
	public void fillInLastNameTextBox(String lastName) throws InterruptedException
	{
		lastNameTextBox.sendKeys(lastName);
		logger.info("Filled in Last Name Textbox: " + lastName);
	}
	
	public void fillInEmailTextBox(String email) throws InterruptedException
	{
		emailTextBox.sendKeys(email);
		logger.info("Filled in Email Textbox: " + email);
	}
	
	public void fillInClientIdTextBox(String clientId) throws InterruptedException
	{
		clientIdTextBox.sendKeys(clientId);
		logger.info("Filled in clientId Textbox: " + clientId);
	}
	
	public void fillInPhoneNumberTextBox(String PhoneNumber) throws InterruptedException
	{
		phoneNumberTextBox.sendKeys(PhoneNumber);
		logger.info("Filled in Phone Number Textbox: " + PhoneNumber);
	}
	
	public void selectProductDropDownOption(String productOption) throws InterruptedException
	{
		ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", productOption))).click();
		logger.info("Selected productOption: " + productOption);
	}
	
	public void selectCategoryDropDownOption(String categoryOption) {
		ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", categoryOption))).click();
		logger.info("Selected CategoryOption: " + categoryOption);
	}
	
	public void selectSubCategoryDropDownOption(String subCategoryOption) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", subCategoryOption)))));
		ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", subCategoryOption))).click();
		logger.info("Selected subCategoryOption: " + subCategoryOption);
	}
	
	public void selectEventTimeZoneDropDownOption(String eventOption) {
		ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", eventOption))).click();
		logger.info("Selected eventOption: " + eventOption);
	}
	
	public void clickEventCalendarMenu() {
		eventDateCalendarMenu.click();
	}
	
	public void selectEventDate_Tommorow() {
		eventDateCalendarMenu.click();
		int todayDateInteger=Integer.parseInt(eventDateTodaySelection.getText());   
		int tommorowDateInteger = todayDateInteger + 1;
		ldriver.findElement(By.xpath("//td[contains(text(),'" + tommorowDateInteger + "')]")).click();
		logger.info("Selected Tommorow Date From Calender Dropdown: " + tommorowDateInteger);
	}
	
	public void selectEventDate_Yesterday() {
		eventDateCalendarMenu.click();
		int todayDateInteger=Integer.parseInt(eventDateTodaySelection.getText());   
		int yesterdayDateInteger = todayDateInteger - 1;
		ldriver.findElement(By.xpath("//td[contains(text(),'" + yesterdayDateInteger + "')]")).click();
		logger.info("Selected Yesterday's Date From Calender Dropdown: " + yesterdayDateInteger);
	}
	
	public void selectEventTime() {
		eventTimeDropDown.click();
		dialedNumberTextBox.click();
	}
	
	public void fillInDialedNumberTextBox(String number) {
		dialedNumberTextBox.sendKeys(number);
		logger.info("Filled In Dialed Number TextBox: " + number);
	}
	
	public void selectLanguageDropDownOption(String languageSelection) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", languageSelection)))));
		ldriver.findElement(By.xpath(element_Option_ValueReplace.replace("Value", languageSelection))).click();
		logger.info("Selected language: " + languageSelection);
	}
	
	public void fillInInterpreterIdNumberTextBox(String interpreterId) {
		interpreterIDNumber.sendKeys(interpreterId);
		logger.info("Filled In Interpreter ID Number TextBox");
	}
	
	public void fillInDescriptionTextBox(String descriptionText) {
		descriptionTextBox.sendKeys(descriptionText);
		logger.info("Filled In Description TextBox: " + descriptionText);
	}
	
	public void switchToRecaptchaIframe() {
		int size = driver.findElements(By.tagName("iframe")).size();
		ldriver.switchTo().frame(0);
	}
	
	public void clickRecaptcha() {
		recaptcha.click();
		logger.info("Checked Recaptcha");
	}
	
	public void clickSubmitButton() throws InterruptedException {
		descriptionTextBox.sendKeys(Keys.PAGE_DOWN);
		descriptionTextBox.sendKeys(Keys.PAGE_DOWN);
		descriptionTextBox.sendKeys(Keys.PAGE_DOWN);
		descriptionTextBox.sendKeys(Keys.PAGE_DOWN);
		submitButton.click();
		logger.info("Clicked Submit Button");
	}
	
	public void switchToDefaultContentFrame() {
		ldriver.switchTo().defaultContent();
	}
	
	public void verifyThankYouMessageText() {
		
		String thanksMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(thankYouMessageTextXpath))).getText();
		if(thanksMessage.contains("Thank you")) {
			logger.info("Thank you message is displayed");
		} else {
			logger.info("Thank you message is not displayed");
		}
	}
	
	public void verifyFirstNameErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameTextBoxErrorMessage)));
		logger.info("Verified First Name Error Message Is Displayed");
	}
	
	public void verifyLastNameErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lastNameTextBoxErrorMessage)));
		logger.info("Verified Last Name Error Message Is Displayed");
	}
	
	public void verifySelectProduct_Category_SubCategoryErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectProduct_Category_SubCategory_ErrorMessage)));
		logger.info("Verified Product_Category_SubCategory Error Message Is Displayed");
	}
	
	public void verifyClientIdErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clientIdTextBoxErrorMessage)));
		logger.info("Verified Client Id Error Message Is Displayed");
	}
	
	public void verifyEmailNotProvidedErrorMessageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clientIdOrDialedNumberNotProvidedWithEmailPopUp)));
		logger.info("Verified Email Error Message Is Displayed");
	}
	
	public void verifyEventDateErrorMessageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eventDateErrorMessage)));
		logger.info("Verified Event Date Error Message Is Displayed");
	}
	
	public void verifyEventTimeErrorMessageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eventTimeErrorMessage)));
		logger.info("Verified Event Time Error Message Is Displayed");
	}
	
	public void verifyDescriptionErrorMessageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(descriptionErrorMessage)));
		logger.info("Verified Description Error Message Is Displayed");
	}
	
	public void verifyCaptchaErrorMessageIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(captchaErrorMessage)));
		logger.info("Verified Captcha Error Message Is Displayed");
	}
	
	public void verifyDialedNumberErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dialedNumberErrorMessage)));
		logger.info("Verified Dialed Number Error Message Is Displayed");
	}
	
	public void verifyLanguageErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(languageErrorMessage)));
		logger.info("Verified Language Error Message Is Displayed");
	}
	
	public void verifyFutureDateErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(futureDateErrorMessage)));
		logger.info("Verified Future Date Error Message Is Displayed");
	}
	
	public void verifyInvalidEmailErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(invalidEmailAddressErrorMessage)));
		logger.info("Verified Invalid Email Address Error Message Is Displayed");
	}
	
	public void clickIntoAndClickOutOfFirstNameField() {
		firstNameField.click();
		lastNameField.click();
		logger.info("Clicked Into And Out First Name Field");
	}
	
	public void clickIntoAndClickOutOfLastNameField() {
		lastNameField.click();
		firstNameField.click();
		logger.info("Clicked Into And Out Last Name Field");
	}
	
	public void clickIntoAndClickOutOfEmailField() {
		emailTextBox.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Email Field");
	}
	
	public void clickIntoAndClickOutOfClientIdField() {
		clientIdTextBox.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Client Id Field");
	}
	
	public void verifyEmailErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailTextBoxErrorMessage)));
		logger.info("Verified Email Address Missing Error Message Is Displayed");
	}
	
	public void clickIntoAndClickOutOfProductField() {
		productDropDown.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Product Dropdown");
	}
	
	public void verifyProductMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productErrorMessage)));
		logger.info("Verified Product Missing Error Message Is Displayed");
	}
	
	public void clickIntoAndClickOutOfCategoryField() {
		categoryDropDown.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of Category Dropdown");
	}
	
	public void verifyCategoryMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(categoryErrorMessage)));
		logger.info("Verified Category Missing Error Message Is Displayed");
	}
	
	public void clickIntoAndClickOutOfSubCategoryField() {
		subCategoryDropDown.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of Category Dropdown");
	}
	
	public void verifySubCategoryMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subCategoryErrorMessage)));
		logger.info("Verified Sub Category Missing Error Message Is Displayed");
	}
	
	public void clickIntoAndClickOutOfEventDateField() {
		eventDateCalendarMenu.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of EventDate Dropdown");
	}
	
	public void verifyEventDateMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eventDateMissingErrorMessage)));
		logger.info("Verified Event Date Missing Error Message Is Displayed");
	}

	
	public void clickedEventTimeResetButton() {
		eventTimeDropDown.click();
		lastNameTextBox.click();
		eventTimeDropDown.click();
		eventTimeResetButton.click();
		lastNameTextBox.click();
		logger.info("Clicked Event Time Reset Button");
	}

	public void verifyEventTimeMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eventTimeMissingErrorMessage)));
		logger.info("Verified Event Time Missing Error Message Is Displayed");
	}
	
	public void clickedIntoAndClickedOutOfDialedNumberField() {
		dialedNumberTextBox.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of Dialed Number TextBox");
	}
	
	public void verifyDialedNumberMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dialedNumberMissingErrorMessage)));
		logger.info("Verified Dialed Number Missing Error Message Is Displayed");
	}
	
	public void clickedIntoAndClickedOutOfLanguageField() {
		languageField.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of Language Field");
	}
	
	public void clickedIntoAndClickedOutOfDescriptionField() {
		descriptionTextBox.click();
		lastNameTextBox.click();
		logger.info("Clicked Into And Out Of Description Field");
	}
	
	public void verifyLanguageMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(languageMissingErrorMessage)));
		logger.info("Verified Language Missing Error Message Is Displayed");
	}
	
	public void verifyDescriptionMissingErrorMessageTextIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(descriptionMissingErrorMessage)));
		logger.info("Verified Description Missing Error Message Is Displayed");
	}
}
