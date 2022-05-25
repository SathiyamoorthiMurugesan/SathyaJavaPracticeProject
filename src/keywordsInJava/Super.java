package keywordsInJava;

public class Super extends ParentSuper{
	
//	* Super is keyword in java, it can be used with variables, methods and constructors.
//	* It can be used with static and non static variables (try this with this keyword)
//	* super can not be used inside main method (try this with this keyword)
//	* Whenever a child class overrides methods and variables of its parent class, inorder to call the overridden methods/variables, we use super
//		* In child class methods, we use super keyword to call parent class's overridden methods/variables
	
//	* super();
//	* Whenever we call child class constructor, parent class constructor is always called. because,
//		* in child class constructor, parent class constructor is implicitly called by using super(). means, super() is hidden. 
//		* if we want we can write super() explicitly in child class's constructor
//	* super() should always be first line of the child class's constructor
//	* When we call child class's parameterized constructor, we expect parent class's parameterized constructor to be called. But it wont. 
//		* By default, parameter wont be passed to super() 
//		* In order to do that, we need to pass the child class constructor's parameter to super();
//	* We can use two super() inside child class's constructor because super() always should be first line
	
	int a = 10;
	String str = "Sathya";
	static int b = 100;
	
	public void method1() {
		System.out.println("I am child class method1");
	}
	
	public static void method3() {
		System.out.println("I am child class static method3");
	}
	
	
	public void method4() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(str);
		System.out.println(super.str);
		System.out.println(b);
		System.out.println(ParentSuper.b);
		method1();
		super.method1();
		System.out.println("I am child class method4");
	}
	

	public static void main(String[] args) {
		Super super1 = new Super();
//		System.out.println(super1.a);
//		System.out.println(super1.str);
//		System.out.println(b);
//		super1.method1();
//		method3();
		super1.method4();
//		super1.method2();
//		ParentSuper.method3();
	}

}


class ParentSuper {
	
	int a = 5;
	String str = "Gopal";
	static int b = 50;
	
	public void method1() {
		System.out.println("I am parent class method1");
	}
	
	public void method2() {
		System.out.println("I am parent class method2");
	}
	
	public static void method3() {
		System.out.println("I am parent class static method3");
	}
}
