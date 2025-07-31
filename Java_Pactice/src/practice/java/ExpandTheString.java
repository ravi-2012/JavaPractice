package practice.java;

public class ExpandTheString {

	public static void main(String[] args) {
		String input = "a1b2c3d1";
		StringBuilder outputString = new StringBuilder();

		int len = input.length();

		for (int i = 0; i < len; i++) {
			int count = 0;
			char currentChar = input.charAt(i);
			if ((i + 1) < len && Character.isDigit(input.charAt(i + 1))) {
				count = Character.getNumericValue(input.charAt(i + 1));
			}

			for (int j = 0; j < count; j++) {
				outputString.append(currentChar);
			}
		}

		System.out.print(outputString);

	}

}
