package methods.org;

public class WithoutArgumentsWithReturn {

	
	
	//WithoutArgumentsWithReturn
	public int ticketPrice() {	// should not use sysout inside the return method
		return(10+20);
	}
	
	public String fullName() {
		return("Raj " + "kumar" );
	}
	
	public static void main(String[] args) {
		
		WithoutArgumentsWithReturn object = new WithoutArgumentsWithReturn();
		
		System.out.println("ticketPrice : " + object.ticketPrice());
		System.out.println("fullName : " + object.fullName());
		
	}
	
	
}
