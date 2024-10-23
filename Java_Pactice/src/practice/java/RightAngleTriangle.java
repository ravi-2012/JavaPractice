package practice.java;

public class RightAngleTriangle {

	public static void main(String[] args) {
		//rightTriangle(5);

		equilateralTriangle(5);
	}

	public static void rightTriangle(int row) {

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void equilateralTriangle(int row) {

		for (int i = 1; i <row; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = row; i >=1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
