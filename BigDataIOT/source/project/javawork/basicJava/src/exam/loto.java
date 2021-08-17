package exam;

import java.util.Random;

public class loto {

	public static void main(String[] args) {
		
		//로또번호 45까지
		
		Random ran = new Random();
		int[] nums = new int[7];
		
		for(int i= 0 ; i < 7; i++) {
			boolean isOkay;
			int num;
			while(true) {
				isOkay = true;
				num = ran.nextInt(45) + 1;
				for(int j = 0; j <i ;j++) {
					if(num == nums[j]) {
						isOkay = false;
						break;
					}
				}
				if(isOkay) {
					break;
				}
			}
			nums[i] = num;
			System.out.println(num);
		}

	}

}
