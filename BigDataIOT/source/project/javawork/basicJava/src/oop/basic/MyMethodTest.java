package oop.basic;

//MyMethodŬ������ ���ǵ� �޼ҵ带 ȣ��
public class MyMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethod m = new MyMethod();
		
		// 1. �޼ҵ��� ȣ�� - �Ű������� ���� ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display();
		
		m.display("Aaa");
		
		m.display("dd", 2);
		
		// 3. �Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ带 ȣ��
		// => ���޵Ǵ� ���ϰ��� ������� �ʾƼ� ��ȭ�� ����.
		// ���ϰ��� �ִ� �޼ҵ带 ȣ���ϴ� ��� ����Ÿ�԰� ���� ������ �����ϰ� ���ٷε�� ���� �Ҵ�ǵ��� �Ѵ�.
		
		int result = m.add(100, 200);
		
		System.out.println("add�޼ҵ� ȣ����=>" +result);
		
		if(result > 100) {
			System.out.println("ũ��.");
		}else {
			System.out.println("�۴�.");
		}
		
		// 2) �ٸ� �޼ҵ��� �Ű������� �޼ҵ��� ���ϰ��� �ٷ� ���� �� �� �ִ�.
		System.out.println(m.add(300, 500));
		
	}

}
