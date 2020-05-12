package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	private static WebDriver driver;
	private static Map<String, String> xPaths;
	
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
	@SuppressWarnings("static-access")
	public RegistrationPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}
	
	// method to input User name
	public static void typeUsername(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTUSERNAME))).sendKeys(key);
	}
	
	// method to input E-mail
	public static void typeEmail(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTEMAIL))).sendKeys(key);
	}	
	
	// method to input Password
	public static void typePassword(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTPASSWORD))).sendKeys(key);
	}	
	
	// method to input Confirm Password
	public static void typeCofirmPassword(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTCONFIRMPASSWORD))).sendKeys(key);
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I have a web site"
	public static void chooseHaveWebsite(String key) {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXHAVEWEBSITE))).click();	
		driver.findElement(By.xpath(xPaths.get(DBOXTXTWEBSITEURL))).sendKeys(key);
	}

	// method to click on the button "Tell us about yourself" and pick out "I don't have a web site"
	public static void chooseDontHaveWebsite() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXDONTHAVEWEBSITE))).click();		
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I manage a several web sites"
	public static void chooseSeveralWebsite() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXSEVERALWEBSITE))).click();		
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I already have a 2Checkout account"
	public static void chooseAlreadyHaveAccount() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXALREADYHAVEACCOUNT))).click();		
	}
	
	// method to click on the button "Tell us about yourself" and pick out "I just want to play in the sandbox"
	public static void chooseWantToPlay() {
		driver.findElement(By.xpath(xPaths.get(DBOXABOUTYOU))).click();
		driver.findElement(By.xpath(xPaths.get(DBOXWANTTOPLAY))).click();		
	}

	// method to click on link "Log in" that will send us on the LoginPage
	public static void clickLogIn() {
		driver.findElement(By.xpath(xPaths.get(LINKLOGIN))).click();
	}

	// method to click on the link "Terms of Use"
	public static void clickTermsOfUse() {
		driver.findElement(By.xpath(xPaths.get(LINKTERMSOFUSE))).click();
	}

	// method to click on the link "Privacy Policy" 
	public static void clickPrivacyPolicy() {
		driver.findElement(By.xpath(xPaths.get(LINKPRIVACYPOLICY))).click();
	}

	// method to click on the button "Dig In & Start Testing"
	public static void clickSignUp() {
		driver.findElement(By.xpath(xPaths.get(BTNSIGNUP))).click();
	}

	// method to click on the link "Terms of Use" in the footer area
	public static void clickTermsOfUseFooter() {
		driver.findElement(By.xpath(xPaths.get(LINKTERMSOFUSEFOOTER))).click();
	}

	// method to click on the link "Privacy Policy" in the footer area
	public static void clickPrivacyPolicyFooter() {
		driver.findElement(By.xpath(xPaths.get(LINKPRIVAYPOLICYFOOTER))).click();
	}

	// GET methods
	public static String getTxtUsername() {return TXTUSERNAME;}
	public static String getTxtEmail() {return TXTEMAIL;}
	public static String getTxtPassword() {return TXTPASSWORD;}
	public static String getTxtConfirmPassword() {return TXTCONFIRMPASSWORD;}
	public static String getDboxAboutYou() {return DBOXABOUTYOU;}
	public static String getDboxHaveWebSite() {return DBOXHAVEWEBSITE;}
	public static String getDboxTxtWebSiteUrl() {return DBOXTXTWEBSITEURL;}
	public static String getDboxDontHaveWebSite() {return DBOXDONTHAVEWEBSITE;}
	public static String getDboxSeveralWebSite() {return DBOXSEVERALWEBSITE;}
	public static String getDboxAlreadyHaveAccount() {return DBOXALREADYHAVEACCOUNT;}
	public static String getDboxWantToPlay() {return DBOXWANTTOPLAY;}
	public static String getLinkLogin() {return LINKLOGIN;}
	public static String getLinkTermsOfUse() {return LINKTERMSOFUSE;}
	public static String getLinkPrivacyPolicy() {return LINKPRIVACYPOLICY;}
	public static String getBtnSignUp() {return BTNSIGNUP;}
	public static String getLinkTermsOfUseFooter() {return LINKTERMSOFUSEFOOTER;}
	public static String getLinkPrivayPolicyFooter() {return LINKPRIVAYPOLICYFOOTER;}	
	
}
