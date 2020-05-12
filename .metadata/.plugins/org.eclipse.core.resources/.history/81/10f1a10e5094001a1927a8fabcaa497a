package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	static WebDriver driver;
	static Map<String, String> xPaths;
	
	private static final String TXTUSERNAME = "TXTUSERNAMELOGINPAGE";
	private static final String TXTPASSWORD = "TXTPASSWORDLOGINPAGE";
	private static final String LINKFORGOTPASSWORD = "LINKFORGOTPASSWORDLOGINPAGE";
	private static final String BTNLOGIN = "BTNLOGIN";
	private static final String LINKSIGNUP = "LINKSIGNUPLOGINPAGE";
	private static final String LINKTERMSOFUSE = "LINKTERMSOFUSEFOOTERLOGINPAGE";
	private static final String LINKPRIVACYPOLICY = "LINKPRIVACYPOLICYFOOTERLOGINPAGE";

	// constructor
	@SuppressWarnings("static-access")
	public LoginPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to input the user name 
	public static void typeUsername(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTUSERNAME))).sendKeys(key);
	}

	// method to input the password
	public static void typePassword(String key) {
		driver.findElement(By.xpath(xPaths.get(TXTPASSWORD))).sendKeys(key);
	}

	// method to click on the link "Forgot password" that will send us on the RecoveryProfilePage
	public static void clickForgotPassword() {
		driver.findElement(By.xpath(xPaths.get(LINKFORGOTPASSWORD))).click();
	}

	// method to click on the button "Log in to your account"
	public static void clickLoginButton() {
		driver.findElement(By.xpath(xPaths.get(BTNLOGIN))).click();
	}

	// method to click on the link "Sign up" that will send us on the RegistrationPage
	public static void clickSignUp() {
		driver.findElement(By.xpath(xPaths.get(LINKSIGNUP))).click();
	}

	// method to click on the link "Terms of Use"
	public static void clickTermsOfUse() {
		driver.findElement(By.xpath(xPaths.get(LINKTERMSOFUSE))).click();
	}

	// method to click on the link "Privacy Policy"
	public static void clickPrivacyPolicy() {
		driver.findElement(By.xpath(xPaths.get(LINKPRIVACYPOLICY))).click();
	}

	// GET methods
	public static String getTxtUsername() {return TXTUSERNAME;}
	public static String getTxtPassword() {return TXTPASSWORD;}
	public static String getLinkForgotPassword() {return LINKFORGOTPASSWORD;}
	public static String getBtnLogin() {return BTNLOGIN;}
	public static String getLinkSignUp() {return LINKSIGNUP;}
	public static String getLinkTermsOfUse() {return LINKTERMSOFUSE;}
	public static String getLinkPrivacyPolicy() {return LINKPRIVACYPOLICY;}
}
