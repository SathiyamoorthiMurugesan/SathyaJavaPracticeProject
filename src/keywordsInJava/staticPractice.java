package keywordsInJava;

public class staticPractice {
	
// * static is a keyword in java
// * It can be used with both methods and variables
// * static variables and methods are belongs to class
// * static will be stored in heap memory
// * This means, we don't need to create Object of an class to access static methods and variables inside a class
// * In order to use the static variables and methods outside of a class, we need to access it using it's respective Class Name
// * If we keep all the methods and variables of an class as static, that class is called tightly encapsulated class
// * we can overload a static method but we can not override a static method
// * we can not declare static variable inside a static or non static method
// 		* because scope of variable declared inside a method ends once method get executed. (method behavior)
// 		* static means, it belongs to the class, mean it can be accessed by any methods of the class or other class (static behavior)
// 		* Since method and static having exactly opposite behavior, we cant use static inside any method

	
	int rollNo;
	String name;
	static String schoolName;
	
	static {
		schoolName = "abc";
	}
	
	public staticPractice(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;
	}
	

	public static void main(String[] args) {
		
		staticPractice student1 = new staticPractice(1,"Sathya");
		student1.showStudentDetails();
		
		staticPractice student2 = new staticPractice(2,"Gopal");
		student2.showStudentDetails();
	}
	
	public void showStudentDetails() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(schoolName);
	}
	

}
