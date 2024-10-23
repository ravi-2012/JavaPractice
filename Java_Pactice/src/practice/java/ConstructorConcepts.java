package practice.java;

public class ConstructorConcepts {
	
	public ConstructorConcepts() {  //default constructor
		System.out.println("Default const.");
	}
	
	public ConstructorConcepts(int i) {  //default constructor
		System.out.println("SIngle param const.");
		System.out.println(i);
	}
	
	public ConstructorConcepts(int i,int j) {  //default constructor
		System.out.println("Two param const.");
		System.out.println(i + j);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorConcepts obj =new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj2 = new ConstructorConcepts(10,20);
	}

}
