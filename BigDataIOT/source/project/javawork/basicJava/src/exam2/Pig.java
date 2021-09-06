package exam2;


public class Pig extends Animal{
	
	Pig(int speed){
		super(speed);
	}

	@Override
	public void run(int hour) {
		super.distance += ((double)(hour * super.speed)) / 2;
	}
	
}