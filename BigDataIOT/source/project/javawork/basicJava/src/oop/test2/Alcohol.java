package oop.test2;

public class Alcohol extends Drink{
	
	private double alcper;
	
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper =alcper;
	}
	
	public static void printTitle() {
		System.out.println("��ǰ��(����[%])\t�ܰ�\t����\t�ݾ�");
	}

	@Override
	public void printData() {
		System.out.println(name+"("+alcper+")\t" +price +"\t"+ count +"\t"+ getTotalPrice());
	}
	
}
