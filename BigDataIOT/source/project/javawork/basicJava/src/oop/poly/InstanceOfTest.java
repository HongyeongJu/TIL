package oop.poly;
// instanceOf������
// => ���������� �����ϰ� �ִ� ��ü�� Ÿ���� Ȯ���� �� �ִ� ������
class ChildA extends Parent {
	
}
class ChildB extends Super{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InstanceOfTest {

	public static void main(String[] args) {
		ChildA obj1 = new ChildA();
		Child obj2 = new Child();
		ChildB obj3 = new ChildB();
		
		// �� ���������� �Ҵ�� ��ü�� Ÿ���� Ȯ��
		// ���������� �Ҵ�� ��ü�� instanceof �ڿ� ����� Ÿ������ ������ �� �ִ���??
		// Parent obj = obj1
		
		if(obj1 instanceof Parent) {
			System.out.println("Parent Ÿ���̴�.");
		}else {
			System.out.println("ParentŸ���� �ƴϴ�.");
		}


		if(obj2 instanceof Parent) {
			System.out.println("Parent Ÿ���̴�.");
		}else {
			System.out.println("ParentŸ���� �ƴϴ�.");
		}
		
		// Parent�� ���� ������� Ŭ�����̱� ������ ����� ���� ���Ѵ�.
//		if(obj3 instanceof Parent) {
//			System.out.println("Parent Ÿ���̴�.");
//		}else {
//			System.out.println("ParentŸ���� �ƴϴ�.");
//		}
		
	}

}
