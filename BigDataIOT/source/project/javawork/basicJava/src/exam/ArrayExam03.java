package exam;

public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int oddSum_ia = 0;
		int evenSum_ia = 0;
		for(int i = 0 ; i < ia.length ; i++) {
			if(ia[i] %2 ==0) {
				oddSum_ia += ia[i];
			}else {
				evenSum_ia += ia[i];
			}
		}
		
		System.out.println("¹è¿­ ia");
		System.out.println("È¦¼öÀÇ ÇÕ : " + oddSum_ia);
		System.out.println("Â¦¼öÀÇ ÇÕ : " + evenSum_ia);

		oddSum_ia = 0;
		evenSum_ia = 0;
		
		for(int i = 0 ; i < ib.length ; i++) {
			if(ia[i] %2 ==0) {
				oddSum_ia += ib[i];
			}else {
				evenSum_ia += ib[i];
			}
		}
		

		System.out.println("¹è¿­ ia");
		System.out.println("È¦¼öÀÇ ÇÕ : " + oddSum_ia);
		System.out.println("Â¦¼öÀÇ ÇÕ : " + evenSum_ia);
	}

}
