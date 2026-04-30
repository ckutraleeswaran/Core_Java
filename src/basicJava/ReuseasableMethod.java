package basicJava;

public class ReuseasableMethod {
	
	
	
	public void school() {
	
		
		int standard = 12;
		int mark = 1150;
		String graduate = "Pass";
	
			System.out.println("standard : " + standard);
			System.out.println("mark : " + mark);
			System.out.println("gruaduate : " + graduate);
	}
	
		public void studentDetails() {
		String studentName = "Anvi";
		int rollNo = 123456;
		String degree = "B.E";
		String branch = "ECE";
 		
			System.out.println("studentName : " + studentName);
			System.out.println("rollNo : " + rollNo);
			System.out.println("degree : " + degree);
			System.out.println("branch : " + branch);
	}
	
	public void firstSem() {
		
		float cgpa = 8.5f ;
		String graduate = "Pass";
	
			System.out.println("cgpa : " + cgpa);
			System.out.println("gruaduate : " + graduate);
	}
	
	public static void main(String[] args) {
				
		//Object
		ReuseasableMethod obj = new ReuseasableMethod();
		
		obj.school();
		
		obj.studentDetails();
		
		obj.firstSem();
		
	}

}
