package array;

import java.util.Random;

public class ArrayHomeExam01 {

	public static void main(String[] args) {
		
		int[] arrays = new int[5];
		Random ran = new Random();
		
		for(int i = 0 ; i < arrays.length; i++) {
			arrays[i] = ran.nextInt(Integer.MAX_VALUE);
		}
		
		for(int i = 0 ; i < arrays.length; i++) {
			System.out.print("·£´ý¼ö·Î " + arrays[i] + "ÀúÀå");
			
			if(arrays[i] % 2 == 0) {
				System.out.println(" Â¦¼ö");
			}else {
				System.out.println(" È¦¼ö");
			}
		}

	}

}
