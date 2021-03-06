package page.tests;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.ReadFile;

public class ReadFileShould {
	@Test
	public void beAbleToPrintMapAndCheckIfExistWantedXPath() {
		System.out.println();
		System.out.println("XPaths     XPaths     XPaths     XPaths     XPaths");
		System.out.println();
		Map<String, String> xPaths = ReadFile.readXPaths();
		for (String name : xPaths.keySet()) {
			String key = name.toString();
			String value = xPaths.get(name).toString();
			System.out.println(key + " " + value);
		}
		
		SoftAssert checkOut = new SoftAssert();
		// check out first key & value
		checkOut.assertTrue(ReadFile.readXPaths().containsKey("TXTUSERNAMELOGINPAGE"));
		checkOut.assertTrue(ReadFile.readXPaths().containsValue(ReadFile.getXPath("TXTUSERNAMELOGINPAGE")));
		// check out last key & value
		checkOut.assertTrue(ReadFile.readXPaths().containsKey("UPDATEPRODUCTSUCCESSFUL"));
		checkOut.assertTrue(ReadFile.readXPaths().containsValue(ReadFile.getXPath("UPDATEPRODUCTSUCCESSFUL")));
		
		checkOut.assertAll();
	}

	@Test
	public void beAbleToPrintMapAndCheckIfExistWantedUrl() {
		System.out.println();
		System.out.println("URLs     URLs     URLs     URLs     URLs");
		System.out.println();
		Map<String, String> urls = ReadFile.readUrls();
		for (String name : urls.keySet()) {
			String key = name.toString();
			String value = urls.get(name).toString();
			System.out.println(key + " " + value);
		}
		SoftAssert checkOut = new SoftAssert();
		// check out first key & value
		checkOut.assertTrue(ReadFile.readUrls().containsKey("SANDBOXLOGINPAGE"));
		checkOut.assertTrue(ReadFile.readUrls().containsValue(ReadFile.getUrl("SANDBOXLOGINPAGE")));
		// check out last key & value
		checkOut.assertTrue(ReadFile.readUrls().containsKey("PRIVACYPOLICYPAGE"));
		checkOut.assertTrue(ReadFile.readUrls().containsValue(ReadFile.getUrl("PRIVACYPOLICYPAGE")));
		
		checkOut.assertAll();
	}
}
