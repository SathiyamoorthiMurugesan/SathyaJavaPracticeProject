package keywordsInJava;

public class FinalInJava extends parentFinal{
	
//	* final is keyword in Java
//	* final keyword can be used with variables, methods and classes
//	* We can not use final with interfaces, because there is no use of it
//	* By nature, variables in interfaces are final
//	* final keyword can be used with both static and non static
//	
//	* final with variable
//		* when a variable is final, we can not change the value of it. 
//		* when final variable is declared, it should be initialized then and there.
	
//	* final with method
//		* when a method is declared as final, we can not override it but we can overload it.
	
//	* final with class
//		* whenever a class is final, we can not inherit it.
		
		int a = 10;
		final int c = 20;
		static final String str = "1";
		final static String str1 = "1000";
//		final int b;

	public static void main(String[] args) {
		FinalInJava fi = new FinalInJava();
		fi.method1();
		
	}
	
	public void method1() {
//		a = 20;
		System.out.println(a);
		System.out.println(c);
//		str = "20";
	}
	
	public void method2() {
		System.out.println("I am method1 from child class");
	}
	
//	public void method3() {
//		System.out.println("I am method3 from child class");
//	}

}

//final class parentFinal {
class parentFinal {
	
	public void method2() {
		System.out.println("I am method1 from parent class");
	}
	
	public final void method3() {
		System.out.println("I am method3 from parent class");
	}
	
}
