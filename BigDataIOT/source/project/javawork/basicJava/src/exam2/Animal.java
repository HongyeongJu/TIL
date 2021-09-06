package exam2;

public abstract class Animal {
	int speed;
	double distance;
	
	Animal(int speed){
		this.speed = speed;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public abstract void run(int hour);
}
