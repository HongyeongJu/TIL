package oop.poly;

public class Coffee extends Beverage {
	public static int amount = 0;
	
	public Coffee(String name) {
		super(name);
		amount++;
		
		calcPrice();
	}

	@Override
	public void calcPrice() {
		String name = super.getName();
		if(name.equals("Americano")) {
			super.setPrice(1500);
		}else if(name.equals("CafeLatte")) {
			super.setPrice(2500);
		}else if(name.equals("Cappuccino")) {
			super.setPrice(3000);
		}
	}
	
	
}
