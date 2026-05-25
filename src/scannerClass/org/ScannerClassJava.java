package scannerClass.org;

import java.util.Scanner;

public class ScannerClassJava {
	
	public void data() {
		
		//depends on data type
		//name, age, phone, email, height, weight, pass or fail
		
		Scanner sc = new Scanner(System.in);
		
		//String - nextLine()
		System.out.println("Enter you're name : ");
		String name = sc.nextLine();
		
		//byte - nextByte()
		System.out.println("Enter you're age  : ");
		byte age= sc.nextByte();
		
		//long - nextLong()
		System.out.println("Enter you're number : ");
		long phoneNo = sc.nextLong();
		
		//String - nextLine()
		System.out.println("Enter your email id : ");
		String email = sc.next();
		
		//float - nextFloat()
		System.out.println("Enter you're height : ");
		float height = sc.nextFloat();
		
		//double - nextDouble()
		System.out.println("Enter you're weight : ");
		double weight = sc.nextDouble();
		
		//boolean  - nextBoolean()
		System.out.println("Enter you're mark : ");
		boolean mark = sc.nextBoolean();
		
		System.out.println(" ");		//for space
		
			System.out.println("Your data ");
			System.out.println("----------");
			
			System.out.println("Your name is  : " + name);
			System.out.println("Your age is   : " + age);
			System.out.println("Your number is: " + phoneNo);
			System.out.println("Your email id : " + email);
			System.out.println("Your height is: " + height);
			System.out.println("Your weight is: " + weight);
			System.out.println("Your result is: " + mark);
	}
	public void stringMethod() {
		
		Scanner sc = new Scanner(System.in);
		
		//String - nextLine()		--> include the space
		System.out.println("Enter your job name : ");
		String jobName = sc.nextLine();
				
		//String - next()		--> exclude the space
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Youre name is  : " + name);
		System.out.println("Youre job role is : " + jobName);
	}

	public static void main(String[] args) {
	
		ScannerClassJava obj = new ScannerClassJava();
		
		obj.data();
		obj.stringMethod();
	
	}

}
