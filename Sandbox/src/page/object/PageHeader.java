package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHeader {

	private static WebDriver driver;
	private static Map<String, String> xPaths;
	
	private static final String LOGO2CHECKOUT = "LINK2CHECKOUTHEADER";
	private static final String HELPICON = "HELPICONHEADER";
	private static final String HELPICONCONTACTEMAIL = "HELPICONCONTACTEMAILHEADER";
	private static final String HELPICONSUPPORT = "HELPICONSUPPORTHEADER";
	private static final String HELPICONCONTACTUS = "HELPICONCONTACTUSHEADER";
	private static final String HELPICONKNOWLEDGEBASE = "HELPICONKNOWLEDGEBASEHEADER";
	private static final String HELPICONDOCUMENTATION = "HELPICONDOCUMENTATIONHEADER";
	
	// constructor
	@SuppressWarnings("static-access")
	public PageHeader(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to click on the logo "2CHECKOUT"
	public static void clickLogo() {
		driver.findElement(By.xpath(xPaths.get(LOGO2CHECKOUT))).click();
	}

	// method to click on the icon for help information
	public static void clickOpenHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
	}
	
	// method to click on the icon for help information and pick up "Contact Us email"
	public static void chooseEmailInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTEMAIL))).click();
	}

	// method to click on the icon for help information and pick up "Support"
	public static void chooseSupportInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONSUPPORT))).click();
	}

	// method to click on the icon for help information and pick up "Contact us"
	public static void chooseContactUsInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONCONTACTUS ))).click();
	}

	// method to click on the icon for help information and pick up "Knowledge Base"
	public static void chooseKnowledgeBaseInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONKNOWLEDGEBASE))).click();
	}

	// method to click on the icon for help information and pick up "Documentation"
	public static void chooseDocumentationInTheHelpCenter() {
		driver.findElement(By.xpath(xPaths.get(HELPICON))).click();
		driver.findElement(By.xpath(xPaths.get(HELPICONDOCUMENTATION))).click();
	}

	// GET methods
	public static String getLogo2checkout() {return LOGO2CHECKOUT;}
	public static String getHelpIcon() {return HELPICON;}
	public static String getHelpIconContactEmail() {return HELPICONCONTACTEMAIL;}
	public static String getHelpIconSupport() {return HELPICONSUPPORT;}
	public static String getHelpIconContactUs() {return HELPICONCONTACTUS;}
	public static String getHelpIconKnowledgeBase() {return HELPICONKNOWLEDGEBASE;}
	public static String getHelpIconDocumentation() {return HELPICONDOCUMENTATION;}

	
}
