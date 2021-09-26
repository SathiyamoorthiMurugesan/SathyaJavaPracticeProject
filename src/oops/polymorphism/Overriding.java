package oops.polymorphism;

// 	* It happens between two classes
// 	* In order to achieve this, we need to use inheritance concept
// 	* It based on method signature.
// 	* Inorder to achieve this, 
//		* Method name should be same
//		* Type, order and number of paramerter should same between parent and child
// 	* Can we override static method? No
//	* Can we override return type method or methods with different return type called as override or not? No
	

class Parent1 {
	
	public void buyRice() {
		System.out.println("I am without parameter method from parent class");
	}
	
	public void buyRice(String riceName) {
		System.out.println("I am String parameterized method from parent class");
	}
	
	public void buyRice(int amount) {
		System.out.println("I am int parameterized method from parent class");
	}
	
	public void buyRice(String riceName, int amount) {
		System.out.println("I am String and int parameterized method from parent class");
	}
	
	public void buyRice(int amount, String riceName) {
		System.out.println("I am int and String parameterized method from parent class");
	}
	
	public void simpleMethod() {
		System.out.println("I am simple method");
	}
}

public class Overriding extends Parent1{
	
	
	public void buyRice() {
		System.out.println("I am without parameter method from child class");
	}
	
	public void buyRice(String riceName) {
		System.out.println("I am String parameterized method from child class");
	}
	
	public void buyRice(int amount) {
		System.out.println("I am int parameterized method from child class");
	}
	
	public void chidMethod() {
		System.out.println("I am child method");
	}

	public static void main(String[] args) {
		Overriding ov = new Overriding();
		ov.buyRice();
		
		Parent1 pa = new Parent1();
		pa.buyRice();
		
		Parent1 pc = new Overriding();
		pc.buyRice();
	}

}
