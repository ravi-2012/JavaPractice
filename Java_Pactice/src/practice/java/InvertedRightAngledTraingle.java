package practice.java;

public class InvertedRightAngledTraingle {

	public static void main(String[] args) {
		
		invertedRightTriangle(5);

	}

	public static void invertedRightTriangle(int row) {

		for (int i = row; i >=1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
