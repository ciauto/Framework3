package busyqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import busyqa.core.BasePage;



public class SelectaFlightPage extends BasePage {
	
	public SelectaFlightPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@value='Unified Airlines$363$281$11:24']")
	public WebElement departairline;
	@FindBy(xpath="//input[@value='Blue Skies Airlines$631$273$14:30']")
	public WebElement returnairline;
	@FindBy(name="reserveFlights")
	public WebElement resflightContinue;
	

}
