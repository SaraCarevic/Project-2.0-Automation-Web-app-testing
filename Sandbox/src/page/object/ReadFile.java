package page.object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {
	public static Map<String, String> readUrls() {
		Map<String, String> urls = new HashMap<>();
		File myObject = new File("src\\urls.txt");
		Scanner myReader;
		try {
			myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String values[] = data.split("~");
				urls.put(values[0], values[1]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return urls;
	}
	
	public static String getUrl(String key) {
		Map<String,String> urls = readUrls();
		String url = "Wanted URL doesn't exist in the file urls.txt.";
		for (String i : urls.keySet()) {
			if (i.equals(key))
				url = urls.get(i);
		}
		return url;
	}

	public static Map<String, String> readXPaths() {
		Map<String, String> xPaths = new HashMap<>();
		File myObject = new File("src\\paths.txt");
		Scanner myReader;	
		try {
			myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String values[] = data.split("~");
				xPaths.put(values[0], values[1]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return xPaths;
	}
	
	public static String getXPath(String key) {
		Map<String,String> xPaths = readXPaths();
		String xPath = "Wanted XPath doesn't exist in the file paths.txt.";
		for (String i : xPaths.keySet()) {
			if (i.equals(key))
				xPath = xPaths.get(i);
		}
		return xPath;
	}
}
