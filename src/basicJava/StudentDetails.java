package basicJava;

public class StudentDetails {
	
	public void raj() {
		String name = "raj";
		String mailId = "raj@gmail.com";
		int age = 25;
		int rollNo = 9504;

			System.out.println(name);
			System.out.println(mailId);
			System.out.println(age);
			System.out.println(rollNo);
	}
	public void kavitha() {
		String name = "kavitha";
		String mailId = "kavitha@gmail.com";
		int age = 25;
		int rollNo = 9503;

			System.out.println(name);
			System.out.println(mailId);
			System.out.println(age);
			System.out.println(rollNo);
	}

	public void rajini() {
		String name = "rajini";
		String mailId = "rajini@gmail.com";
		int age = 25;
		int rollNo = 9500;

			System.out.println(name);
			System.out.println(mailId);
			System.out.println(age);
			System.out.println(rollNo);
	}
	public static void main(String [] args){	// main method 

		//object
		//SYNTAX : ClassName objectName = new ClassName();
		
		StudentDetails data = new StudentDetails();
		
		data.kavitha();
		
	}

}
