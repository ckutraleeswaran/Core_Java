package task.org;

public class TaskTwo {
	
	
	public void swap() {
		int a = 10;
		int b = 20;
			System.out.println("before swap a : " + a);
			System.out.println("before swap b : " + b);
		
		int temp =a;
		
		a = b;
		b = temp;
			System.out.println("after swap a : " + a);
			System.out.println("after swap b : " + b);
				
	}
		
	//Simple Interest: Calculate simple interest based on principal, rate, and time. 
	public void simpleInternetCal() {
		
		int principalAmount = 10500;
		int interest = 16;
		int time = 3;
		
		int simpleInterest = (principalAmount * interest * time / 100);
		
			System.out.println("principal Amount  : " + principalAmount);
			System.out.println("interest value : " + interest);
			System.out.println("time duration : " + time);
			System.out.println("simple interest of : " + simpleInterest);
	}
	//Temperature Conversion: Convert temperature from Celsius to Fahrenheit. 
	public void temp() {
		//F=(5/9​)×C+32
//		start
//		take temperature in Celsius (C)
//		apply conversion formula
//		store result in Fahrenheit (F)
//		print result
//		end
		
		int celsius = 25 ;
		int fahrenheit = (9/5) * (celsius * 32);
			
			System.out.println("Fahrenheit : " + fahrenheit);
	}
	public static void main(String[] args) {
		
		TaskTwo object = new TaskTwo();
		object.swap();
		object.simpleInternetCal();
		object.temp();
	}

}
