package test;

public class GuGu_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i <= 9 ; i++ ) {
			if(i==5) {
				continue;
			}
			for(int j = 2; j <= 9; j++) {
//				if(j==5) {
//					continue;
//				}
				System.out.print(j + " * " + i  + "= " + (i * j) + " ");
			}
			System.out.println();
		}
	}

}
