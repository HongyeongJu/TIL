package basic;

public class APITest02 {

	public static void main(String[] args) {
		String str= new String("java");
		
		// String Ŭ������ ���ǵǾ� �ִ� charAt �޼ҵ带 ���
		//1. StringŬ������ charAt �޼ҵ�� �Ű������� 1���̰� �Ű������� Ÿ���� int�̹Ƿ� 
		//charAt�� ����ϱ� ���ؼ� ()�ȿ� ���� int�� ���ڸ� �����Ѵ�.
		// 2. charAt�� ���� ����� char Ÿ���̹Ƿ� ���� ����� �� ���α׷� �ȿ��� Ȱ���ϱ� ���ؼ� char Ÿ���� ������ �����ؼ� ����� ����
		char result = str.charAt(3);
		System.out.println("3�� ��ġ�� ���ڴ�=>" + result);
	}

}
