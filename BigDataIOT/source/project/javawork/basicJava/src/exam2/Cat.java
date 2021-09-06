package exam2;

public class Cat extends Animal{
	
	Cat(int speed){
		super(speed);
	}

	@Override
	public void run(int hour) {
		super.distance += hour * super.speed;
	}
	
}
