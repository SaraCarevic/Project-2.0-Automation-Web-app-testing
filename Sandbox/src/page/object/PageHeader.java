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

	// method to click on the icon for help information
	public void clickOpenHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
	}
	
	// method to click on the icon for help information and pick up "Contact Us email"
	public void chooseEmailInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTEMAIL))).click();
	}

	// method to click on the icon for help information and pick up "Support"
	public void chooseSupportInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONSUPPORT))).click();
	}

	// method to click on the icon for help information and pick up "Contact us"
	public void chooseContactUsInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTUS ))).click();
	}

	// method to click on the icon for help information and pick up "Knowledge Base"
	public void chooseKnowledgeBaseInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONKNOWLEDGEBASE))).click();
	}

	// method to click on the icon for help information and pick up "Documentation"
	public void chooseDocumentationInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONDOCUMENTATION))).click();
	}	
}
