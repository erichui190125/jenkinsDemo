package com.languageLine.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.languageLine.pageObjects.HomePage;

import com.languageLine.utilities.ReadConfig;

public class BaseClass{
	
	ReadConfig readconfig=new ReadConfig();

	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) {
		
		logger = Logger.getLogger("languageLine");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		if(br.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		
		
		
		

		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
}
