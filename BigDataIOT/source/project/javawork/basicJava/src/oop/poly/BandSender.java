package oop.poly;

public class BandSender extends Sender {

	int length;
	public BandSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	@Override
	public void send() {
		// TODO Auto-generated method stub

		System.out.println("Band로 전송하기");
	}

}
