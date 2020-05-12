package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

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

	// constructor
	public RegistrationPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}
	
	// method to input User name
	public void typeUsername(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTUSERNAME))).sendKeys(key);
	}
	public String getUsernamePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(TXTUSERNAME)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to input E-mail
	public void typeEmail(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTEMAIL))).sendKeys(key);
	}	
	public String getEmailPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(TXTEMAIL)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to input Password
	public void typePassword(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTPASSWORD))).sendKeys(key);
	}	
	public String getPasswordPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(TXTPASSWORD)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to input Confirm Password
	public void typeCofirmPassword(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTCONFIRMPASSWORD))).sendKeys(key);
	}
	public String getCofirmPasswordPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(TXTCONFIRMPASSWORD)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I have a web site"
	public String getAboutYou() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXABOUTYOU)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	public void chooseHaveWebsite(String key) {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXHAVEWEBSITE))).click();	
		driver.findElement(By.xpath(xPaths.get(DBOXTXTWEBSITEURL))).sendKeys(key);
	}
	public String getHaveWebsitePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXHAVEWEBSITE)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	public String getTxtWebsitePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXTXTWEBSITEURL)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the button "Tell us about yourself" and pick out "I don't have a web site"
	public void chooseDontHaveWebsite() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXDONTHAVEWEBSITE))).click();		
	}
	public String getDontHaveWebsitePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXDONTHAVEWEBSITE)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I manage a several web sites"
	public void chooseSeveralWebsite() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXSEVERALWEBSITE))).click();		
	}
	public String getSeveralWebsitePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXSEVERALWEBSITE)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I already have a 2Checkout account"
	public void chooseAlreadyHaveAccount() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXALREADYHAVEACCOUNT))).click();		
	}
	public String getAlreadyHaveAccountPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXALREADYHAVEACCOUNT)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I just want to play in the sandbox"
	public void chooseWantToPlay() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXWANTTOPLAY))).click();		
	}
	public String getWantToPlayPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(DBOXWANTTOPLAY)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on link "Log in" that will send us on the LoginPage
	public void clickLogIn() {
		driver.findElement(By.xpath(xPaths.get(LINKLOGIN))).click();
	}
	public String getLogInPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LINKLOGIN)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the link "Terms of Use"
	public void clickTermsOfUse() {
		driver.findElement(By.xpath(xPaths.get(LINKTERMSOFUSE))).click();
	}
	public String getTermsOfUsePath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LINKTERMSOFUSE)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the link "Privacy Policy" 
	public void clickPrivacyPolicy() {
		driver.findElement(By.xpath(xPaths.get(LINKPRIVACYPOLICY))).click();
	}
	public String getPrivacyPolicyPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LINKPRIVACYPOLICY)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the button "Dig In & Start Testing"
	public void clickSignUp() {
		driver.findElement(By.xpath(xPaths.get(BTNSIGNUP))).click();
	}
	public String getSignUpPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(BTNSIGNUP)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the link "Terms of Use" in the footer area
	public void clickTermsOfUseFooter() {
		driver.findElement(By.xpath(xPaths.get(LINKTERMSOFUSEFOOTER))).click();
	}
	public String getTermsOfUseFooterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LINKTERMSOFUSEFOOTER)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the link "Privacy Policy" in the footer area
	public void clickPrivacyPolicyFooter() {
		driver.findElement(By.xpath(xPaths.get(LINKPRIVAYPOLICYFOOTER))).click();
	}	
	public String getPrivacyPolicyFooterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LINKPRIVAYPOLICYFOOTER)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
}
