package scannerClass.org;

import java.util.Scanner;

public class ScannerClassJava {
	
	
	//normal approach
	public void sum() {
		
		int a = 33;
		int b = 67;
		System.out.println("a value = 67 & b value is 33 : " + (33 + 67));
				
		System.out.println(" sum of (a + b) is : " + (a + b));
	}
	
	
	public void data() {
		
		// name,age,salary,mail,phoneNumber
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		
		String name = sc.nextLine();
		
		System.out.println("name is : " + name);
		
	}
	
	
	
	public static void main(String[] args) {
	
		ScannerClassJava obj = new ScannerClassJava();
		
		obj.sum();
		
		
		obj.data();
	}

}
