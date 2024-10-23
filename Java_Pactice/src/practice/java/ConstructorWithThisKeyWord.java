package practice.java;

public class ConstructorWithThisKeyWord {
	
	String name;
	int age;
	//this keyword is used to initialize global variable or Class variable
	//always written within constructor of class
	public ConstructorWithThisKeyWord(String name, int age) {
		this.name=name;  
		this.age=age;   
		
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}

	public static void main(String[] args) {
		
		ConstructorWithThisKeyWord obj =new ConstructorWithThisKeyWord("Ravi", 26);
		
		
		
	
	}
}
