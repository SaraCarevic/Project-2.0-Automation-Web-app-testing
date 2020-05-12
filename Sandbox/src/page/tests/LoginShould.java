package page.tests;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.LoginPage;
import page.object.OpenPage;

public class LoginShould {
	WebDriver driver;
	Map<String, String> urls = new HashMap<>();
	Map<String, String> xPaths = new HashMap<>();

	@BeforeTest
	public void openLoginForm() {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		OpenPage.openLogin(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void haveUsername() {
		SoftAssert checkOut = new SoftAssert();
		
		String ime = driver.findElement(By.xpath(LoginPage.getTxtUsername())).getTagName();
		System.out.println(ime);
		
		checkOut.assertAll();
		
	}
}
