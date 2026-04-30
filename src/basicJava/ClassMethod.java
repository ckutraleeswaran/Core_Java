package basicJava;

public class ClassMethod {

	
	public void addition() {
		System.out.println(100 + 200);
	}
	
	
	
	public static void main(String[] args) {
	
		//ClassName  objectName  = new ClassName();
		
		ClassMethod obj = new ClassMethod();
		
		obj.addition();
//		obj.substraction();
		
		System.out.println("Hello World!");
	}
}
