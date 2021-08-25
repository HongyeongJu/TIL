package oop.poly;

public class Tea extends Beverage {
	public static int amount = 0;
	
	public Tea(String name) {
		super(name);
		amount++;
		
		calcPrice();
	}

	@Override
	public void calcPrice() {
		String name = super.getName();
		if(name.equals("lemonTea")) {
			super.setPrice(1500);
		}else if(name.equals("ginsengTea")) {
			super.setPrice(2000);
		}else if(name.equals("redginsengTea")) {
			super.setPrice(2500);
		}
	}
	
	
}
