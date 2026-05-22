package accessSpecifier.org;

public class PrivateAS {

	
	// we can only call same class
	
	private void substraction() {
		System.out.println(3500 - 2000);

	}
	
	
	
	public static void main(String[] args) {
		
		PrivateAS obj = new PrivateAS();
		
		obj.substraction();

	}

}
