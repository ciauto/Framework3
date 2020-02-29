package busyqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import busyqa.core.BasePage;



public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(name="userName")
	public WebElement txtUsername;
	
	@FindBy(name="password")
	public WebElement txtPassword;
	
	@FindBy(name="login")
	public WebElement btnLogin;
	
	
	public void signin(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	
	

}
