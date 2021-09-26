package keywordsInJava;

public class ThisSchool {

//	* this keyword is used to call instance variables and methods
//	* By using constructors,
//		* we can set values for instance variables
//		* by using this, we can differentiate instance variables with run time variables
//		* We can use this inside regular methods too
//		* Whenever we call a non static method from a non static method, by default this will run 
//		* We can not use this with static method calling within a class
	
//	this()
//		* Constructor call must be the first statement in a constructor. means this() should be present at first
//		* used to call another constructor
//		* We can pass parameters to this(), so that it will call the respective constructor
	

	int rollNo;
	String name;
	String bloodGroup;
	String section;

	public ThisSchool() {
		rollNo = 99;
		name = "xxxx";
//		System.out.println("Heyyyyy");
	}

	public ThisSchool(int rollNo, String name, String bloodGroup) {
		this();
		this.rollNo = rollNo;
		this.name = name;
		this.bloodGroup = bloodGroup;
//		this();
	}
	
	public ThisSchool(int rollNo, String name, String bloodGroup, String section) {
		this(rollNo, name, bloodGroup);
		this.section = section;
	}

//	public ThisSchool(int i, String string, String string2) {
//		this.rollNo = i;
//		name = string;
//		bloodGroup = string2;
//	}

	public static void main(String[] args) {

		ThisSchool stu1 = new ThisSchool();
//		stu1.printStudentDetails();
		stu1.name = "Sathya";
		stu1.rollNo = 1;
		stu1.printStudentDetails();

		ThisSchool stu2 = new ThisSchool();
		stu2.name = "Gopal";
		stu2.rollNo = 2;
		stu2.printStudentDetails();

		ThisSchool stu3 = new ThisSchool();
		stu3.rollNo = 3;
		stu3.printStudentDetails();

		ThisSchool stu4 = new ThisSchool(4, "Shiva", "B+");
		stu4.studentBloodGroupDetails();
		stu4.method1(5, "Tamil", "O-");
		
		ThisSchool stu5 = new ThisSchool(6, "Udhay", "B+", "1st");
		stu5.allDetails();
		
		
//		method2();

	}

	public void printStudentDetails() {
		System.out.println(name);
		System.out.println(rollNo);
	}

	public void studentBloodGroupDetails() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(bloodGroup);
	}
	
	public void allDetails() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(bloodGroup);
		System.out.println(section);
	}
	
	public void method1(int rollNo, String name, String bloodGroup) {
		this.rollNo = rollNo;
		this.name = name;
		this.bloodGroup = bloodGroup;
//		studentBloodGroupDetails();
		this.studentBloodGroupDetails();
	}
	
	public static void method2() {
		System.out.println("hello");
	}

}
