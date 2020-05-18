package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.EngineStart;
import page.object.LogIn;
import page.object.ReadFile;
import page.object.NavigationBar;

public class LogInShould {
	WebDriver driver;
	EngineStart start = new EngineStart(driver, ReadFile.readUrls());	

	public EngineStart launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		start.logInPage(driver);
		return start;
	}

	@Test
	public void NotLogWithoutUsernameAndPassword() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		login.clickLoginButton();

		checkOut.assertNotEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
		checkOut.assertFalse(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlFailedLogInPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlFailedLogInPage()));

		checkOut.assertAll();
	}

	@Test
	public void NotLogWithoutUsername() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();

		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		login.typePassword(utility.ExcelUtils.getDataAt(2, 2));
		login.clickLoginButton();

		checkOut.assertNotEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
		checkOut.assertFalse(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlFailedLogInPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlFailedLogInPage()));

		checkOut.assertAll();
	}

	@Test 
	public void NotLogWithoutPassword() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();

		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		login.typeUsername(utility.ExcelUtils.getDataAt(2, 0));
		login.clickLoginButton();
		
		checkOut.assertNotEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
		checkOut.assertFalse(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlFailedLogInPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlFailedLogInPage()));

		checkOut.assertAll();
	}

	@Test 
	public void logOneUser() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();

		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		login.typeUsername(utility.ExcelUtils.getDataAt(1, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(1, 2));
		login.clickLoginButton();

		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));

		checkOut.assertAll();
	}

	@Test
	public void logMultipleUsers() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < utility.ExcelUtils.getRowNumber(); i++) {

			login.typeUsername(utility.ExcelUtils.getDataAt(i, 0));
			login.typePassword(utility.ExcelUtils.getDataAt(i, 2));
			login.clickLoginButton();

			checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
			checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));
			
			NavigationBar profile = new NavigationBar(driver, ReadFile.readXPaths());
			profile.clickAccountAvatar();
			profile.clickLogOut();

		}
		checkOut.assertAll();
	}
	
	@AfterMethod
	public void close() {
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}
}
