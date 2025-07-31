package practice.java;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Enter the Number :");
      Scanner sc = new Scanner(System.in);
      int num= sc.nextInt();
      
      System.out.println("is " +num +" prime Number? :"+ isPrime(num));
	}

}
