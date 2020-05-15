package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String TXTUSERNAME = "TXTUSERNAMESIGNUPPAGE";
	private static final String TXTEMAIL = "TXTEMAILSIGNUPPAGE";
	private static final String TXTPASSWORD = "TXTPASSWORDSIGNUPPAGE";
	private static final String TXTCONFIRMPASSWORD = "TXTCONFIRMPASSWORDSIGNUPPAGE";
	private static final String DBOXABOUTYOU = "DROPBOXABOUTYOUSIGNUPPAGE";
	private static final String DBOXHAVEWEBSITE = "DBOXHAVEWEBSITESIGNUPPAGE";	
	private static final String DBOXTXTWEBSITEURL = "DBOXTXTWEBSITEURLSIGNUPPAGE";	
	private static final String DBOXDONTHAVEWEBSITE = "DBOXDONTHAVEWEBSITESIGNUPPAGE";
	private static final String DBOXSEVERALWEBSITE = "DBOXSEVERALWEBSITESIGNUPPAGE";
	private static final String DBOXALREADYHAVEACCOUNT = "DBOXALREADYHAVEACCOUNTSIGNUPPAGE";
	private static final String DBOXWANTTOPLAY = "DBOXWANTTOPLAYSIGNUPPAGE";
	private static final String LINKLOGIN = "LINKLOGINSIGNUPPAGE";
	private static final String LINKTERMSOFUSE = "LINKTERMSOFUSESIGNUPPAGE";
	private static final String LINKPRIVACYPOLICY = "LINKPRIVACYPOLICYSIGNUPPAGE";
	private static final String BTNSIGNUP = "BTNSIGNUP";
	private static final String LINKTERMSOFUSEFOOTER = "LINKTERMSOFUSEFOOTERSIGNUPPAGE";
	private static final String LINKPRIVAYPOLICYFOOTER = "LINKPRIVACYPOLICYFOOTERSIGNUPPAGE";

	// CONSTRUCTOR
	public Registration(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}
	
	// method to input User name
	public void typeUsername(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTUSERNAME))).sendKeys(key);
	}
	public String getUsernamePath() {
		String xPath = ReadFile.getXPath(TXTUSERNAME);
		return xPath;
	}
	
	// method to input E-mail
	public void typeEmail(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTEMAIL))).sendKeys(key);
	}	
	public String getEmailPath() {
		String xPath = ReadFile.getXPath(TXTEMAIL);	
		return xPath;
	}
	
	// method to input Password
	public void typePassword(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTPASSWORD))).sendKeys(key);
	}	
	public String getPasswordPath() {
		String xPath = ReadFile.getXPath(TXTPASSWORD);		
		return xPath;
	}
	
	// method to input Confirm Password
	public void typeCofirmPassword(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(TXTCONFIRMPASSWORD))).sendKeys(key);
	}
	public String getCofirmPasswordPath() {
		String xPath = ReadFile.getXPath(TXTCONFIRMPASSWORD);		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I have a web site"
	public void chooseHaveWebsite(String key) {
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXHAVEWEBSITE))).click();	
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXTXTWEBSITEURL))).sendKeys(key);
	}
	public String getHaveWebsitePath() {
		String xPath = ReadFile.getXPath(DBOXHAVEWEBSITE);		
		return xPath;
	}
	public String getTxtWebsitePath() {
		String xPath = ReadFile.getXPath(DBOXTXTWEBSITEURL);		
		return xPath;
	}

	// method to click on the button "Tell us about yourself" and pick out "I don't have a web site"
	public void chooseDontHaveWebsite() {
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXDONTHAVEWEBSITE))).click();		
	}
	public String getDontHaveWebsitePath() {
		String xPath = ReadFile.getXPath(DBOXDONTHAVEWEBSITE);		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I manage a several web sites"
	public void chooseSeveralWebsite() {
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXSEVERALWEBSITE))).click();		
	}
	public String getSeveralWebsitePath() {
		String xPath = ReadFile.getXPath(DBOXSEVERALWEBSITE);		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I already have a 2Checkout account"
	public void chooseAlreadyHaveAccount() {
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXALREADYHAVEACCOUNT))).click();		
	}
	public String getAlreadyHaveAccountPath() {
		String xPath = ReadFile.getXPath(DBOXALREADYHAVEACCOUNT);		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I just want to play in the sandbox"
	public void chooseWantToPlay() {
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(DBOXWANTTOPLAY))).click();		
	}
	public String getWantToPlayPath() {
		String xPath = ReadFile.getXPath(DBOXWANTTOPLAY);		
		return xPath;
	}

	// method to click on link "Log in" that will send us on the LoginPage
	public void clickLogIn() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKLOGIN))).click();
	}
	public String getLogInPath() {
		String xPath = ReadFile.getXPath(LINKLOGIN);	
		return xPath;
	}

	// method to click on the link "Terms of Use"
	public void clickTermsOfUse() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKTERMSOFUSE))).click();
	}
	public String getTermsOfUsePath() {
		String xPath = ReadFile.getXPath(LINKTERMSOFUSE);		
		return xPath;
	}

	// method to click on the link "Privacy Policy" 
	public void clickPrivacyPolicy() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKPRIVACYPOLICY))).click();
	}
	public String getPrivacyPolicyPath() {
		String xPath = ReadFile.getXPath(LINKPRIVACYPOLICY);		
		return xPath;
	}

	// method to click on the button "Dig In & Start Testing"
	public void clickSignUp() {
		driver.findElement(By.xpath(ReadFile.getXPath(BTNSIGNUP))).click();
	}
	public String getSignUpPath() {
		String xPath = ReadFile.getXPath(BTNSIGNUP);		
		return xPath;
	}

	// method to click on the link "Terms of Use" in the footer area
	public void clickTermsOfUseFooter() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKTERMSOFUSEFOOTER))).click();
	}
	public String getTermsOfUseFooterPath() {
		String xPath = ReadFile.getXPath(LINKTERMSOFUSEFOOTER);		
		return xPath;
	}

	// method to click on the link "Privacy Policy" in the footer area
	public void clickPrivacyPolicyFooter() {
		driver.findElement(By.xpath(ReadFile.getXPath(LINKPRIVAYPOLICYFOOTER))).click();
	}	
	public String getPrivacyPolicyFooterPath() {
		String xPath = ReadFile.getXPath(LINKPRIVAYPOLICYFOOTER);		
		return xPath;
	}
}
