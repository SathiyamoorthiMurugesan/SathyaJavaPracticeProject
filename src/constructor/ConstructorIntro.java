package constructor;

public class ConstructorIntro {
	
//	* Constructor is not a method
//	* Rules to create constructor
//		1) It should not have any return type
//		2) Constructor name should be as same as class name
//	* Constructor is used to assign values for instance variables 
//	* Constructor can be paramerized or non parameterized
//	* Constructor blongs to class
//	* A default, non parameterized constructor always available within a class but it is implicitly available
//	and does nothing unless we modify it.
//	* How do we call constructor? 
//	* Can we create constructor for a Abstract class?
//	* Can we overload constructors?
//	* Can we override a constructor?
//	* Can a constructor be static?
//	* How constructor behave with different Access modifiers?
	
	int a;
	
	private int b;
	
	public ConstructorIntro() {
		System.out.println("I am default constructor");
		a =20;
		b = 3;
		System.out.println(b);
	}
	
	public ConstructorIntro(int a) {
		System.out.println("I am int parameterized constructor");
	}
	

	public ConstructorIntro(String a) {
		System.out.println("I am String parameterized constructor");
	}
	

	public ConstructorIntro(int a, String b) {
		System.out.println("I am int and String parameterized constructor");
	}
	

	public ConstructorIntro(String b, int a) {
		System.out.println("I am String and int parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorIntro CI = new ConstructorIntro();
		CI.method1();
		CI.a =10;
//		System.out.println(CI.a);
		CI.method1();
		
		ConstructorIntro CIJoe = new ConstructorIntro(5);
		
//		String
//		ArrayList
	}
	
//	public void ConstructorIntro() {
//		
//	}
	
	public void method1() {
		System.out.println(a);
		System.out.println(b);
		
	}

}
