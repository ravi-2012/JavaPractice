package practice.java;

public class FinallyConcepts {

	public void test1() {
		try {
			System.out.println("inside the ----- try block");
			throw new RuntimeException("test"); // throwing one exception but still code in finally block will execute

		} catch (Exception e) {
			System.out.println("inside the ----------catch block");
		}
		// always use with try catch block.
		// always executed code in the finally block
		finally {

			System.out.println("inside the ----finally block");
		}
	}

	public static void division() {
		int a = 10;
		int b = 0;

		try {
			System.out.println("inside the ---- try block of division method");
			int c = a / b;
		} 
		//handling incorrect exception
		catch (NullPointerException e) {  //if we not handle the exception still the code in finally block will be executed
			System.out.println("inside the catch block");
			System.out.println("divide by zero error");
		} 
		finally {
			System.out.println("inside the finally block and executing inspite of exception");
		}
	}

	public static void main(String[] args) {

		FinallyConcepts obj = new FinallyConcepts();
		obj.test1();
		System.out.println("-------------------");
		division(); //static method calling without creating obj
	}

}
