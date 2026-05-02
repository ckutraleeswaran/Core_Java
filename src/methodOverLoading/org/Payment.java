package methodOverLoading.org;

public class Payment {
	
	
	// 1. pay using cash
	public void pay(int money) {
		System.out.println("cash on delivery amount : " + money);
	}
	// 2. Pay using UPI
	public void pay(int money, String upi) {
		System.out.println("upi amount : " + money);
		System.out.println("upi ID : " + upi);
	}
	//3. pay using card
	public void pay(int money, String cardNumber, int cvv) {
		System.out.println("card amount : " + money);
		System.out.println("card number : " + cardNumber);
		System.out.println("card cvv no : " + cvv);
	}
	
	public static void main(String[] args) {
		
		
		Payment object = new Payment();
		
		object.pay(500);
		object.pay(800, "123@axis");
		object.pay(1200, "1234567890", 786);
	}

}
