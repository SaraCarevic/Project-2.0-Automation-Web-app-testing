package page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.ProductPage;
import page.object.ReadFile;
import page.object.EngineStart;
import page.object.LogIn;
import page.object.NavigationBar;

public class ProductPageShould {
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

	public LogIn userLogedIn() {
		LogIn login = new LogIn(driver, ReadFile.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		login.typeUsername(utility.ExcelUtils.getDataAt(1, 0));
		login.typePassword(utility.ExcelUtils.getDataAt(1, 2));
		login.clickLoginButton();
		return login;
	}

	@Test(priority = 1)
	public void createNewProduct() {
		launchBrowser();
		userLogedIn();

		NavigationBar profile = new NavigationBar(driver, ReadFile.readXPaths());
		profile.clickProductsNav();
		ProductPage product = new ProductPage(driver, ReadFile.readXPaths());
		product.clickAddNewProductBtn();

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlCreateNewProductPage());

		utility.ExcelUtils.setExcell("src\\ProductInformation_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		product.typeProductName(utility.ExcelUtils.getDataAt(1, 0));
		product.typeProductId(utility.ExcelUtils.getDataAt(1, 1));
		product.typeShortDescription(utility.ExcelUtils.getDataAt(1, 2));
		product.typeLongDescription(utility.ExcelUtils.getDataAt(1, 3));
		product.typeProductPrice(utility.ExcelUtils.getDataAt(1, 4));
		product.typeApprovedUrl(utility.ExcelUtils.getDataAt(1, 5));
		product.clickSubmitBtn();

		checkOut.assertTrue(driver.findElement(By.xpath(profile.getUpdateSuccessfulPath())).isDisplayed());

		checkOut.assertAll();
	}

	@Test(priority = 2)
	public void deleteProduct() throws InterruptedException {
		launchBrowser();
		userLogedIn();

		NavigationBar profile = new NavigationBar(driver, ReadFile.readXPaths());
		profile.clickProductsNav();
		ProductPage product = new ProductPage(driver, ReadFile.readXPaths());

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getCheckboxProductPath())).isDisplayed());
		product.clickCheckboxProduct();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getDeleteProductBtnPath())).isDisplayed());
		product.clickDeleteProductBtn();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getSubmitBtnPath())).isDisplayed());
		product.clickSubmitBtn();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlDeleteProductPage());
		checkOut.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Deleted')]")).isDisplayed());

		Thread.sleep(5000);

		checkOut.assertAll();
	}

	@Test(priority = 3)
	public void createMultipleNewProduct() throws InterruptedException {
		launchBrowser();
		userLogedIn();

		NavigationBar profile = new NavigationBar(driver, ReadFile.readXPaths());
		profile.clickProductsNav();
		ProductPage product = new ProductPage(driver, ReadFile.readXPaths());
		product.clickAddNewProductBtn();

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), start.getUrlCreateNewProductPage());

		utility.ExcelUtils.setExcell("src\\ProductInformation_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		for (int i = 2; i < utility.ExcelUtils.getRowNumber(); i++) {
			product.typeProductName(utility.ExcelUtils.getDataAt(i, 0));
			product.typeProductId(utility.ExcelUtils.getDataAt(i, 1));
			product.typeShortDescription(utility.ExcelUtils.getDataAt(i, 2));
			product.typeLongDescription(utility.ExcelUtils.getDataAt(i, 3));
			product.typeProductPrice(utility.ExcelUtils.getDataAt(i, 4));
			product.typeApprovedUrl(utility.ExcelUtils.getDataAt(i, 5));
			product.clickSubmitBtn();

			checkOut.assertTrue(driver.findElement(By.xpath(profile.getUpdateSuccessfulPath())).isDisplayed());
			Thread.sleep(5000);
			if (i < utility.ExcelUtils.getRowNumber() - 1) {
				profile.clickProductsNav();
				product.clickAddNewProductBtn();
			}
		}
		checkOut.assertAll();
	}

	@Test(priority = 4)
	public void increasePrice() {
		launchBrowser();
		userLogedIn();		

		NavigationBar profile = new NavigationBar(driver, ReadFile.readXPaths());
		profile.clickProductsNav();
		ProductPage product = new ProductPage(driver, ReadFile.readXPaths());
		product.clickEditProductBtn();

		List<String> oldPrice = product.getPriceValue();
		System.out.println("Nove cene");
		product.increasePrice(10.00);
		
		SoftAssert checkOut = new SoftAssert();
		checkOut.assertTrue(driver.findElement(By.xpath(product.getSaveProductChangesBtnPath())).isDisplayed());
		product.clickSaveProductChangesBtn();

		List<String> newPrice = product.getPriceValue();
		for (int i = 0; i < oldPrice.size(); i++) {
			checkOut.assertNotEquals(oldPrice.get(i), newPrice.get(i));
		}
		checkOut.assertTrue(driver.findElement(By.xpath(product.getUpdateSucceedPath())).isDisplayed());

		checkOut.assertAll();
	}

	@AfterMethod
	public void close() {
		utility.ExcelUtils.closeExcell();
		driver.quit();
	}
}
