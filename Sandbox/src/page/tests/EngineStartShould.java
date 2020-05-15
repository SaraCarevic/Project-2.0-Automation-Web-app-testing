package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.EngineStart;
import page.object.LogIn;
import page.object.ReadFile;

public class EngineStartShould {
	WebDriver driver;;
	EngineStart start = new EngineStart(driver, ReadFile.readUrls());
	LogIn login = new LogIn(driver, ReadFile.readXPaths());

	public EngineStart launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		start.logInPage(driver);
		return start;
	}

	public LogIn userLogedIn() {
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		login.typeUsername(utility.ExcelUtils.getDataAt(1, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(1, 2));
		login.clickLoginButton();
		return login;
	}

	@Test 
	public void openLoginPageAndLogedIn() {
		launchBrowser();
		userLogedIn();
		
		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlProfileHomePage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlProfileHomePage()));

		checkOut.assertAll();
		driver.quit();
	}
	
	@Test 
	public void openFailedLoginPage() {
		launchBrowser();
		userLogedIn();
		
		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlFailedLogInPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlFailedLogInPage()));

		checkOut.assertAll();
		driver.quit();
	}

	@Test
	public void openRecoveryProfilePage() {
		launchBrowser();
		start.recoveryProfilePage(driver);

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlRecoveryProfilePage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlRecoveryProfilePage()));

		checkOut.assertAll();
		driver.quit();
	}

	@Test
	public void openRegistrationPage() {
		launchBrowser();
		start.registrationPage(driver);

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlRegistrationPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlRegistrationPage()));

		checkOut.assertAll();
		driver.quit();
	}

	@Test 
	public void openAccountPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.accountPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlAccountPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlAccountPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test
	public void openSalesPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.salesPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlSalesPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlSalesPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openProductPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.productPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlProductPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlProductPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openEditProductPricePage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.editProductPricePage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlEditProductPricePage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlEditProductPricePage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openCreateNewProductPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.createNewProductPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlCreateNewProductPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlCreateNewProductPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openDeleteProductPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.deleteProductPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlDeleteProductPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlDeleteProductPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openShippingPage() {
		launchBrowser();
		userLogedIn();		

		SoftAssert checkOut = new SoftAssert();
		start.shippingPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlShippingPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlShippingPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openReportsPage() {
		launchBrowser();
		userLogedIn();		

		SoftAssert checkOut = new SoftAssert();
		start.reportsPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlReportsPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlReportsPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openApiPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.apiPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlApiPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlApiPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openNotificationPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.notificationPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlNotificationPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlNotificationPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openHelpPage() {
		launchBrowser();
		userLogedIn();

		SoftAssert checkOut = new SoftAssert();
		start.helpPage(driver);
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlHelpPage());
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlHelpPage()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test 
	public void openCheckOut() {
		launchBrowser();
		
		SoftAssert checkOut = new SoftAssert();
		start.checkoutPage(driver);
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlCheckoutPage()));

		checkOut.assertAll();
		driver.quit();
	}

	@Test 
	public void openTermsOfUse() {
		launchBrowser();

		SoftAssert checkOut = new SoftAssert();
		start.termsOfUsePage(driver);
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlTermsOfUsePage()));

		checkOut.assertAll();
		driver.quit();
	}

	@Test 
	public void openPrivacyPolicy() {
		launchBrowser();		

		SoftAssert checkOut = new SoftAssert();
		start.privacyPolicyPage(driver);
		checkOut.assertTrue(driver.getCurrentUrl().contains(start.getUrlPrivacyPolicyPage()));

		checkOut.assertAll();
		driver.quit();
	}
}
