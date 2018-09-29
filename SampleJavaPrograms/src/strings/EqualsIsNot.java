package strings;

import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class EqualsIsNot {

	public static void main(String[] args) {
		String enteredString = "";
		boolean quit = false;
		do {
			System.out.println("Enter your String or Enter quit to Stop:");
			Scanner s = new Scanner(System.in);
			enteredString = s.nextLine();
			if (!enteredString.equalsIgnoreCase("quit")) {
				int index = StringUtils.countMatches(enteredString, "not");
				if (enteredString.lastIndexOf("is") > -1 && StringUtils.countMatches(enteredString, "not") % 2 == 0) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
			} else {
				quit = true;
			}
		} while (!quit);
	}

}
