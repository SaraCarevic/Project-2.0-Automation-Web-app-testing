package page.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.OpenPage;
import page.object.PageHeader;

public class HeaderShould {
	
	Map<String, String> xPaths = new HashMap<>();
	
	@Test
	public void haveLogo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		OpenPage.openLogin(driver);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SoftAssert sa = new SoftAssert();

		// clickable text
		sa.assertTrue(driver.findElement(By.xpath(PageHeader.getLogo2checkout())).isEnabled());

		driver.close();
		sa.assertAll();
	}
}