package api.lang;
// String�� StringBuffer�� ���� ����
public class StringStringBufferTest {

	//Sting���� ���ڿ� �߰��ϱ� ����� ���� - + �����ڷ� �߰�
	public static void stringCheck(int count) {
		// ������ �� ���� �ð��� ���� -nanoTime
		String str = new String("�ڹ�");
		long start = System.nanoTime();
		
		for(int i = 1; i <= count; i++) {
			str = str + "java";
		}
		
		//�۾��� ����� �� ���� �ð��� ����
		long end =System.nanoTime();
		long time = end - start;
		System.out.println("str = str + java ");
		System.out.println("����ð� : "+ time);
	}
	
	// StringBuffer�� ���ڿ� �߰��ϱ� - append
	public static void stringBufferCheck(int count) {
		// ������ �� ���� �ð��� ���� -nanoTime
		StringBuffer str = new StringBuffer("�ڹ�");
		long start = System.nanoTime();
		
		for(int i = 1; i <= count; i++) {
			str.append("java");
		}
		
		
		//�۾��� ����� �� ���� �ð��� ����
		long end =System.nanoTime();
		long time = end - start;
		System.out.println("str.append(java) ");
		System.out.println("����ð� : "+ time);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10000;
		System.out.println("����Ƚ��: " +count);
		stringCheck(count);
		stringBufferCheck(count);
	}

}
