package exam;

public class ArgsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//- �����ϱ�
		// - for������ �۾�
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < args.length; i++) {
			sum += Integer.valueOf(args[i]);
		}
		
		avg = ((double)sum)/ args.length;
		
		System.out.println("�� : " + sum);

		System.out.println("��� : " + avg);
	}

}
