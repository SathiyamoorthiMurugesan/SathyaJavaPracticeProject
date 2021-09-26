package interfacePractice;

public interface RBIInterface {
	
	
//	* interface has methods but it does not have any body (it has only abstract method)
//	* Classes which follows this interface should implement those abstract methods
//	* We link a class and a interface using "imeplements" keyword.
//	* To link interface with another interface, we use "extends" keyword. While doing this, it wont force us to implement the methods of parent interface in child interface
//	* In interface we can have methods with body but those methods should be either default or static
//	* The variables declared in interfaces are final in nature.
//	* In interface, static/default methods can not be abstract.
//	* In interface, only public, private, abstract, default, static and strictfp are permitted
//	* We can not create object for an interface because there is no use in creating it.
	
	int b = 10;
	
	public String str = "Sathya";
	
	char c = 'a';
	
	public void homeLoan();
	
	public void educationLoan();
	
	public void personalLoan();
	
	public int loanPercentage();
	
	
//	private void privateLoan();
//	protected void privateLoan();
	
//	public static void easyLoan();
//	default void easyLoan();
	
	default void defaultMethod() {
//		method implementation
	}
	
	default void defaultMethod1() {
//		method implementation
	}
	
	public static void staticMethod() {
//		method implementation
	}
	
	static void defaultStaticMethod() {
		
	}
	
	public static void staticMethod1() {
//		method implementation
	}
	
}
