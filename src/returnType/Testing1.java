package returnType;

public class Testing1 {
	
//	* Return type is part of method signature.
//	* Methods returns specific values/data type/ class/object
//	* We can assign return type methods to a specific variables
//	* return should be at the bottom of the method
	
	int a;

	public static void main(String[] args) {
//		a = 0; // a = method2();
		Testing1 test = new Testing1();
		test.a = test.method2();
		System.out.println(test.a);
		test.method4(test.method2());
	}
	
	public void method1() {
		System.out.println("void return method");
	}
	
	public int method2() {
		
		return 0;
//		System.out.println();
	}
	
	public String method3() {
		return null;
	}
	
	public void method4 (int a) {
		System.out.println(a);
	}
	
	public String buyBook(int amount) {
		String book = "abs";
		return book;
	}
	
//	String str = "historyBook";
//	str.equals("scienceBook"); //"historyBook".equals("scienceBook");
//	String str2 =  buyBook(5);
//	str2.equals("scienceBook"); 
//	 buyBook(5).equals("scienceBook"); //"abs".equals("scienceBook");
	
//	driver.findElement(By.id("a")).click();
//	WebElement ele = driver.findElement(By.id("a"));
//	ele.click();

}
