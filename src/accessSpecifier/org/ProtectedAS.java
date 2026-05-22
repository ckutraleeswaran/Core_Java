package accessSpecifier.org;

public class ProtectedAS {

	
	
	

	// method level  : protect
	
	// 1. not global level access 
	
	// same package (extends & object) 
	
	// other package can't use ( both object and extends )

	
	public void math() {
		System.out.println(10 + 15);
	}
	
	protected void example() {
		
		System.out.println("hello world!");
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
