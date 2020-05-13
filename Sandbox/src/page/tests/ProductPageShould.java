package page.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.LoginPage;
import page.object.OpenPage;
import page.object.ProductPage;
import page.object.ProfilePageNavBar;
import page.object.ReadPaths;
import page.object.ReadUrls;

public class ProductPageShould {
	WebDriver driver;
	Map<String, String> urls = new HashMap<>();
	Map<String, String> xPaths = new HashMap<>();

	@Test(priority = 1)
	public void createNewProduct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openLogin(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		LoginPage login = new LoginPage(driver, ReadPaths.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		login.typeUsername(utility.ExcelUtils.getDataAt(2, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(2, 2));
		login.clickLoginButton();

		ProfilePageNavBar navBar = new ProfilePageNavBar(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		navBar.clickProductsNav();

		ProductPage product = new ProductPage(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		product.clickAddNewProduct();

		checkOut.assertEquals(driver.getCurrentUrl(), navBar.getCreateNewProductUrl());

		utility.ExcelUtils.setExcell("src\\ProductInformation_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		product.typeProductName(utility.ExcelUtils.getDataAt(1, 0));
		product.typeProductId(utility.ExcelUtils.getDataAt(1, 1));
		product.typeShortDescription(utility.ExcelUtils.getDataAt(1, 2));
		product.typeLongDescription(utility.ExcelUtils.getDataAt(1, 3));
		product.typeProductPrice(utility.ExcelUtils.getDataAt(1, 4));
		product.typeApprovedUrl(utility.ExcelUtils.getDataAt(1, 5));
		product.clickSubmit();

		checkOut.assertTrue(driver.findElement(By.xpath(navBar.getUpdateSuccessfulPath())).isDisplayed());

		Thread.sleep(5000);

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test(priority = 2)
	public void deleteProduct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openLogin(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		LoginPage login = new LoginPage(driver, ReadPaths.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		login.typeUsername(utility.ExcelUtils.getDataAt(2, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(2, 2));
		login.clickLoginButton();

		ProfilePageNavBar navBar = new ProfilePageNavBar(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		navBar.clickProductsNav();

		ProductPage product = new ProductPage(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		checkOut.assertTrue(driver.findElement(By.xpath(product.getCheckboxProductPath())).isDisplayed());
		product.clickCheckboxProduct();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getDeleteProductPath())).isDisplayed());
		product.clickDeleteProduct();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getSubmitPath())).isDisplayed());
		product.clickSubmit();
		checkOut.assertEquals(driver.getCurrentUrl(), open.getUrlDeletedProduct());

		Thread.sleep(5000);

		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}

	@Test(priority = 3)
	public void createMultipleNewProduct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openLogin(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		LoginPage login = new LoginPage(driver, ReadPaths.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		login.typeUsername(utility.ExcelUtils.getDataAt(2, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(2, 2));
		login.clickLoginButton();

		ProfilePageNavBar navBar = new ProfilePageNavBar(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		navBar.clickProductsNav();

		ProductPage product = new ProductPage(driver, ReadPaths.readXPaths(), ReadUrls.readUrls());
		product.clickAddNewProduct();

		checkOut.assertEquals(driver.getCurrentUrl(), navBar.getCreateNewProductUrl());

		utility.ExcelUtils.setExcell("src\\ProductInformation_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		for (int i = 2; i < utility.ExcelUtils.getRowNumber(); i++) {
			product.typeProductName(utility.ExcelUtils.getDataAt(i, 0));
			product.typeProductId(utility.ExcelUtils.getDataAt(i, 1));
			product.typeShortDescription(utility.ExcelUtils.getDataAt(i, 2));
			product.typeLongDescription(utility.ExcelUtils.getDataAt(i, 3));
			product.typeProductPrice(utility.ExcelUtils.getDataAt(i, 4));
			product.typeApprovedUrl(utility.ExcelUtils.getDataAt(i, 5));
			product.clickSubmit();

			checkOut.assertTrue(driver.findElement(By.xpath(navBar.getUpdateSuccessfulPath())).isDisplayed());
			Thread.sleep(5000);
			if (i < utility.ExcelUtils.getRowNumber() - 1) {
				navBar.clickProductsNav();
				product.clickAddNewProduct();
			}
		}
		checkOut.assertAll();
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}
}
