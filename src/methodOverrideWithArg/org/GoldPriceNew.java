package methodOverrideWithArg.org;

public class GoldPriceNew extends GoldPriceOld{

	@Override
	public void earRing(int oldPrice) {
		System.out.println
				("old price of earRing : " + oldPrice);
	}
	@Override
	public void chain(int oldPrice) {
		System.out.println
				("old price of chain : " + oldPrice);
	}
	
	public static void main(String[] args) {
		
		
		GoldPriceNew object = new GoldPriceNew();
		object.earRing(1500);
		object.chain(2500);
	}
	
}
