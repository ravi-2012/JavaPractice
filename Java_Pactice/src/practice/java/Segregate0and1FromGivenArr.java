package practice.java;

import java.util.Arrays;

public class Segregate0and1FromGivenArr {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1 };

		//segregate0and1(arr);
		//segregate0and1_2(arr);
		segregate0And1FromArray(arr);
		Arrays.stream(arr).forEach(System.out::print);

		// Arrays.stream(arr).

	}

	public static void segregate0And1FromArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}

	public static void segregate0and1_2(int[] arr) {
		int j = 0; // tracks the position of next 0

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void segregate0and1(int[] arr) {

		int count = 0;

		if (arr.length == 1) {
			System.out.println(Arrays.toString(arr));
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0)
				count++;
		}

		for (int i = 0; i < count; i++)
			arr[i] = 0;

		for (int j = count; j < arr.length; j++)
			arr[j] = 1;

		for (int n : arr) {
			System.out.print(n + " ");
		}

	}

}
