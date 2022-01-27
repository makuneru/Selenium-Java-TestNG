package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class TestSearch {
	
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "..\\..\\eclipse-workspace\\seleniumjava\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleSearch() throws Exception {	
		GoogleSearchPage searchPage = new GoogleSearchPage(driver);
		searchPage.setTextSearchBox("test");
		searchPage.clickSearch();
		
		Assert.assertEquals("test - Google Search", driver.getTitle()); 
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
	}
}
