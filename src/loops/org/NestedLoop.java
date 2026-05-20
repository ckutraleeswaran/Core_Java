package loops.org;

public class NestedLoop {
	
	
//	Nested for loop
//	—--------------------

//	for( initialization ; condition ; increment / decrement) { 
//
//		for( initialization ; condition ; increment / decrement) { 

//		}
//	}

	public void nestedForLoop() {
		
		for(int i = 1 ; i <= 3 ; i++ ) {
			
				System.out.println("i loop : " + i);
			
			for(int j = 1 ; j <= 3 ; j++ ) {
				
				System.out.println(" i + j = " + (i + j));	//addition)
			}
		}
	}
	public void rightHalfPyramid() {
		//Expected output
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			for(int j = 1 ; j <= i ; j++ ) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	public void leftHalfPyramid() {
		//Expected output
		
//		         1
//		       1 2
//		     1 2 3
//		   1 2 3 4
//		 1 2 3 4 5
		
		for(int i = 1; i <= 5; i++) {

	        // space
	        for(int j = 1; j <= 5 - i; j++) {

	            System.out.print("  ");
	        }

	        // number
	        for(int k = 1; k <= i; k++) {

	            System.out.print(k + " ");
	        }

	        System.out.println();
	    }

	}
	
	public static void main(String[] args) {
		
		NestedLoop obj = new NestedLoop();
		
//		System.out.print("my name sandy ");
//		System.out.println("my name sandy");
		
//		obj.nestedForLoop();
//		obj.rightHalfPyramid();
		obj.leftHalfPyramid();
		
	}

}
