// ��������(short-circuit) - &&, ||
//			&, |�� ���̴� ���ǽ��� ��� �˻��ϴ��� skip�ϴ��� ����

public class OprTest04
{
	public static void main(String[] args) 
	{
		int num1 = 120;
		// �ڹٴ� ����������( ���پ� �����Ű�� ��) �̱⶧���� ������ �߻��ϴ��� ���ٱ����� ����� ���� �ִ�.
		System.out.println("�۾�����");
		String str = null;		// ���� str�� �ƹ��͵� �Ҵ���� ���� ����
		//str.length();			// nullPointer Exception!! <- �ƹ��͵� ������ �Ǿ����� �ʾƼ� �߻�
		
		// | �����ڴ� �񱳵Ǵ� 2���� ���� �� �˻縦 �Ѵ�.
		//System.out.println(num1 > 100 | str.length() > 0);
		// || �����ڴ� or������ Ư���� �ľ��ϰ� ù ��° ���� true ������ ���� ���� �˻����� �ʴ´�.
		System.out.println(num1 > 100 || str.length() > 0);			// ù��° �� �˻��ϰ� true�� �ڿ����� �ƿ� �˻����� �ʴ´�.

		// &&�����ڴ� and������ Ư���� �ľ��ϰ� ù ��° ���� false �̸� ���� ���� �˻����� �ʴ´�.
		// &�Ѱ� ¥���� ������ �������� ������ ���������� �Ѵ� �˻��Ѵ�.
		//System.out.println(num1 <100 & str.length() > 0);
		System.out.println(num1 <100 && str.length()> 0);
	}
}
