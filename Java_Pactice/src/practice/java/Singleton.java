   package practice.java;

public class Singleton {

	// In OOP , singleton class is a class that can have only one instance(object)
	// at a time.
	// how to design singleton class
	// 1.Make constructor as private
	// 2.Write a static method that has return type of object of this singleton class(lazy initialization)
	// diff between the normal class and singleton class
	// for normal class we use constructors for instantiation but in singleton we use getInstance() method for creating objects
	private static Singleton singletonInstance = null;
	public String str;

	private Singleton() {
		str = "hey i am using singleton class";
	}

	public static Singleton getInstance() { // lazy initialization= write static method to initialize instance of the
											// class.

		if (singletonInstance == null)
			singletonInstance = new Singleton();
		return singletonInstance;

	}

	// Test single class
	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		y.str = (y.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(z.str);
	}

}
