package practice.java;

public class LeftArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 8, 2, 4, 5, };
		int n = arr.length;
		int d = 2;
		
		for (int i = 1; i <= d; i++) {
			int temp = arr[0];
			for (int j = 0; j <n-1; j++) {

				arr[j] = arr[j + 1];
			}
			arr[n-1] = temp;
		}

		for (int e : arr) {
			System.out.print(e + " ");
		}
	}
}
