package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
	
	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String HOME = "NAVBARHOMEPROFILEPAGE";
	private static final String ACCOUNT = "NAVBARACCOUNTPROFILEPAGE";
	private static final String SALES = "NAVBARSALESPROFILEPAGE";
	private static final String PRODUCTS = "NAVBARPRODUCTSPROFILEPAGE";
	private static final String UPDATEPRODUCT = "UPDATEPRODUCTSUCCESSFUL";
	private static final String SHIPPING = "NAVBARSHIPPINGPROFILEPAGE";
	private static final String REPORTS = "NAVBARREPORTSPROFILEPAGE";
	private static final String API = "NAVBARAPIPROFILEPAGE";
	private static final String NOTIFICATIONS = "NAVBARNOTIFICATIONSPROFILEPAGE";
	private static final String HELP = "NAVBARHELPPROFILEPAGE";
	private static final String ACCOUNTAVATAR = "NAVBARACCOUNTAVATARPROFILEPAGE";
	private static final String LOGOUT = "NAVBARLOGOUTPROFILEPAGE";
	
	// constructor
	public NavigationBar(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}
	
	// method to click on the home icon
	public void clickHomeNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(HOME))).click();
	}
	public String getHomeNavPath() {
		String xPath = ReadFile.getXPath(HOME);	
		return xPath;
	}
	
	// method to click on the account 
	public void clickAccountNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(ACCOUNT))).click();
	}
	public String getAccountNavPath() {
		String xPath = ReadFile.getXPath(ACCOUNT);		
		return xPath;
	}
	
	// method to click on the sales icon
	public void clickSalesNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(SALES))).click();
	}
	public String getSalesNavPath() {
		String xPath = ReadFile.getXPath(SALES);		
		return xPath;
	}
	
	// method to click on the products icon
	public void clickProductsNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(PRODUCTS))).click();
	}
	public String getProductsNavPath() {
		String xPath = ReadFile.getXPath(PRODUCTS);			
		return xPath;
	}
	
	// method to get update successful path
	public String getUpdateSuccessfulPath() {
		String xPath = ReadFile.getXPath(UPDATEPRODUCT);			
		return xPath;
	}
	
	// method to click on the shipping icon
	public void clickShippingNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(SHIPPING))).click();
	}
	public String getShippingNavPath() {
		String xPath = ReadFile.getXPath(SHIPPING);			
		return xPath;
	}
	
	// method to click on the reports icon
	public void clickReportsNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(REPORTS))).click();
	}
	public String getReportsNavPath() {
		String xPath = ReadFile.getXPath(REPORTS);			
		return xPath;
	}
	
	// method to click on the api icons
	public void clickApiNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(API))).click();
	}
	public String getApiNavPath() {
		String xPath = ReadFile.getXPath(API);			
		return xPath;
	}
	
	// method to click on the noticifations icon
	public void clickNotificationsNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(NOTIFICATIONS))).click();
	}
	public String getNotificationsNavPath() {
		String xPath = ReadFile.getXPath(NOTIFICATIONS);			
		return xPath;
	}
	
	// method to click on the help icon
	public void clickHelpNav() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELP))).click();
	}
	public String getHelpNavPath() {
		String xPath = ReadFile.getXPath(HELP);			
		return xPath;
	}
	
	// method to click on the account avatar
	public void clickAccountAvatar() {
		driver.findElement(By.xpath(ReadFile.getXPath(ACCOUNTAVATAR))).click();
	}
	public String getAccountAvatarPath() {
		String xPath = ReadFile.getXPath(ACCOUNTAVATAR);			
		return xPath;
	}
	
	// method to click on the button "LOGOUT"
	public void clickLogOut() {
		driver.findElement(By.xpath(ReadFile.getXPath(LOGOUT))).click();
	}
	public String getLogOutPath() {
		String xPath = ReadFile.getXPath(LOGOUT);			
		return xPath;
	}

}
