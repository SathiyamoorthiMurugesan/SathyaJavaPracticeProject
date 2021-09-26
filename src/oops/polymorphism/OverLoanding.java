package oops.polymorphism;

public class OverLoanding {
	
//	* Polymorphism - One thing available in different format
//	* In java, we can achieve this using 
//		1) OverLoading (compile time polymorphism)
//		2) Overriding (run time polymorphism)
//	* Both of them based on method signature only.
//	
//	
//OverLoading: 
//	* It happens within a same class
//	* It is based on method signature. (method name(arguments/parameter))
//	* Method name should same
//	* Parameters should be different
//		Based on parameters method singature would vary
//			1) number of parameters
//			2) type of parameters
//			3) order of parameters
	
//	* Can we overload static method? Yes
	
//	* Can we overload return type methods? No
	
//	* Calling static method from static method of a same class
//	* Calling static method from non static method of a same class
//	* Calling non static method from static method of a same class
//	* Calling non static method from non static method of a same class
//	
//	* Calling static method from static method of a different class without inheritance
//	* Calling static method from non static method of a different class without inheritance
//	* Calling non static method from static method of a different class without inheritance
//	* Calling non static method from non static method of a different class without inheritance
	
//	* Calling static method from static method of a different class with inheritance
//	* Calling static method from non static method of a different class with inheritance
//	* Calling non static method from static method of a different class with inheritance
//	* Calling non static method from non static method of a different class with inheritance

	public void buyRice() {
		System.out.println("I am without parameter method");
	}
	
	public void buyRice(String riceName) {
		System.out.println("I am String parameterized method");
	}
	
	public void buyRice(int amount) {
		System.out.println("I am int parameterized method");
	}
	
	public void buyRice(String riceName, int amount) {
		System.out.println("I am String and int parameterized method");
	}
	
	public void buyRice(int amount, String riceName) {
		System.out.println("I am int and String parameterized method");
	}
	
	public void nonStaticMethodRunner() {
		buyRice();
		buyRice(50);
		buyRice(20);
		buyRice("riceA");
		buyRice(10, "riceA");
		buyRice("riceA", 20);
//		buyRice(10, 10);
	}
	
	
	public static void main(String[] args) {
		OverLoanding ol = new OverLoanding();
		ol.nonStaticMethodRunner();
	}
			
	

}
