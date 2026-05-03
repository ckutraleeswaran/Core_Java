package methodOverride.org;

public class SemesterTwo extends SemesterOne{
	
	@Override
	public void tamil() {
		System.out.println("Tamil : Fail " );
	}
	@Override
	public void english() {
		System.out.println("English : Fail " );
	}
	@Override
	public void maths() {
		System.out.println("Maths : Fail " );
	}
	@Override
	public void science() {
		System.out.println("Science : Fail " );
	}
	@Override
	public void socialScience() {
		System.out.println("SocialScience : Fail " );
	}
	
	public static void main(String[] args) {
		
		SemesterTwo object = new SemesterTwo();
		object.tamil();
		object.english();
		object.maths();
		object.science();
		object.socialScience();
	}
	

	
}
