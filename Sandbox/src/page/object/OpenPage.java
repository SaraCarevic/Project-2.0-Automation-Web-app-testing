package page.object;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class OpenPage {

	WebDriver driver;
	Map<String, String> urls;
	
	private static final String SANDBOXLOGINPAGE = "SANDBOXLOGINPAGE";		
	private static final String FORGOTPASSWORD = "FORGOTPASSWORDPAGE";
	private static final String URLREGISTRATIONPAGE = "SIGNUPPAGE";
	private static final String URLCHECKOUT = "CHECKOUTPAGE";
	private static final String URLTERMSOFUSE = "TERMSOFUSEPAGE";
	private static final String URLPRIVACYPOLICY = "PRIVACYPOLICYPAGE";
	
	// construstor
	public OpenPage(WebDriver driver, Map<String, String> urls) {
		this.driver = driver;
		this.urls = urls;
	}
	
	// method to open LoginPage
	public void openLogin(WebDriver driver) {
		driver.get(urls.get(SANDBOXLOGINPAGE));
	}
	
	public String getUrlLogin() {
		String url = urls.get(SANDBOXLOGINPAGE);
		return url;
	}
	
	// method to open RecoveryProflePage
	public void openRecoveryProfile(WebDriver driver) {
		driver.get(urls.get(FORGOTPASSWORD));
	}
	
/*	public String getUrlForgotPassword() {
		String url = urls.get(FORGOTPASSWORD);
		return url;
	}*/
	public String getAllUrls() {
		String exit = "";
		for (String i : urls.values()) {
			exit += i;
			System.out.println(i);
		}
		return exit;
	}
	
	// method to open RegistrationPage
	public void openRegistration(WebDriver driver) {
		driver.get(urls.get(URLREGISTRATIONPAGE));
	}
	
	// method to open CheckOutPage
	public void openCheckOut(WebDriver driver) {
		driver.get(urls.get(URLCHECKOUT));
	}
	
	// method to open TermsOfUsePage
	public void openTermsOfUse(WebDriver driver) {
		driver.get(urls.get(URLTERMSOFUSE));
	}
	
	// method to open PrivacyPolicyPage
	public void openPrivacyPolicy(WebDriver driver) {
		driver.get(urls.get(URLPRIVACYPOLICY));
	}	
}
