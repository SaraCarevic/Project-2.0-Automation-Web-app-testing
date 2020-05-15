package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword {
	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String TXTUSERNAME = "TXTUSERNAMERESETPAGE";
	private static final String BTNEMAIL = "BTNEMAILRESETPAGE";
	private static final String LINKLOGIN = "LINKLOGINRESETPAGE";
	private static final String BTNCONFIRMLOGINRESET = "BTNCONFIRMLOGINRESETPAGE";

	// CONSTRUCTOR
	public ResetPassword(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to input the user name 
	public void typeUsername(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTUSERNAME))).sendKeys(key);
	}
	public String getXPathUsername() {
		String paths = ReadFile.getXPath(TXTUSERNAME);
		return paths;
	}

	// method to click on the button "Send Reset Email"
	public void clickSendEmail() {
		driver.findElement(By.xpath(ReadFile.getXPath(BTNEMAIL))).click();
	}
	public String getXPathEmail() {
		String paths = ReadFile.getXPath(BTNEMAIL);	
		return paths;
	}

	// method to click on the link "Login" that will send us back on the LoginPage
	public void clickLogin() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKLOGIN))).click();
	}
	public String getXPathLogIn() {
		String paths = ReadFile.getXPath(LINKLOGIN);	
		return paths;
	}

	// method to click on the button to get to the login form after email to recover profile sent
	public void clickConfirmLoginReset() {
		driver.findElement(By.xpath(ReadFile.getXPath(BTNCONFIRMLOGINRESET))).click();
	}
	public String getXPathConfirmLoginReset() {
		String paths = ReadFile.getXPath(BTNCONFIRMLOGINRESET);		
		return paths;
	}
}
