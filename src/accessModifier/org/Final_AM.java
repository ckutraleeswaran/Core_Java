package accessModifier.org;

public final class Final_AM {
	
	final String name  = "sandy";		// we can't modify or change the value of the variable
	
	final void data() {
		
		 final String name  = "sandy";
//		 name = "san";
	
		
		
		int age = 25;
		
		age = 40;
		
		
		System.out.println("name is : " + name);
		System.out.println("age is : " + age);
	}
	
	
	
	public static void main(String[] args) {
		Final_AM obj = new Final_AM();
		
		obj.data();
	}

}
