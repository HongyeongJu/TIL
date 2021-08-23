package oop.inheritance;

public class Truck extends Wheeler{

	public Truck(String carName,int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}
	
	@Override
	public void speedUp(int speed) {
		velocity += (speed * 5);
		if(velocity > 100) {
			velocity = 100;
			System.out.println("Ʈ���� �ְ�ӵ��������� �ӵ��� " + velocity + "���� �����ϴ�.");
		}else {
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity + "�Դϴ�.");
		}
	}
	
	@Override
	public void speedDown(int speed) {
		velocity -= (speed * 5);
		if(velocity < 50) {
			velocity = 50;
			System.out.println("Ʈ���� �����ӵ��������� �ӵ��� " +velocity  + "���� �ø��ϴ�.");
		}else {
			System.out.println("Ʈ���� ���� �ӵ��� " + velocity + "�Դϴ�.");
		}
	}

}
