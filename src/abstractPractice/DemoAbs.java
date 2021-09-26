package abstractPractice;

public abstract class DemoAbs {
	
//	* abstract is a class not interface
//	* abstract is a keyword in java. 
//	* This keyword can be used with methods and classes
//	* abstract class can have both abstract and non-abstract(concrete) methods
//	* If we create an abstract method in a normal class, that normal class should be converted to abstract class
//	* In an abstract class, there is no mandatory that it should have an abstract method
//	* We can not create object for an abstract method
//	* If any class wants to follow an abstract class, we need to use "extends" keyword.
//	* If a class extends abstract class, then it should implement all the unimplemented abstract methods of the abstract class

	public DemoAbs(int a) {
		
	}
	
	int a; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DemoAbs obj = new DemoAbs();

	}
	
	public void method1() {
		System.out.println("I am method1");
	}
	
	public abstract void method2();
	
	

}
