package accessModifier.org;

public class Static_AM {
	
	static int a,b,c,d;
	
	public static void sum() {
		
		
		a = 10;
		
		b = 20;
		
		c = 30;
		
		d = ( a + b + c);
		
			System.out.println("d is : " + d);
	}
	
	
	public void multi() {
		
		
		a = 100;
		
		b = 200;
		
		c = 300;
		
		d = a * b;
		
			System.out.println("d multiple : " + d);
	}

	public static void main(String[] args) {
		
		Static_AM obj = new Static_AM();
//		obj.sum();
		
		sum();
		obj.multi();
	}

}
