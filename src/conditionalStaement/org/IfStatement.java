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
	public void percentage() {
		
		int tamil   = 80;
		int english = 93;
		int maths   = 76;
		int science = 47;
		int ss      = 64;
		
		int totalMarks = (tamil + english + maths + science + ss);
	
		//find a percentage of five subjects.
		double percent = ((totalMarks/500.0)* 100);	
			System.out.println("percent of five subject is : " + percent);
	
		//grade: (H S A B C  E) 	(1 to 100)
		
		if(percent >= 1 && percent <= 100) {
			
			System.out.println("your percentage is : " + percent);
			
			if(percent >= 91) {
				System.out.println("grade : H");
			}
			else if(percent >= 81 && percent <= 90) {
				System.out.println("grade : S");
			}
			else if(percent >= 71 && percent <= 80) {
				System.out.println("grade : A");
			}
			else if(percent >= 61 && percent <= 70) {
				System.out.println("grade : B");
			}
			else if(percent >= 51 && percent <= 60) {
				System.out.println("grade : C");
			}
			else if(percent >= 35 && percent <= 50) {
				System.out.println("grade : D");
			}
			else if(percent <= 34) {
				
				System.out.println("grade : E");
			}
		}
		else {
			System.out.println("you enter invalid input percent .....");
		}	
	}
	
	public void scholarshipLadderIf() {
		
	//scholarship eligible or not
	// 1. avg >= 85 			 -> 100% scholarship
	// 2. avg >= 70 && avg <= 84 -> 50%  scholarship	
	// 3. avg < 70               -> 0%   scholarship	
	
		int tamil   = 80;
		int english = 93;
		int maths   = 76;
		int science = 47;
		int ss      = 64;
		
		int avg = (tamil + english + maths + science + ss)/5;
	    
//	    int avg = 101;
	    
	    if(avg >= 85 && avg <= 100){
	        System.out.println("100% scholarship ");
	    }
	    else if(avg >= 70 && avg <= 84){
	        System.out.println("50% scholarship ");
	    }
	    else if(avg <= 69 && avg >=1){
	        System.out.println("0% scholarship ");
	    }
	    else{
	        System.out.println("enter value between (1 to 100)");
	    }
	}
	public void scholarshipNestedIf() {
		
		
		int tamil   = 80;
		int english = 93;
		int maths   = 76;
		int science = 47;
		int ss      = 64;
		
		int avg = (tamil + english + maths + science + ss)/5;
	    
//	    int avg = 101;
	    
		
		
		if(avg >= 70 && avg <= 100){
		    
	        if(avg >= 85){
	            System.out.println("100% scholarship");
	        }
	        else if(avg >= 70 && avg <= 84){
	            System.out.println("50% scholarship");
	        }
	    }
	    else{
	        System.out.println("0% scholarship");
	    }
	}
	
	public static void main(String[] args) {
		
		IfStatement object = new IfStatement();
		object.ifCondition();
		object.example();		
		object.percentage();
		object.scholarshipLadderIf();	
		object.scholarshipNestedIf();
	}

}





















