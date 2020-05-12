package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHeader {

	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String LOGO2CHECKOUT = "LINK2CHECKOUTHEADER";
	private static final String HELPICON = "HELPICONHEADER";
	private static final String HELPICONCONTACTEMAIL = "HELPICONCONTACTEMAILHEADER";
	private static final String HELPICONSUPPORT = "HELPICONSUPPORTHEADER";
	private static final String HELPICONCONTACTUS = "HELPICONCONTACTUSHEADER";
	private static final String HELPICONKNOWLEDGEBASE = "HELPICONKNOWLEDGEBASEHEADER";
	private static final String HELPICONDOCUMENTATION = "HELPICONDOCUMENTATIONHEADER";
	
	// constructor
	public PageHeader(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to click on the logo "2CHECKOUT"
	public void clickLogo() {
		driver.findElement(By.xpath(xPaths.get(LOGO2CHECKOUT))).click();
	}
	public String getLogoPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(LOGO2CHECKOUT)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the icon for help information
	public void clickOpenHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
	}
	public String getHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICON)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
	
	// method to click on the icon for help information and pick up "Contact Us email"
	public void chooseEmailInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTEMAIL))).click();
	}
	public String getEmailInTheHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICONCONTACTEMAIL)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the icon for help information and pick up "Support"
	public void chooseSupportInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONSUPPORT))).click();
	}
	public String getSupportInTheHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICONSUPPORT)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the icon for help information and pick up "Contact us"
	public void chooseContactUsInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTUS))).click();
	}
	public String getContactUsInTheHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICONCONTACTUS)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the icon for help information and pick up "Knowledge Base"
	public void chooseKnowledgeBaseInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONKNOWLEDGEBASE))).click();
	}
	public String getKnowledgeBaseInTheHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICONKNOWLEDGEBASE)) xPath = xPaths.get(i);
		}		
		return xPath;
	}

	// method to click on the icon for help information and pick up "Documentation"
	public void chooseDocumentationInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONDOCUMENTATION))).click();
	}	
	public String getDocumentationInTheHelpCenterPath() {
		String xPath = "Error";
		for (String i : xPaths.keySet()) {
			if (i.equals(HELPICONDOCUMENTATION)) xPath = xPaths.get(i);
		}		
		return xPath;
	}
}
