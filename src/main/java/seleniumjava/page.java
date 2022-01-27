package seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class page {

	WebDriver driver;
	
	private By emailAddress = By.id("ember5");							//Email Address	
	private By password = By.id("ember6");								//Password
	private By signIn = By.xpath("//button[@type='submit']");			//Sign In 
	private By forgotPassword = By.linkText("Forgot your password?");	//Forgot Password
	
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(emailAddress).sendKeys(email);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void forgotPassword() {
		driver.findElement(forgotPassword).click();
	}
	
	public String getLoginTitle(){
	     return   driver.getTitle();
    }
	
	public void loginToDatafox(String email, String pass) {
        this.setEmail(email);
        this.setPassword(pass);
        this.clickSignIn();  
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
