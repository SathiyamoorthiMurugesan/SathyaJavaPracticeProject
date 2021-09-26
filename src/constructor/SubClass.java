package constructor;

public class SubClass extends ConstructorIntro{

	public static void main(String[] args) {
		SubClass ab = new SubClass();
		System.out.println(ab.a);
//		System.out.println(ab.b);
		
		ConstructorIntro ab1 = new SubClass();
//		System.out.println(ab1.b);
	}

}
