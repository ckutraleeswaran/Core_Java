package methodOverLoading.org;

public class Calculator {
	

	public void addition() {
		
		int a = 10;
		int b = 20;
		
		int c = a + b;
			System.out.println("addition_without argument : " + c);
	}
	
	public void addition(int a, int b) {
		System.out.println("addition with argument :  " + (a + b));
	}
	public void addition(int a, int b,int c) {
		System.out.println("addition with argument :  " + (a + b + c));
	}
	public void addition(String name,int a, int b) {
		System.out.println("addition with argument :  " + (a + b + ( name)));
	}
		
	public static void main(String[] args) {
		
		Calculator object = new Calculator();
		
		object.addition();
		object.addition(100, 200);
		object.addition(8, 5, 7);
		object.addition("kutra", 5, 5);	
	}
}
