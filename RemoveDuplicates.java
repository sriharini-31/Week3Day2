package week3day2Assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str1 = "PayPal India";

		char[] charArray = str1.toCharArray();

		List<Character> charSet = new ArrayList<Character>();

		List<Character> dupCharSet = new ArrayList<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (charSet.contains(charArray[i]) == true) {
				dupCharSet.add(charArray[i]);
			} else {
				charSet.add(charArray[i]);
			}

		}

		charSet.removeAll(dupCharSet);

		for (int j = 0; j < charSet.size(); j++) {

			if (charSet.get(j) != ' ') {
				System.out.println("character set:" + charSet.get(j));
			}
		}
	}

}
