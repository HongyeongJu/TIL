package exam;

public class Logci12 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{3, 24, 1, 55, 17, 43, 5};
		
		
		for(int i = 0 ;i < 6 ; i++) {
			int min = arr[i];
			int min_index = i;
			for(int j = i+ 1; j < 7; j++) {
				if(min > arr[j]) {
					min = arr[j];
					min_index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = min;
			arr[min_index] = temp;
		}
		
		for(int i = 0 ; i < 7 ; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
