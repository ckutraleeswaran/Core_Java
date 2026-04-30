package basicJava;

public class TypeOfMethods {

	// normal method or without argument(parameter)
	public void sum() {
		int a = 10;
		int b = 20;
			System.out.println("a + b : " + (a+b));
	}
	
	//with Argument or with parameter method
	public void sub(int x, int y) {
		System.out.println("x - y : " + (x-y));
	}
	
	//without Argument and with return
	public int age() {
		
		return 25;
	}
	//with Argument and with return
	public int mark(int tamil,int english) {
		return(english);
	}
	
	public static void main(String[] args) {
	
		TypeOfMethods object = new TypeOfMethods();
		
		object.sum();
		object.sub(200, 75);
		System.out.println("age is : " + object.age());
		System.out.println("english : " + object.mark(75, 80));
	}
	
}
