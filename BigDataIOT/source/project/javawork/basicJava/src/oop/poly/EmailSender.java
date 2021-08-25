package oop.poly;

public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	// 이메일로 전송하기
	public void send() {
		System.out.println("이메일로 전송하기");
	}
}

