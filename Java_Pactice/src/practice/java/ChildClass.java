package practice.java;

public class ChildClass extends SuperKeywordConcepts {

	// Super keyword is used to call parent class constructor
	// should be written within child class constructor body
	// must be the first statement
	public ChildClass() {
		super(); // must be first statement
		// super(10,30);// not valid

	}

	public ChildClass(int i) {
		super(i);

	}

	public ChildClass(int i, int j) {
		super(i, j);

	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		ChildClass obj1 = new ChildClass(10);
		ChildClass obj2 = new ChildClass(25, 85);

	}

}
