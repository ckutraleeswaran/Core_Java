package stringContents;

public class LiteralString {
	
	public void literal() {
		
		String greetOne    = "Welcome";
		
		String greetTwo    = "Welcome";

		String greetThree  = "welcome";
		
		//to see memory id , we use System --> class and  method is --> identityHashCode()
		
		int idOne   = System.identityHashCode(greetOne);
		int idTwo   = System.identityHashCode(greetTwo);
		int idThree = System.identityHashCode(greetThree);
		
		System.out.println("idOne for greetOne     : " + idOne);
		System.out.println("idTwo for greetTwo     : " + idTwo);
		System.out.println("idThree for greetThree : " + idThree);
		
		String one = greetOne.concat(" Java");
			System.out.println("One : " + one);
			
		int idForOne   = System.identityHashCode(one);
			System.out.println("idForOne : " + idForOne);
		
			System.out.println("greetOne == greetTwo   :" + (greetOne == greetTwo));
			System.out.println("greetOne == greetThree :" + (greetOne == greetThree));
			System.out.println("greetTwo == greetThree :" + (greetTwo == greetThree));
	}
	
	public static void main(String[] args) {
		
		
		LiteralString obj = new LiteralString();
		obj.literal();
		
	}

}
