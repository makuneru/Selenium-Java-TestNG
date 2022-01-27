package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	private By textSearchBox = By.name("q");							
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextSearchBox(String textToSearch) {
		driver.findElement(textSearchBox).sendKeys(textToSearch);
	}
	
	public void clickSearch() {
		driver.findElement(textSearchBox).sendKeys(Keys.ENTER);
	}
}
