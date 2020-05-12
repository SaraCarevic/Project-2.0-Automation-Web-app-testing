package page.object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		File myObject = new File("src\\paths.txt");
		try {
			Scanner myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				// System.out.println(data);
				String values[] = data.split("~");
				System.out.println(values[0] + " " + values[1]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
