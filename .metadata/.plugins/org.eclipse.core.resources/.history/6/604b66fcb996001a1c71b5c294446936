package page.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.OpenPage;
import page.object.ProfilePageNavBar;
import page.object.ReadPaths;
import page.object.ReadUrls;
import page.object.RegistrationPage;

public class RegistrationShould {
	WebDriver driver;
	Map<String, String> urls = new HashMap<>();
	Map<String, String> xPaths = new HashMap<>();

	@Test
	public void NotRegisterWithoutUsernameAndPassword() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRegistration(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		RegistrationPage register = new RegistrationPage(driver, ReadPaths.readXPaths());
		register.clickSignUp();

		checkOut.assertNotEquals(driver.getCurrentUrl(), "https://sandbox.2checkout.com/sandbox/home/dashboard");
		checkOut.assertFalse(driver.getCurrentUrl().contains(open.getUrlProfile()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test
	public void registerOneUser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRegistration(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		RegistrationPage register = new RegistrationPage(driver, ReadPaths.readXPaths());

		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);

		register.typeUsername(utility.ExcelUtils.getDataAt(1, 0));
		register.typeEmail(utility.ExcelUtils.getDataAt(1, 1));
		register.typePassword(utility.ExcelUtils.getDataAt(1, 2));
		register.typeCofirmPassword(utility.ExcelUtils.getDataAt(1, 2));
		register.chooseHaveWebsite("www.website.com");

		register.clickSignUp();

		checkOut.assertEquals(driver.getCurrentUrl(), "https://sandbox.2checkout.com/sandbox/home/dashboard");
		checkOut.assertTrue(driver.getCurrentUrl().contains(open.getUrlProfile()));

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test
	public void registerMultipleUsers() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRegistration(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		RegistrationPage register = new RegistrationPage(driver, ReadPaths.readXPaths());

		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < utility.ExcelUtils.getRowNumber(); i++) {
			
			register.typeUsername(utility.ExcelUtils.getDataAt(i, 0));
			register.typeEmail(utility.ExcelUtils.getDataAt(i, 1));
			register.typePassword(utility.ExcelUtils.getDataAt(i, 2));
			register.typeCofirmPassword(utility.ExcelUtils.getDataAt(i, 2));
			
			if (utility.ExcelUtils.getRowNumber() == 1) register.chooseDontHaveWebsite();
			else if (utility.ExcelUtils.getRowNumber() == 2) register.chooseSeveralWebsite();
			else if (utility.ExcelUtils.getRowNumber() == 3) register.chooseAlreadyHaveAccount();
			else register.chooseWantToPlay();

			register.clickSignUp();

			checkOut.assertEquals(driver.getCurrentUrl(), "https://sandbox.2checkout.com/sandbox/home/dashboard");
			checkOut.assertTrue(driver.getCurrentUrl().contains(open.getUrlProfile()));
			
			ProfilePageNavBar profile = new ProfilePageNavBar(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
			profile.clickAccountAvatar();
			profile.clickLogOut();
			
			if (i < utility.ExcelUtils.getRowNumber() - 1) open.openRegistration(driver);

		}
		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}
}
