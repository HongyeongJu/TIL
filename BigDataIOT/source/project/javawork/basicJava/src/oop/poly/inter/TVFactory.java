package oop.poly.inter;

public class TVFactory extends Factory implements IWorkingTogether{

	public TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
	}
	
	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		int skill = 0;
		
		if(partner instanceof CarFactory) {
			skill = 1;
		}else if(partner instanceof TVFactory) {
			skill = 3;
		}
		
		return skill * getWorkingTime();
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int res = 0;
		
		switch(skill){
			case 'A':
				res = getWorkingTime() * 8;
				break;
			case 'B':
				res = getWorkingTime() * 5;
				break;
			case 'C' :
				res = getWorkingTime() * 3;
				break;
			default :
				res = getWorkingTime();
				break;
		}
		return res;
	}

	
}
