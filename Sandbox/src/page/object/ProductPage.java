package page.object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	WebDriver driver;
	Map<String, String> xPaths;

	private final static String ADDNEWPRODUCT = "BTNADDNEWPRODUCT";
	private final static String CHECKBOXPRODUCT = "ONEPRODUCTCHECKBOXPRODUCT";
	private final static String DELETEPRODUCT = "BTNDELETEPRODUCT";
	private final static String PRODUCTNAME = "PRODUCTINFORMATIONPRODUCTNAME";
	private final static String PRODUCTID = "PRODUCTINFORMATIONPRODUCTID";
	private final static String SHORTPRODUCTDESCRIPTION = "PRODUCTINFORMATIONSHORTPRODUCTDESCRIPTION";
	private final static String LONGPRODUCTDESCRIPTION = "PRODUCTINFORMATIONLONGPRODUCTDESCRIPTION";
	private final static String PRODUCTPRICE = "PRODUCTINFORMATIONPRODUCTPRICE";
	private final static String APPROVEDPRODUCTURL = "PRODUCTINFORMATIONAPPROVEDURL";
	private final static String SUBMIT = "CREATINGPRODUCTSUBMIT";
	private final static String EDITPRODUCT = "BTNEDITPRODUCT";
	private final static String SAVEPRODUCTCHANGES = "BTNSAVEPRODUCTCHANGES";
	private final static String UPDATESUCCEED = "TEXTALLUPDATESUCCEEDEDEDITPRODUCTS";

	// constructor
	public ProductPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// method to click add new product
	public void clickAddNewProductBtn() {
		driver.findElement(By.xpath(ReadFile.getXPath(ADDNEWPRODUCT))).click();
	}

	public String getAddNewProductBtnPath() {
		String xPath = ReadFile.getXPath(ADDNEWPRODUCT);
		return xPath;
	}

	// method to click checkbox product when we have ONLY ONE product!!!
	public void clickCheckboxProduct() {
		driver.findElement(By.xpath(ReadFile.getXPath(CHECKBOXPRODUCT))).click();
	}

	public String getCheckboxProductPath() {
		String xPath = ReadFile.getXPath(CHECKBOXPRODUCT);
		return xPath;
	}

	// method to click delete product
	public void clickDeleteProductBtn() {
		driver.findElement(By.xpath(ReadFile.getXPath(DELETEPRODUCT))).click();
	}

	public String getDeleteProductBtnPath() {
		String xPath = ReadFile.getXPath(DELETEPRODUCT);
		return xPath;
	}

	// method to input product name
	public void typeProductName(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(PRODUCTNAME))).sendKeys(keys);
	}

	public String getProductNamePath() {
		String xPath = ReadFile.getXPath(PRODUCTNAME);
		return xPath;
	}

	// method to input product id
	public void typeProductId(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(PRODUCTID))).sendKeys(keys);
	}

	public String getProductIdPath() {
		String xPath = ReadFile.getXPath(PRODUCTID);
		return xPath;
	}

	// method to input short description
	public void typeShortDescription(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(SHORTPRODUCTDESCRIPTION))).sendKeys(keys);
	}

	public String getShortDescriptionPath() {
		String xPath = ReadFile.getXPath(SHORTPRODUCTDESCRIPTION);
		return xPath;
	}

	// method to input long description
	public void typeLongDescription(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(LONGPRODUCTDESCRIPTION))).sendKeys(keys);
	}

	public String getLongDescriptionPath() {
		String xPath = ReadFile.getXPath(LONGPRODUCTDESCRIPTION);
		return xPath;
	}

	// method to input product price
	public void typeProductPrice(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(PRODUCTPRICE))).sendKeys(keys);
	}

	public String getProductPricePath() {
		String xPath = ReadFile.getXPath(PRODUCTPRICE);
		return xPath;
	}

	// method to input approved url
	public void typeApprovedUrl(String keys) {
		driver.findElement(By.xpath(ReadFile.getXPath(APPROVEDPRODUCTURL))).sendKeys(keys);
	}

	public String getApprovedUrlPath() {
		String xPath = ReadFile.getXPath(APPROVEDPRODUCTURL);
		return xPath;
	}

	// method to click submit button
	public void clickSubmitBtn() {
		driver.findElement(By.xpath(ReadFile.getXPath(SUBMIT))).click();
	}

	public String getSubmitBtnPath() {
		String xPath = ReadFile.getXPath(SUBMIT);
		return xPath;
	}

	// increasePrice
	public void priceChange(Integer priceChange) {
		List<WebElement> product = driver.findElements(By.xpath("//*[contains(@name, 'price')]"));
		Iterator<WebElement> itr = product.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			String value = itr.next().getAttribute("value");
			int incValue = priceChange + Integer.parseInt(value);
			System.out.println(incValue);
			element.clear();
			element.sendKeys(String.valueOf(incValue));
		}
	}

	// edit product button
	public void clickEditProductBtn() {
		driver.findElement(By.xpath(ReadFile.getXPath(EDITPRODUCT))).click();
	}

	public String getEditProductBtnPath() {
		String xPath = ReadFile.getXPath(EDITPRODUCT);
		return xPath;
	}

	public void increasePrice(Double increase) {
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(@name, 'price')]"));
		Iterator<WebElement> itr = products.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			String oldPrice = itr.next().getAttribute("value");
			double incPrice = increase + Double.parseDouble(oldPrice);
			element.clear();
			element.sendKeys(String.valueOf(incPrice));
		}
	}

	// save product changes
	public void clickSaveProductChangesBtn() {
		driver.findElement(By.xpath(ReadFile.getXPath(SAVEPRODUCTCHANGES))).click();
	}

	public String getSaveProductChangesBtnPath() {
		String xPath = ReadFile.getXPath(SAVEPRODUCTCHANGES);
		return xPath;
	}

	// product price edited check
	public String getUpdateSucceedPath() {
		String xPath = ReadFile.getXPath(UPDATESUCCEED);
		return xPath;
	}

	// xPath of checkbox is not the same when we have more then one product
	// checkbox - select al boxes - so we can delete more then one product
	public void checkAllProducts() {
		List<WebElement> allElements = driver.findElements(By.cssSelector("input"));
		for (WebElement anElement : allElements) {
			if (anElement.getAttribute("type").equals("checkbox")) {
				anElement.click();
			}
		}
	}

	// get XPaths for edited price
	public List<String> getPriceValue() {
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@name, 'price')]"));
		Iterator<WebElement> itr = elements.iterator();
		List<String> prices = new ArrayList<>();
		while (itr.hasNext()) {
			//WebElement element = itr.next();
			String oldPrice = itr.next().getAttribute("value");
			prices.add(oldPrice);
			//double incPrice = increase + Double.parseDouble(oldPrice);
			//element.clear();
			//element.sendKeys(String.valueOf(incPrice));
		}
		return prices;
	}
}
