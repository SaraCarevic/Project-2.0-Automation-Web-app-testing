package page.tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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

	}

	@Test
	public void haveUsername() {

		
	}
}
