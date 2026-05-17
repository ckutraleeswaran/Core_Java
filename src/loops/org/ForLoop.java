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
	public void stringValue() {
		
		String name = "sandhiya";	// find length by using `length()`
			System.out.println("before reverse : " + name);
		String text = "";
		
		for(int i = name.length()-1 ; i >= 0 ; i--) {
			
			text = text + name.charAt(i);
		}
		System.out.println("after reverse : " + text);
	}
	public void reverse() {
		
		String school = "Government";
			System.out.println("before reverse : " + school);
		String revers = "";
		
		for(int i = school.length()-1 ; i >= 0 ; i--) {
			
			revers = revers + school.charAt(i);
//				System.out.println("after reverse : " + revers);
		}
		System.out.println("after reverse : " + revers);
	}
	public void polindrome() {		// madam / amma / appa / malayalam
	
		
		String txt = "amma";
			System.out.println("before reverse : " + txt);
		String dummy = "";
		
		for(int i = txt.length()-1 ; i >= 0 ; i-- ) {
			
			dummy = dummy + txt.charAt(i);
		}
			System.out.println("after reverse  : " + dummy);
			
		if(txt.equalsIgnoreCase(dummy)) {
			System.out.println("it's a polindrome");
		}
		else {
			System.out.println("it's not a polindrome");
		}
			
			
	}
	public void anagram() {		// 
//	tamilnadu = udanlimat
//  silent = listen
	}
	public void stringTxt() {

		String name ="Tamil";
//			System.out.println(name);
		
		String dummy ="";
		
		for(int i = 0 ; i <= name.length() -1 ; i++) {
			
			dummy = dummy + name.charAt(i);
			System.out.println("print : " + dummy);
		}
		
	}
	public void vowel() {	//find vowel count in string value
		
		 String name = "education";
		  
		 int vowels = 0;

		 for(int i = 0 ; i <= name.length() -1 ; i++) {
			 
			 
			 char ch  = name.charAt(i);
			 
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				 
				 System.out.println("it's vowel : " + ch);
				 
				 vowels = vowels + 1;
//				 vowels++;			//shortest form
			 } 
		 }

		 System.out.println("vowels count is : " + vowels);
	}

	public static void main(String[] args) {
			
		ForLoop obj = new ForLoop();
		
//		obj.postIncrement();
//		obj.preIncrement();
//		obj.stringValue();
//		obj.reverse();
//		obj.polindrome();
//		obj.stringTxt();
		obj.vowel();
	}
}
