 package stringContents;

public class NonLiteralString {

public void nonLiteral() {
		
		String greetsOne    = new String("Welcome");
		
		String greetsTwo    = new String("Welcome");

		String greetsThree  = new String("welcome");
		
		//to see memory id , we use System --> class and  method is --> identityHashCode()
		
		int idOne   = System.identityHashCode(greetsOne);
		int idTwo   = System.identityHashCode(greetsTwo);
		int idThree = System.identityHashCode(greetsThree);
		
		System.out.println("idOne for greetOne     : " + idOne);
		System.out.println("idTwo for greetTwo     : " + idTwo);
		System.out.println("idThree for greetThree : " + idThree);
		
		String one = greetsOne.concat(" Java");
		System.out.println("One : " + one);
		
		int idForOne   = System.identityHashCode(one);
		System.out.println("idForOne : " + idForOne);
		
		System.out.println("greetsOne == greetsTwo   :" + (greetsOne == greetsTwo));
		System.out.println("greetsOne == greetsThree :" + (greetsOne == greetsThree));
		System.out.println("greetsTwo == greetsThree :" + (greetsTwo == greetsThree));
		
	}
	
	public static void main(String[] args) {
		
		
		NonLiteralString obj = new NonLiteralString();
		obj.nonLiteral();
		
	}
	
}
