package practice.java;

public class Factorial {

	public static void main(String[] args) {

		// factorial of n
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;

		}
		System.out.println(fact);
		fact= factorial(n);

		System.out.println(fact);
		//
		int j=5;
		int kFact= 1;
		for(int i=1;i<=j;i++) {
			kFact*=i;
		}
		
		System.out.println("KFcat"+ kFact);
	}
       // using recursion
	static int factorial(int n) {
		if(n==0) 
			return 1;
		else {

		return n * factorial(n - 1);
		}
	}

}		


