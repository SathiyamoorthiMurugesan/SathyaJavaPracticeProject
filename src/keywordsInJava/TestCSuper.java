package keywordsInJava;

public class TestCSuper extends TestParent{
	
	public TestCSuper() {
		super();
		System.out.println("I am child class non-parameterized constructor");
	}
	
	public TestCSuper(int a) {
		super();
//		super(a);
		System.out.println("I am child class int parameterized constructor");
	}
	
	public static void main(String[] args) {
//		TestCSuper TC = new TestCSuper();
		TestCSuper TC1 = new TestCSuper(5);
	}

}

class TestParent {
	
	public TestParent() {
		System.out.println("I am parent class non-parameterized constructor");
	}
	
	
	public TestParent(int a) {
		System.out.println("I am parent class int parameterized constructor");
	}
	
}
