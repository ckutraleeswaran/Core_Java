package stringMethods.org;

public class MethodOfString {
	
	public void upperCase() {
		String name = "kutraleeswaran";
		
			System.out.println(name.toUpperCase());
	}
	public void lowerCase() {
		String dept = "ENGINEERING";
		
			System.out.println(dept.toLowerCase());
	}
	public void length() {	///working from 1 
		String name = "kutraleeswaran";
			System.out.println(name.length());
	}
	public void indexString() {		//starts from 0
		String name = "kutraleeswaran";
		
			System.out.println("first index of 'a' is : " + (name.indexOf("e")));	// index first
			
			int second = name.indexOf("e");
				
				System.out.println("second Index of 'a' : " + (name.indexOf("e", second + 1)));
				
			System.out.println("last ndex of 'a' : " + (name.lastIndexOf("e")));
	}
	public void charAtMethod() {
		
		String name = "kutraLeeswaran";	
		
		char find = name.charAt(5);
			
			System.out.println("find a 5th index is : " + find);
	}
	public void concatString() {
		
		String first = "Hello";
		String second = " world";
		
//			System.out.println(first + second);
		
		String concating = first.concat(second);
			System.out.println("after concat : " + concating);
	}
	public void containMethod() {
		
		String movie = "tamil cinema from kollywood";
		
			boolean cine = movie.contains("chennai");
				
				System.out.println("find contains : " + cine);

	}
	public void startWith() {
		
		String name = "sandhiya";
		
			boolean find = name.startsWith("an");
			
				System.out.println("startWith : " + find);
	}
	public void endWith() {
		
		String name = "sandhiya";
		
			boolean find = name.endsWith("san");
			
				System.out.println("startWith : " + find);
	}
	public void equalIgnore() {
		
		String name = "sandhiya";
		String namie = "SANDHIYA";
			
			
				System.out.println("startWith : " + name.equalsIgnoreCase(namie) );
	}
	
	public static void main(String[] args) {
		
		
		MethodOfString object = new MethodOfString();
		
			object.equalIgnore();
			
	}
	

}
