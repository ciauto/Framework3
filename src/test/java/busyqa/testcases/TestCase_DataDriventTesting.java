package busyqa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import busyqa.core.BaseClass;
import busyqa.pages.FindaFlightPage;
import busyqa.pages.WelcomePage;

public class TestCase_DataDriventTesting extends BaseClass {

	
	WelcomePage wp;
	FindaFlightPage ff;
	
	@Test(dataProvider = "getData")
	public void Logintest(String myusername, String mypassword) {
	wp=new WelcomePage(driver);
	ff=new FindaFlightPage(driver);
	wp.signin(myusername, mypassword);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetName = "LoginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		Object data[][] = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
	}
}
