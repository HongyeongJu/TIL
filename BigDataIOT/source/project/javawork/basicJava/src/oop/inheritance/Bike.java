package oop.inheritance;

public class Bike extends Wheeler{

	public Bike( String carName, int velocity,int wheelNumber) {
		super(velocity, carName, wheelNumber);
		
		
	}
	
	@Override
	public void speedUp(int speed) {
		velocity += speed;
		if(velocity > 40) {
			velocity = 40;
			System.out.println("�������� �ֵ��ӵ��������� �ӵ��� " + velocity + "���� �����ϴ�.");
		}else {
			System.out.println("�������� ���� �ӵ��� " +  velocity + "�Դϴ�.");
		}
	}
	
	@Override
	public void speedDown(int speed) {
		velocity -= speed;
		
		if(velocity < 10) {
			velocity = 10;
			System.out.println("�������� �����ӵ��������� �ӵ��� " + velocity + "���� �ø��ϴ�.");
		}else {
			System.out.println("�������� ���� �ӵ��� " +  velocity + "�Դϴ�.");
		}
	}

}
