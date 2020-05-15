package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartHeaderPage {

	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String LOGO2CHECKOUT = "LINK2CHECKOUTHEADER";
	private static final String HELPICON = "HELPICONHEADER";
	private static final String HELPICONCONTACTEMAIL = "HELPICONCONTACTEMAILHEADER";
	private static final String HELPICONSUPPORT = "HELPICONSUPPORTHEADER";
	private static final String HELPICONCONTACTUS = "HELPICONCONTACTUSHEADER";
	private static final String HELPICONKNOWLEDGEBASE = "HELPICONKNOWLEDGEBASEHEADER";
	private static final String HELPICONDOCUMENTATION = "HELPICONDOCUMENTATIONHEADER";
	
	// CONSTRUCTOR
	public StartHeaderPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to click on the logo "2CHECKOUT"
	public void clickLogo() {
		driver.findElement(By.xpath(ReadFile.getXPath(LOGO2CHECKOUT))).click();
	}
	public String getLogoPath() {
		String xPath = ReadFile.getXPath(LOGO2CHECKOUT);
		return xPath;
	}

	// method to click on the icon for help information
	public void clickOpenHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
	}
	public String getHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICON);
		return xPath;
	}
	
	// method to click on the icon for help information and pick up "Contact Us email"
	public void chooseEmailInTheHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICONCONTACTEMAIL))).click();
	}
	public String getEmailInTheHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICONCONTACTEMAIL);
		return xPath;
	}

	// method to click on the icon for help information and pick up "Support"
	public void chooseSupportInTheHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICONSUPPORT))).click();
	}
	public String getSupportInTheHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICONSUPPORT);
		return xPath;
	}

	// method to click on the icon for help information and pick up "Contact us"
	public void chooseContactUsInTheHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICONCONTACTUS))).click();
	}
	public String getContactUsInTheHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICONCONTACTUS);
		return xPath;
	}

	// method to click on the icon for help information and pick up "Knowledge Base"
	public void chooseKnowledgeBaseInTheHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICONKNOWLEDGEBASE))).click();
	}
	public String getKnowledgeBaseInTheHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICONKNOWLEDGEBASE);		
		return xPath;
	}

	// method to click on the icon for help information and pick up "Documentation"
	public void chooseDocumentationInTheHelpCenter() {
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICON))).click();
		driver.findElement(By.xpath(ReadFile.getXPath(HELPICONDOCUMENTATION))).click();
	}	
	public String getDocumentationInTheHelpCenterPath() {
		String xPath = ReadFile.getXPath(HELPICONDOCUMENTATION);			
		return xPath;
	}
}
