package oop.poly.inter;

public class CarFactory extends Factory implements IWorkingTogether{

	public CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
	}
	
	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		int skill = 0;
		
		if(partner instanceof CarFactory) {
			skill = 2;
		}else if(partner instanceof TVFactory) {
			skill = 5;
		}
		
		return skill * getWorkingTime();
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int res = 0;
		
		switch(skill){
			case 'A':
				res = getWorkingTime() * 3;
				break;
			case 'B':
				res = getWorkingTime() * 2;
				break;
			case 'C' :
				res = getWorkingTime();
				break;
			default :
				res = 0;
				break;
		}
		return res;
	}

	
}
