package busyqa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import busyqa.core.BaseClass;
import busyqa.pages.FindaFlightPage;
import busyqa.pages.WelcomePage;

public class TestCase_Login extends BaseClass {
	
	WelcomePage wp;
	FindaFlightPage ff;

	@Test
	public void Logintest() {
		app_logs.info("Entering username, password and sign on");
		wp=new WelcomePage(driver);
		wp.signin("tutorial", "tutorial");
		ff=new FindaFlightPage(driver);
		Assert.assertTrue(ff.psgrCount.isDisplayed());
		
	}

}
