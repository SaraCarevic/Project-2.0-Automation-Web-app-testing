package page.object;

import java.util.Map;

import org.openqa.selenium.WebDriver;

public class EngineStart {
	WebDriver driver;
	Map<String, String> urls;

	private static final String URLSANDBOXLOGINPAGE = "SANDBOXLOGINPAGE";
	private static final String URLFAILDLOGIN = "FAILEDLOGIN";
	private static final String URLFORGOTPASSWORD = "FORGOTPASSWORDPAGE";
	private static final String URLREGISTRATIONPAGE = "SIGNUPPAGE";

	private static final String URLPROFILEHOMEPAGE = "PROFILEHOMEPAGE";
	private static final String URLACCOUNT = "ACCOUNTNAVBARPROFILEPAGE";
	private static final String URLSALES = "SALESNAVBARPROFILEPAGE";

	private static final String URLPRODUCTS = "PRODUCTSNAVBARPROFILEPAGE";
	private static final String URLEDITPRICEPRODUCT = "PRODUCTEDITPRICEPROFILEPAGE";
	private static final String URLCREATENEWPRODUCT = "CREATENEWPRODUCTPROFILEPAGE";
	private static final String URLDELETEDPRODUCT = "DELETEDPRODUCTPROFILEPAGE";

	private static final String URLSHIPPING = "SHIPPINGNAVBARPROFILEPAGE";
	private static final String URLREPORTS = "REPORTSNAVBARPROFILEPAGE";
	private static final String URLAPI = "APINAVBARPROFILEPAGE";
	private static final String URLNOTIFICATIONS = "NOTIFICATIONSNAVBARPROFILEPAGE";
	private static final String URLHELP = "HELPNAVBARPROFILEPAGE";

	private static final String URLCHECKOUT = "CHECKOUTPAGE";
	private static final String URLTERMSOFUSE = "TERMSOFUSEPAGE";
	private static final String URLPRIVACYPOLICY = "PRIVACYPOLICYPAGE";

	// CONSTRUCTOR
	public EngineStart(WebDriver driver, Map<String, String> urls) {
		this.driver = driver;
		this.urls = urls;
	}

	// LOG IN open & get URL
	public void logInPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLSANDBOXLOGINPAGE));
	}

	public String getUrlLogInPage() {
		String url = ReadFile.getUrl(URLSANDBOXLOGINPAGE);
		return url;
	}
	
	// FAILED LOGIN open & get URL
	public void failedLogInPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLFAILDLOGIN));
	}

	public String getUrlFailedLogInPage() {
		String url = ReadFile.getUrl(URLFAILDLOGIN);
		return url;
	}

	// FORGOT PASSWORD open & get URL
	public void recoveryProfilePage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLFORGOTPASSWORD));
	}

	public String getUrlRecoveryProfilePage() {
		String url = ReadFile.getUrl(URLFORGOTPASSWORD);
		return url;
	}

	// REGISTRATION open & get url
	public void registrationPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLREGISTRATIONPAGE));
	}

	public String getUrlRegistrationPage() {
		String url = ReadFile.getUrl(URLREGISTRATIONPAGE);
		return url;
	}

	// PROFILE HOME open & get URL
	public void homePage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLPROFILEHOMEPAGE));
	}

	public String getUrlProfileHomePage() {
		String url = ReadFile.getUrl(URLPROFILEHOMEPAGE);
		return url;
	}

	// ACCOUNT PAGE open & get URL
	public void accountPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLACCOUNT));
	}

	public String getUrlAccountPage() {
		String url = ReadFile.getUrl(URLACCOUNT);
		return url;
	}

	// SALES PAGE open & get URL
	public void salesPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLSALES));
	}

	public String getUrlSalesPage() {
		String url = ReadFile.getUrl(URLSALES);
		return url;
	}

	// PRODUCT PAGE open & get URL
	public void productPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLPRODUCTS));
	}

	public String getUrlProductPage() {
		String url = ReadFile.getUrl(URLPRODUCTS);
		return url;
	}

	// EDIT PRODUCT PRICE PAGE open & get URL
	public void editProductPricePage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLEDITPRICEPRODUCT));
	}

	public String getUrlEditProductPricePage() {
		String url = ReadFile.getUrl(URLEDITPRICEPRODUCT);
		return url;
	}

	// CREATE NEW PRODUCT PAGE open & get URL
	public void createNewProductPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLCREATENEWPRODUCT));
	}

	public String getUrlCreateNewProductPage() {
		String url = ReadFile.getUrl(URLCREATENEWPRODUCT);
		return url;
	}

	// DELETE PRODUCT PAGE open & get URL
	public void deleteProductPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLDELETEDPRODUCT));
	}

	public String getUrlDeleteProductPage() {
		String url = ReadFile.getUrl(URLDELETEDPRODUCT);
		return url;
	}

	// SHIPPING PAGE open & get URL
	public void shippingPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLSHIPPING));
	}

	public String getUrlShippingPage() {
		String url = ReadFile.getUrl(URLSHIPPING);
		return url;
	}

	// REPORTS PAGE open & get URL
	public void reportsPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLREPORTS));
	}

	public String getUrlReportsPage() {
		String url = ReadFile.getUrl(URLREPORTS);
		return url;
	}

	// API open & get URL
	public void apiPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLAPI));
	}

	public String getUrlApiPage() {
		String url = ReadFile.getUrl(URLAPI);
		return url;
	}

	// NOTIFICATION PAGE open & get URL
	public void notificationPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLNOTIFICATIONS));
	}

	public String getUrlNotificationPage() {
		String url = ReadFile.getUrl(URLNOTIFICATIONS);
		return url;
	}

	// HELP PAGE open & get URL
	public void helpPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLHELP));
	}

	public String getUrlHelpPage() {
		String url = ReadFile.getUrl(URLHELP);
		return url;
	}

	// 2CHECKOUT PAGE open & get URL
	public void checkoutPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLCHECKOUT));
	}

	public String getUrlCheckoutPage() {
		String url = ReadFile.getUrl(URLCHECKOUT);
		return url;
	}

	// TERMS OF USE open & get URL
	public void termsOfUsePage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLTERMSOFUSE));
	}

	public String getUrlTermsOfUsePage() {
		String url = ReadFile.getUrl(URLTERMSOFUSE);
		return url;
	}

	// PRIVACY POLICY open & get URL
	public void privacyPolicyPage(WebDriver driver) {
		driver.get(ReadFile.getUrl(URLPRIVACYPOLICY));
	}

	public String getUrlPrivacyPolicyPage() {
		String url = ReadFile.getUrl(URLPRIVACYPOLICY);
		return url;
	}
}
