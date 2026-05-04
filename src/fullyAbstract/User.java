package fullyAbstract;

public class User implements NetBanking{

	@Override
	public void acNo() {
		System.out.println("ac no : 1234567890");
		
	}

	@Override
	public void name() {
		System.out.println("ac name : sandy");
		
	}

	@Override
	public void ifsc() {
		System.out.println("ac ifsc : axis123");	
		
	}

	@Override
	public void pin() {
		System.out.println("ac pin : 2426");
		
	}
	
	public static void main(String[] args) {
		User object = new User();
		
		object.acNo();
		object.name();
		object.ifsc();
		object.pin();
		
	}

}
