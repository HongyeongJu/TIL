package array;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {98,100,78,99,86};
		
		int total = 0;
		double avg = 0.0;
		
		for(int i= 0 ; i < array.length; i++) {
			total += array[i];
		}
		
		avg = ((double)total) / array.length;
		
		System.out.println("ÃÑÇÕ:" + total);
		System.out.println("Æò±Õ:" + avg);
	}

}
