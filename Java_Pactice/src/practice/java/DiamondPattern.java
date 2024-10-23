package practice.java;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any odd number :");

		int line = sc.nextInt();
		// int line = 9;
		int mid = (line + 1) / 2;

		// upper triangle

		for (int i = 1; i <= mid; i++) {
			// Space
			for (int s = 1; s <= (mid - i); s++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <= (i * 2) - 1; j++) {

				System.out.print("*");
			}
			System.out.println(" ");
		}

		//lower Triangle
		
		for (int i = 1; i <= mid-1; i++) {
			// Space
			for (int s = 1; s <=i; s++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <= 2*(mid-i)-1; j++) {

				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
