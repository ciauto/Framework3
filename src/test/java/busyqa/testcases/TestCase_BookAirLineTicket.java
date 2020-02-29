package busyqa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import busyqa.core.BaseClass;
import busyqa.pages.BookaFlightPage;
import busyqa.pages.FindaFlightPage;
import busyqa.pages.FlightConfirmationPage;
import busyqa.pages.SelectaFlightPage;
import busyqa.pages.WelcomePage;

public class TestCase_BookAirLineTicket extends BaseClass {

	WebDriver driver;
	WelcomePage wp;
	FindaFlightPage ff;
	SelectaFlightPage sf;
	BookaFlightPage bp;
	FlightConfirmationPage fcp;

	@Test
	public void purchaseAirTicket() {
		wp = new WelcomePage(driver);
		ff = new FindaFlightPage(driver);
		sf = new SelectaFlightPage(driver);
		bp = new BookaFlightPage(driver);
		fcp = new FlightConfirmationPage(driver);

		wp.signin("tutorial", "tutorial");
		ff.oneway_rdbtn.click();
		ff.setPassengersCount().selectByValue("1");
		ff.setFromPort().selectByValue("Frankfurt");
		ff.setOnMonth().selectByValue("10");
		ff.setOnDay().selectByValue("20");
		ff.setArrivalPort().selectByValue("Seattle");
		ff.setToMonth().selectByValue("2");
		ff.setToDay().selectByValue("21");
		ff.srvClass_rdbtn.click();
		ff.selectAirLine().selectByIndex(2);
		ff.Continue.click();
		sf.departairline.click();
		sf.returnairline.click();
		sf.resflightContinue.click();
		bp.firstName.sendKeys("Naresh");
		bp.lastName.sendKeys("Prajapati");
		bp.setMeal().selectByVisibleText("Hindu");
		bp.setCreditCardType().selectByVisibleText("Visa");
		bp.number.sendKeys("123456789");
		bp.setCcExpMonth().selectByVisibleText("04");
		bp.setCcExpYear().selectByVisibleText("2010");
		bp.ccFirstName.sendKeys("N");
		bp.ccMidName.sendKeys("R");
		bp.ccLastName.sendKeys("Prajapati");
		bp.securePurchase.click();
		Assert.assertTrue(driver.getTitle().equals("Flight Confirmation: Mercury Tours"));
	}

}
