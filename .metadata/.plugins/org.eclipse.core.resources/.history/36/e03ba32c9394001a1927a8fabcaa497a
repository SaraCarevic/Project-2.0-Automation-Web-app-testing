package page.object;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
	WebDriver driver;
	Map<String, String> xPaths;
	
	private static final String ACCOUNTAVATAR = "ACCOUNTAVATARPROFILEPAGE";
	private static final String LOGOUT = "LOGOUTPROFILEPAGE";
	
	// constructor
	public ProfilePage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}
	
	// method to click on the account avatar
	public void clickAccountAvatar() {
		driver.findElement(By.xpath(xPaths.get(ACCOUNTAVATAR))).click();
	}
	
	// method to click on the button "LOGOUT"
	public void clickLogOut() {
		driver.findElement(By.xpath(xPaths.get(LOGOUT))).click();
	}

}
