package oop.poly;

public class KaKaoSender extends Sender {

	int length;
	public KaKaoSender(String name,int length){
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
		System.out.println("카카오로 전송하기");
	}

}
