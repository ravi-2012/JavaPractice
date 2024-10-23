package practice.java;

import java.util.HashSet;
import java.util.Set;

public class RemovingDupFromArray {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8 };

		int len = a.length;

		int[] temp = new int[len];
		int j = 0;

		for (int i = 0; i < len - 1; i++) {

			if (a[i] != a[i + 1]) {

				temp[j] = a[i];
				j++;
			}
		}

		temp[j] = a[len - 1];

		for (int i = 0; i < j + 1; i++) {
			a[i] = temp[i];
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		// using HashSet
		System.out.println("*************Using HashSet***********");

		Set<Integer> hs = new HashSet<Integer>();

		for (int n : a) {
			hs.add(n);
		}

		for (Integer num : hs) {
			System.out.print(num + " ");
		}

	}

}
