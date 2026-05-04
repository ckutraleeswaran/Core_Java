package partialAbstraction.org;

public class Display extends OnePlus{
	
	

	@Override
	public void location() {
		System.out.println("location : chennai");
	}

	@Override
	public void googlePay(int money) {
		System.out.println("gpay : " + money);
		
	}	
	
	public static void main(String[] args) {
		
		
		Display object = new Display();
		
		object.os();
		object.whatsapp();
        object.location();
        object.googlePay(10500);
	}

	

}
