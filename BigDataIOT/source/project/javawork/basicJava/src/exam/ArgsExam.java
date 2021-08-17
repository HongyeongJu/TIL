package exam;

public class ArgsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//- 설정하기
		// - for문으로 작업
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < args.length; i++) {
			sum += Integer.valueOf(args[i]);
		}
		
		avg = ((double)sum)/ args.length;
		
		System.out.println("합 : " + sum);

		System.out.println("평균 : " + avg);
	}

}
