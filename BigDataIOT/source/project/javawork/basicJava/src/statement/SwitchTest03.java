package statement;

public class SwitchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int data =5;
		switch(data+60) {
		case 'A':		// char �� int �� �ڵ�ĳ������ �ǹǷ� ������� ����
			System.out.println("A");
			break;
		case 'B':		// char �� int �� �ڵ�ĳ������ �ǹǷ� ������� ����
			System.out.println("B");
			break;
		case 'C':		// char �� int �� �ڵ�ĳ������ �ǹǷ� ������� ����
			System.out.println("C");
			break;
		}
		
		String code =new String("A01");
		
		switch(code) {
		case "A01" :
			System.out.println("A01");
			break;
		case "A02" :
			System.out.println("A02");
			break;
		}
		
	}

}
