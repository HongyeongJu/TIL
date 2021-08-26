package exception;

public class CellPhone {
	private String model;
	private double battery;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) throws IllegalArgumentException {
		if(time <0) throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		
		battery -= (time * 0.5);
		if(battery < 0 ) battery = 0;
	}
	
	public void charge(int time) throws IllegalArgumentException{
		if(time <0 )throw new IllegalArgumentException("�����ð��Է¿���");
		
		battery += (time * 3);
		if(battery > 100) battery = 100;
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� ��" + battery);
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone && ((CellPhone) otherObject).getModel().equals(model)) {
			return true;
		}
		return false;
	}
}
