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
	private static final String PROFILEHOMEPAGE = "PROFILEHOMEPAGE";
	
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
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(SANDBOXLOGINPAGE)) url = urls.get(i);
		}		
		return url;
	}
	
	// method to open RecoveryProflePage
	public void openRecoveryProfile(WebDriver driver) {
		driver.get(urls.get(FORGOTPASSWORD));
	}
	
	public String getUrlForgotPassword() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(FORGOTPASSWORD)) url = urls.get(i);
		}		
		return url;
	}
	
	// method to open RegistrationPage
	public void openRegistration(WebDriver driver) {
		driver.get(urls.get(URLREGISTRATIONPAGE));
	}
	
	public String getUrlRegistration() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(URLREGISTRATIONPAGE)) url = urls.get(i);
		}		
		return url;
	}
	
	// method to open CheckOutPage
	public void openCheckOut(WebDriver driver) {
		driver.get(urls.get(URLCHECKOUT));
	}
	
	public String getUrlCheckOut() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(URLCHECKOUT)) url = urls.get(i);
		}		
		return url;
	}
	
	// method to open TermsOfUsePage
	public void openTermsOfUse(WebDriver driver) {
		driver.get(urls.get(URLTERMSOFUSE));
	}
	
	public String getUrlTermsOfUse() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(URLTERMSOFUSE)) url = urls.get(i);
		}		
		return url;
	}
	
	// method to open PrivacyPolicyPage
	public void openPrivacyPolicy(WebDriver driver) {
		driver.get(urls.get(URLPRIVACYPOLICY));
	}
	
	public String getUrlPrivacyPolicy() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(URLPRIVACYPOLICY)) url = urls.get(i);
		}		
		return url;
	}
	
	// get profile page url
	public String getUrlProfile() {
		String url = "Error";
		for (String i : urls.keySet()) {
			if (i.equals(PROFILEHOMEPAGE)) url = urls.get(i);
		}		
		return url;
	}
}
