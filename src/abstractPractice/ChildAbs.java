package abstractPractice;

public class ChildAbs extends DemoAbs {


	public ChildAbs(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ChildAbs ob = new ChildAbs(4);
		DemoAbs oba = new ChildAbs(3);
//		ob.method3();
		method3();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void method3() {
		
	}

}
