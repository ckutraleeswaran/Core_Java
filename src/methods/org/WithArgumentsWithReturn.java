package methods.org;

public class WithArgumentsWithReturn {
	
	
	
	//WithArgumentsWithReturn
	
	public int sum(int x, int y) {
		
		return(x+y);
	}
	
	public static void main(String[] args) {
		
		WithArgumentsWithReturn object = new WithArgumentsWithReturn();
		
		System.out.println(object.sum(20, 10));
	}

}
