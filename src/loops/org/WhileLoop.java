package loops.org;

public class WhileLoop {
	
//	while (condition) {
//	    // code to repeat
//	i++ or i--
//	}
	
	
	public void basic() {
	
		int age = 10;
		
		while(age <= 20) {
			System.out.println(age);		
			age++;
		}
	}
	public void rocketLaunch() {
		
	int count = 10;
	
		while(count >= 20) {
			System.out.println(count);
			count--;
		}
		
//		System.out.println("Rocket Launched");
		
	}

	
	//	do {
//	    // code
//	} while (condition);

	public void doWhile() {
		
		int count = 10;
		
		do {
			
			System.out.println("Launching in " + count);
			
			count--;
			
		}while(count >= 20);
		
			System.out.println("Rocket Launched");
		
	}
	
	
	
	public static void main(String[] args) {
		
		WhileLoop object = new WhileLoop();
		
		//object.basic();
		//object.rocketLaunch();
		object.doWhile();
		
		
	}

}
