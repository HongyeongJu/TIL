package oop.inheritance;

// ���� Ŭ����
final class SuperB{ // ����� �Ұ����� Ŭ����
	// �������(��������)�� final�� �߰��ϸ� ����� �ǹ� - ���� ���Ҵ� �� �� ����.
	// => �ڹٿ����� ����� ������ �����ϱ� ���� ����� �빮�ڷ� �����ϱ�� ���
	final int NUM = 100;
	public final void display() {
		System.out.println("�θ��� display()");
	}
}

// ���� Ŭ������ final�� ������ ����� �Ұ�
class SubB extends SuperB{
	public void test() {
		super.NUM = 1000;
		System.out.println(NUM);
	}
	
	// ������ �Ұ�
	public void display() {
		System.out.println("�ڽ��� display()");
	}
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubB obj = new SubB();
		obj.test();
	}

}
