package oops.inheritance;

import java.io.Serializable;

class Parent {
	
	int a = 10;
	String str = "Sathya";
	
	static int b  = 5;
	static String str1 = "Raja";
	
	public void method1() {
		System.out.println("This is parent class non static method");
	}
	
	public static void method2() {
		System.out.println("This is parent class static method");
	}
	
}

public class DemoInheritance extends Parent{
	
//	* Inheritance is using the property of parent class in a child class.
//	* Parent class/ Super class
//	* Child class/ Sub class
//	* We achieve inheritance using two keywords 1. implements 2. extends
//	* For class to class inheritance  - we use extends
//		1) class Exception extends class Throwable
//	* For class to interface inheritance - we use implements 
//		1) class Throwable implements Serializable
//	* For interface to interface inheritance - we use extends
//		1) WebDriver interface extends SearchContext interface
//	* Interface can not extend or implement class
//	* Multiple inheritance
//		1) We can not achieve this by using classes. Below is not possible
//			* ClassA extends classB, ClassC, etc,...
//		2) We can achieve this by using both classes and interfaces
//			* ClassA implements interface1, interface2, etc,..
//			* ClassA extends ClassB, implements interface1, interface2, etc,...
//		3) In above point, while using both class and interface, we need to use extends first
//			* ClassA extends ClassB, implements interface1, interface2, etc,... - THIS IS POSSIBLE
//			* ClassA implements interface1, interface2, extends ClassB - THIS IS NOT POSSIBLE
//	* Multilevel inheritance in java is possible 
//		* ClassA extends ClassB
//		* ClassB extends ClassC
//		* ClassC extends ClassD
//	* Based on inheritance, Object creation can differ
//		There are 4 ways to create object
//			* Creating object for parent class by using parent class as reference class
//			* Creating object for child class by using child class as reference class
//			* Creating object for child class by using parent class as reference class
//			* Creating object for parent class by using child class as reference class
	

	int c = 2;
	String str3 = "child";
	
	static int d = 32;
	static String str4 = "static child";
	
	public void method3() {
		System.out.println("This is child class non static method");
	}
	
	public static void method4() {
		System.out.println("This is child class static method");
	}
	
	
	public static void main(String[] args) {
		DemoInheritance childObj = new DemoInheritance();
		System.out.println(childObj.a);
		System.out.println(childObj.str3);
		childObj.method1();
		childObj.method3();
		System.out.println("*****************");
		
		Parent p = new Parent();
		p.method1();
		System.out.println(p.str);
		Parent.method2();
		method2();
		
		Parent child = new DemoInheritance();
		System.out.println(child.str);
		
//		DemoInheritance childObj1 = new Parent();
		
	}

}
