package page.tests;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.OpenPage;
import page.object.ReadPaths;
import page.object.ReadUrls;

public class OpenPageShould {
	//public String baseUrl = "https://sandbox.2checkout.com/sandbox";
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openLogin(driver);
		//driver.get("https://sandbox.2checkout.com/sandbox");
		//driver.get(baseUrl);
		driver.quit();
	}
/*
	@Test
	public void f() {
		OpenPage homepage = new OpenPage(wb, ReadUrls.readUrls());
		// wb.get(homepage.getUrlLoginPage());
		homepage.openLogin(wb);
		// wb.get(OpenPage.URLLOGINPAGE);
		// wb.get("https://sandbox.2checkout.com/sandbox");
		// wb.get(PageHeader.URL); // treba mi url
		wb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert sa = new SoftAssert();

		// sa.assertTrue(wb.findElement(By.xpath(PageHeader.XPATH_LOGO)).isEnabled());
		// PageHeader.clickLogo(wb);
		// sa.assertTrue(wb.getCurrentUrl().contains(PageHeader.URL));

		wb.quit();
		sa.assertAll();
	}*/
}
