package conditionalStaement.org;

public class IfStatement {
	
	
	//example = 1
	public void ifCondition() {
		
		int car = 100;
		
		if(car == 100 ) {			//run if the condition pass

			System.out.println("You can go, happy journey");
		}
		else{
			System.out.println("you cannot go, because you have to pay 100");
		}
	}
	
	//example = 2
	public void example() {
		
		//five subjects mark there tell me pass or fail
		
		int english = 642426;
		
		if(english >= 1 && english <= 100) {
			System.out.println("you enter the correct english mark : " + english);
		
			// below 1 to 34 mark = fail / E -grade
			if(english  <= 34 ) {
				System.out.println("grade : E");
			}
			// above 35 to 50  = c
			else if(english >= 35 && english <= 50) {
				System.out.println("grade : C");
			}
			// above 51 to 70 = b
			else if(english >= 51 && english <= 70) {
				System.out.println("grade : B");
			}
			// above 71 to 80 = a
			else if(english >= 71 && english <= 80) {
				System.out.println("grade : A");
			}
			// above 81 to 90 = s
			else if(english >= 81 && english <= 90) {
				System.out.println("grade : S");
			}
			// above 91 to 100 = h
			else if(english >= 91 && english <= 100) {
				System.out.println("grade : H");
			}
		}else {
			System.out.println("Invalid mark , please enter between 1 to 100");
		}
	
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		IfStatement object = new IfStatement();
		object.ifCondition();
		object.example();		
		
		
	}

}
