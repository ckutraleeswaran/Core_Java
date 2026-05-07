package loops.org;

public class ForLoop {

//	SYNTAX: 
//		—------------
//		for( initialization ; condition ; increment / decrement ) {				
//		}
//		Initialization  SYNTAX :  
//		—--------------------------------
//						DataType variableName = 0 / 1
// ( post increment : i++ , i-- ) (Pre increment : ++i , --i)
	
	public void postIncrement() {
		// 0 to 10 print
		
		for(double i = 1.00 ; i < 11 ; i++) {			// i = 1 + 0,  i = 1
														// i = 1 + 1,  i = 2
			System.out.println(i);						// i = 9 + 1,  i = 10
		}											
	}
	
	public void preIncrement() {
		
		// 10 to 0 print
		
			for(int i = 10 ; i >= 0 ; i--) {			// i = 10 - 1,  i = 9
														// i =  9 - 1,  i = 8
				System.out.println(i);					// i =  1 - 1,  i = 0
			}
	}
	
	public static void main(String[] args) {
			
		ForLoop obj = new ForLoop();
		
		obj.postIncrement();
		obj.preIncrement();
	}
}
