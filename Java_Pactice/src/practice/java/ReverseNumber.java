package practice.java;

import java.util.Scanner;

public class ReverseNumber {
	
	static int reverseNumber(int num) {
		int rev=0;		
		while(num!=0) {
			int n= num%10;
			rev= rev*10+n;
			num= num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc= new Scanner(System.in);		
		System.out.println("Reversed Number : "+ reverseNumber(sc.nextInt()));		
		sc.close();
	}

}
