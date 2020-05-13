package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePageNavBar {
	
	WebDriver driver;
	Map<String, String> xPaths;
	Map<String, String> urls;
	
	private static final String HOME = "NAVBARHOMEPROFILEPAGE";
	private static final String ACCOUNT = "NAVBARACCOUNTPROFILEPAGE";
	private static final String SALES = "NAVBARSALESPROFILEPAGE";
	private static final String PRODUCTS = "NAVBARPRODUCTSPROFILEPAGE";
	private static final String SHIPPING = "NAVBARSHIPPINGPROFILEPAGE";
	private static final String REPORTS = "NAVBARREPORTSPROFILEPAGE";
	private static final String API = "NAVBARAPIPROFILEPAGE";
	private static final String NOTIFICATIONS = "NAVBARNOTIFICATIONSPROFILEPAGE";
	private static final String HELP = "NAVBARHELPPROFILEPAGE";
	private static final String ACCOUNTAVATAR = "NAVBARACCOUNTAVATARPROFILEPAGE";
	private static final String LOGOUT = "NAVBARLOGOUTPROFILEPAGE";
	
	// constructor
	public ProfilePageNavBar(WebDriver driver, Map<String, String> xPaths, Map<String, String> urls) {
		this.driver = driver;
		this.xPaths = xPaths;
		this.urls = urls;
	}
	
	// method to click on the home icon
	public void clickHomeNav() {
		driver.findElement(By.xpath(xPaths.get(HOME))).click();
	}
	public String getHomeNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HOME)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the account 
	public void clickAccountNav() {
		driver.findElement(By.xpath(xPaths.get(ACCOUNT))).click();
	}
	public String getAccountNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(ACCOUNT)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the sales icon
	public void clickSalesNav() {
		driver.findElement(By.xpath(xPaths.get(SALES))).click();
	}
	public String getSalesNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(SALES)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the products icon
	public void clickProductsNav() {
		driver.findElement(By.xpath(xPaths.get(PRODUCTS))).click();
	}
	public String getProductsNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(PRODUCTS)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the shipping icon
	public void clickShippingNav() {
		driver.findElement(By.xpath(xPaths.get(SHIPPING))).click();
	}
	public String getShippingNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(SHIPPING)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the reports icon
	public void clickReportsNav() {
		driver.findElement(By.xpath(xPaths.get(REPORTS))).click();
	}
	public String getReportsNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(REPORTS)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the api icons
	public void clickApiNav() {
		driver.findElement(By.xpath(xPaths.get(API))).click();
	}
	public String getApiNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(API)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the noticifations icon
	public void clickNotificationsNav() {
		driver.findElement(By.xpath(xPaths.get(NOTIFICATIONS))).click();
	}
	public String getNotificationsNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(NOTIFICATIONS)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the help icon
	public void clickHelpNav() {
		driver.findElement(By.xpath(xPaths.get(HELP))).click();
	}
	public String getHelpNavPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELP)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the account avatar
	public void clickAccountAvatar() {
		driver.findElement(By.xpath(xPaths.get(ACCOUNTAVATAR))).click();
	}
	public String getAccountAvatarPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(ACCOUNTAVATAR)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the button "LOGOUT"
	public void clickLogOut() {
		driver.findElement(By.xpath(xPaths.get(LOGOUT))).click();
	}
	public String getLogOutPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LOGOUT)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

}
