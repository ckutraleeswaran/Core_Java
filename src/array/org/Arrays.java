package array.org;

public class Arrays {
	
//	Array
//	---------
//	1. single dimensional  array
//	2. multi dimensional array
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
	public static void main(String[] args) {
		Arrays object = new Arrays();
		
		object.singleArray();
		object.single();
		object.stringValue();
		object.str();
	}

}






















