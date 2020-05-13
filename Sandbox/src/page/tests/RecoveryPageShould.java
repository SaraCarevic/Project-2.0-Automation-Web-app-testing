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
import page.object.ReadPaths;
import page.object.ReadUrls;
import page.object.RecoveryProfilePage;

public class RecoveryPageShould {
	WebDriver driver;
	Map<String, String> urls = new HashMap<>();
	Map<String, String> xPaths = new HashMap<>();
	
	@Test
	public void haveElements() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRecoveryProfile(driver);	
		Thread.sleep(5000);

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), open.getUrlForgotPassword());
		
		RecoveryProfilePage recovery = new RecoveryProfilePage(driver, ReadPaths.readXPaths());
		checkOut.assertTrue(driver.findElement(By.xpath(recovery.getXPathUsername())).isEnabled());
		checkOut.assertTrue(driver.findElement(By.xpath(recovery.getXPathEmail())).isEnabled());
		checkOut.assertTrue(driver.findElement(By.xpath(recovery.getXPathLogIn())).isEnabled());
		
		checkOut.assertAll();
		driver.close();
	}
	
	@Test
	public void notRecoverWithoutUsername() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRecoveryProfile(driver);	
		Thread.sleep(5000);

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), open.getUrlForgotPassword());
		
		RecoveryProfilePage recovery = new RecoveryProfilePage(driver, ReadPaths.readXPaths());
		recovery.clickSendEmail();
		checkOut.assertFalse(driver.findElement(By.xpath(recovery.getXPathConfirmLoginReset())).isEnabled());
		
		checkOut.assertAll();
		driver.close();
	}

	@Test
	public void recoverProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		OpenPage open = new OpenPage(driver, ReadUrls.readUrls());
		open.openRecoveryProfile(driver);	
		Thread.sleep(5000);

		SoftAssert checkOut = new SoftAssert();
		checkOut.assertEquals(driver.getCurrentUrl(), open.getUrlForgotPassword());
		
		RecoveryProfilePage recovery = new RecoveryProfilePage(driver, ReadPaths.readXPaths());
		utility.ExcelUtils.setExcell("src\\SignUp_data.xlsx");
		utility.ExcelUtils.setWorkSheet(0);
		recovery.typeUsername(utility.ExcelUtils.getDataAt(1, 0));
		checkOut.assertTrue(driver.findElement(By.xpath(recovery.getXPathEmail())).isEnabled());
		recovery.clickSendEmail();
		checkOut.assertTrue(driver.findElement(By.xpath(recovery.getXPathConfirmLoginReset())).isEnabled());
		
		checkOut.assertAll();
		driver.close();
	}
}
