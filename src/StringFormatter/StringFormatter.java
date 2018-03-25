package StringFormatter;

import java.util.Arrays;
import java.util.List;

public class StringFormatter {

	static List<String> words = Arrays.asList("A", "Frog", "is");
	static List<String> wordList1 = Arrays.asList("AP", "COMP", "SCI", "ROCKS");
	static List<String> wordList2 = Arrays.asList("GREEN", "EGGS", "AND", "HAM");
	static List<String> wordList3 = Arrays.asList("BEACH", "BALL");

	public static int totalLetters(List<String> words) {

		int counter = 0;
		for (int i = 0; i < words.size(); i++) {
			char[] w = words.get(i).toCharArray();
			counter += w.length;
		}

		return counter;
	}

	public static void main(String[] args) {
		System.out.println(totalLetters(words));
		System.out.println(basicGapWidth(wordList2, 20));
		// System.out.println(leftoverSpaces(words, 0));
	}

	public static int basicGapWidth(List<String> wordList, int formattedLen) {

		int charNumbers = totalLetters(wordList);

		int spaces = formattedLen - charNumbers;

		int counter = 0;
		int leftOver = 0;

		System.out.println(spaces);
		while ((spaces - wordList.size()) >= 0) {
			if ((spaces - wordList.size()) >= 0) {
				spaces -= wordList.size();
				counter++;
			} else {
				leftOver = spaces;
			}
		}

		return counter;

	}
}
