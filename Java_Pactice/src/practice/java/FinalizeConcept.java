package practice.java;

public class FinalizeConcept {
	
	//finalize is a method
	//called before the garbage collector to destroy object
	public void finalize() {
		
		System.out.println("finalize method is called for garbage collection");
	}

	public static void main(String[] args) {
		
		FinalizeConcept obj1 = new FinalizeConcept();
		FinalizeConcept obj2 = new FinalizeConcept();

		//object created without any reference i.e null
		
		obj1= null;
		obj2= null;
		//Calling garbage collector to cleanup memory
		System.gc(); 
		
	}

}
