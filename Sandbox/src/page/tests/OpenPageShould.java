package page.tests;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.OpenPage;
import page.object.ReadUrls;

public class OpenPageShould {
	Map<String, String> urls;
	WebDriver driver;

	@Test
	public void openLoginPage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openLogin(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		checkOut.assertEquals(driver.getCurrentUrl(), "https://sandbox.2checkout.com/sandbox");
		checkOut.assertTrue(driver.getCurrentUrl().contains(open.getUrlLogin()));
		
		checkOut.assertAll();
		driver.quit();
	}
	
	@Test
	public void openRecoveryProfile() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRecoveryProfile(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SoftAssert checkOut = new SoftAssert();

		checkOut.assertEquals(driver.getCurrentUrl(), "https://sandbox.2checkout.com/sandbox/noauth/forgotten_password");
		checkOut.assertTrue(driver.getCurrentUrl().contains(open.getAllUrls()));
		
		checkOut.assertAll();
		driver.quit();
	}
}
