package exam;

public class ArgsExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < args.length ; i++) {
			
			int num = Integer.valueOf(args[i]);.
			String anw ="";
			if(num % 2 == 0) {
				anw ="짝수";
			}else {
				anw = "홀수";
			}
			
			
			System.out.println("명령행매개변수" + (i + 1) + "->" +anw);
		}

	}

}
