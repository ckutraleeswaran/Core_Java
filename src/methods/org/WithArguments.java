package methods.org;

public class WithArguments {

	
	//with argument without return
	public void atm(int otp) {
		System.out.println("my atm pin is : " + otp);
	}
	public void upi(int acNo,String ifsc) {
		
		System.out.println("account Number : " + acNo );
		System.out.println("IFSC code : " + ifsc);
	}
	
	public static void main(String[] args) {
		
		WithArguments object = new WithArguments();
	
		object.atm(9887);
		object.upi(123456, "hdfc7658");
	
	
	}
}
