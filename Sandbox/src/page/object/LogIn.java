package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String TXTUSERNAME = "TXTUSERNAMELOGINPAGE";
	private static final String TXTPASSWORD = "TXTPASSWORDLOGINPAGE";
	private static final String LINKFORGOTPASSWORD = "LINKFORGOTPASSWORDLOGINPAGE";
	private static final String BTNLOGIN = "BTNLOGIN";
	private static final String LINKSIGNUP = "LINKSIGNUPLOGINPAGE";
	private static final String LINKTERMSOFUSE = "LINKTERMSOFUSEFOOTERLOGINPAGE";
	private static final String LINKPRIVACYPOLICY = "LINKPRIVACYPOLICYFOOTERLOGINPAGE";

	// CONSTRUCTOR
	public LogIn(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to input the user name 
	public void typeUsername(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTUSERNAME))).sendKeys(key);
	}
	public String getXPathUsername() {
		String xPath = ReadFile.getXPath(TXTUSERNAME);
		return xPath;
	}

	// method to input the password
	public void typePassword(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTPASSWORD))).sendKeys(key);
	}
	public String getXPathPassword() {
		String xPath = ReadFile.getXPath(TXTPASSWORD);
		return xPath;
	}

	// method to click on the link "Forgot password" that will send us on the RecoveryProfilePage
	public void clickForgotPasswordLink() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKFORGOTPASSWORD))).click();
	}
	public String getXPathForgotPasswordLink() {
		String xPath = ReadFile.getXPath(LINKFORGOTPASSWORD);
		return xPath;
	}

	// method to click on the button "Log in to your account"
	public void clickLoginButton() {
		driver.findElement(By.xpath(ReadFile.getXPath(BTNLOGIN))).click();
	}
	public String getXPathLoginButton() {
		String xPath = ReadFile.getXPath(BTNLOGIN);
		return xPath;
	}

	// method to click on the link "Sign up" that will send us on the RegistrationPage
	public void clickSignUpLink() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKSIGNUP))).click();
	}
	public String getXPathSignUpLink() {
		String xPath = ReadFile.getXPath(LINKSIGNUP);
		return xPath;
	}

	// method to click on the link "Terms of Use"
	public void clickTermsOfUseLink() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKTERMSOFUSE))).click();
	}
	public String getXPathTermsOfUseLink() {
		String xPath = ReadFile.getXPath(LINKTERMSOFUSE);
		return xPath;
	}

	// method to click on the link "Privacy Policy"
	public void clickPrivacyPolicyLink() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKPRIVACYPOLICY))).click();
	}
	public String getXPathPrivacyPolicyLink() {
		String xPath = ReadFile.getXPath(LINKPRIVACYPOLICY);
		return xPath;
	}
}
