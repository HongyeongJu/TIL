package oop.basic;
//���� ������ �޼ҵ带 ����
public class MyMethod {
	
	// 4. �Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ�
	// => ���� 2���� �Է¹޾� ���� ����� �����ϴ� �޼ҵ�
	public int add(int num1,int num2) {
		
		
		return num1 + num2;
	}
	
	// 3. �Ű������� 2�� �ְ� ���ϰ��� ���� �޼ҵ�
	//=> ����� Ư�����ڸ� �Է¹ް�, ����� Ƚ���� �Է¹޾Ƽ� ó���ϱ�
	
	public void display(String str, int r) {
		for(int i = 0; i < r ; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	//2. �Ű������� 1�� �ְ� ���ϰ��� ���� �޼ҵ�
	// ===> �����ϴ�. *�� ������� �ʰ� �ܺο��� �Է��ϴ� Ư�����ڸ� ����ϵ��� ����
	// 		ȣ���� �� ���޵Ǵ� Ư�����ڸ� �޸𸮿� �ӽ� �����ϱ� ���� c�� ����
	public void display(String c) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	
	
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	//-> *�� 10�� ����ϴ� ����� �޼ҵ�
	public void display() {
		for(int i = 1; i<= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
