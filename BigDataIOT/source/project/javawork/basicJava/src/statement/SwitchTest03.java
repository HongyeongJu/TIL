package statement;

public class SwitchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int data =5;
		switch(data+60) {
		case 'A':		// char 가 int 로 자동캐스팅이 되므로 정상실행 가능
			System.out.println("A");
			break;
		case 'B':		// char 가 int 로 자동캐스팅이 되므로 정상실행 가능
			System.out.println("B");
			break;
		case 'C':		// char 가 int 로 자동캐스팅이 되므로 정상실행 가능
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
