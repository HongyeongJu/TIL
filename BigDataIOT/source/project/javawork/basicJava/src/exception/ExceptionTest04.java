package exception;
import java.util.InputMismatchException;
// ����ó������ -try ~catch ~catch
// => catch���� �������� �����ϰ� ���
// = >������ ������ ���� �پ��� ������� ���ܸ� ó���ϵ��� ������ �� �ִ�.
// => ������ ���� Ŭ������ �� �Ʒ��ʿ� �����ؾ� �Ѵ�.
import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			//���� �߻� ���ɼ��� �ִ� �ڵ�
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num = key.nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���: " + (num / num2));
			System.out.println("�ٸ� �۾��� ó��");
			System.out.println("end");
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ��������.");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ� �մϴ�. ���ڸ� �Է��ϼ̾�� �ٽ� Ȯ�����ּ���.");
		}
		catch(Exception e) {
			//���ܷ�ġ
			System.out.println("��Ÿ ó������ ���� ������ �߻��� ���");
		}finally {
			System.out.println("�ڿ��ݳ�");
		}
	}

}
