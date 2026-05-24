package array.org;

public class Arrays {
	
//	Array
//	---------
//	1. single dimensional  array
//	2. multi or 2dimensional array
//
//	Single dimensional array:
//	--------------------------
//		int number = 100; normal declaration
//			System.out.println(number);
//	SYNTAX 
//	—------------		
//	DataType[ ] variableName  = { value ,  value , value ,  value};
	
//	DataType[ ] variableName  = new DataType[memory size];
//
//	1. We can call the specific value by using index based
//	2. We can use looping .

	
	public void singleArray() {
		
		int [] evenNumber = {2,4,6,8,10};
		
			System.out.println(evenNumber[4]);
			
		for(int i = 0 ; i < evenNumber.length; i++) {
			System.out.println(evenNumber[i]);
		}
	
	}
	public void single() {
//		DataType[ ] variableName  = new DataType[memory size];
		
		int [] even = new int[4];
		
		even[0] = 10;
		even[1] = 20;
		even[2] = 30;
		even[3] = 40;
//		even[4] = 50;
		
//		System.out.println(even[2]);
		
		for(int i = 0 ; i < even.length; i++) {
			System.out.println(even[i]);
		}
		
	}
	public void stringValue() {
		String[] names = {"Lakshit", "Rahul", "Pankaj","raj"};
		
//		System.out.println(names[3]);
		
		for(int i = 0 ; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
	public void str() {
//		DataType[ ] variableName  = new DataType[memory size];
		
		String [] even = new String[4];
		
		even[0] = "sandy";
		even[1] = "jals";
		even[2] = "kumar";
		even[3] = "ravi";
//		even[4] = 50;
		
//		System.out.println(even[2]);
		
		for(int i = 0 ; i < even.length; i++) {
			System.out.println(even[i]);
		}
		
	}
	public void declar() {
		
		int[] numbers;
		
		numbers = new int[4];
		
		// Assign values
		numbers[0] = 90;
		numbers[1] = 80;
		numbers[2] = 70;
		numbers[3] = 60;
		
		// Print values
        	System.out.println(numbers[0]);
        	System.out.println(numbers[1]);
        	System.out.println(numbers[2]);
        	System.out.println(numbers[3]);
        
        //print values by using loops
        for(int i = 0 ; i < numbers.length ; i++) {
        	
        	System.out.println("by using for loop : " + numbers[i]);
        }
		
	}
	public void multiArray() {
		
		int [][] numbers;
		
		numbers = new int [3][3];
		
		numbers[0][0] = 50;
		numbers[0][1] = 60;
		numbers[0][2] = 70;
		
		numbers[1][0] = 50;
		numbers[1][1] = 60;
		numbers[1][2] = 70;
		
		numbers[2][0] = 50;
		numbers[2][1] = 60;
		numbers[2][2] = 70;
//			System.out.print("numbers[0][0] : " + numbers[0][0]);
//			System.out.print("numbers[0][1] : " + numbers[0][1]);
//			System.out.println("numbers[0][2] : " + numbers[0][2]);
//			
//			System.out.print("numbers[1][0] : " + numbers[1][0]);
//			System.out.print("numbers[1][1] : " + numbers[1][1]);
//			System.out.println("numbers[1][2] : " + numbers[1][2]);
//			
//			System.out.print("numbers[2][0] : " + numbers[2][0]);
//			System.out.print("numbers[2][1] : " + numbers[2][1]);
//			System.out.println("numbers[2][2] : " + numbers[2][2]);
		
		System.out.print(numbers[0][0] + " " );
		System.out.print(numbers[0][1] + " ");
		System.out.println(numbers[0][2]);
		
		System.out.print(numbers[1][0] + " ");
		System.out.print(numbers[1][1] + " ");
		System.out.println(numbers[1][2]);
		
		System.out.print(numbers[2][0] + " ");
		System.out.print(numbers[2][1] + " ");
		System.out.println(numbers[2][2]);
	}
	public void multiArrayLoop() {
		
		int [][] numbers;
		
		numbers = new int [3][3];
		
		numbers[0][0] = 50;
		numbers[0][1] = 60;
		numbers[0][2] = 70;
		
		numbers[1][0] = 50;
		numbers[1][1] = 60;
		numbers[1][2] = 70;
		
		numbers[2][0] = 50;
		numbers[2][1] = 60;
		numbers[2][2] = 70;

		//row
        for(int i = 0; i < numbers.length; i++) {
        	//column
            for(int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
	
		Arrays object = new Arrays();
		//single dimensional array
//		object.singleArray();
//		object.single();
//		object.stringValue();
//		object.str();
//		object.declar();
//		object.multiArray();
		object.multiArrayLoop();
	}

}














