public class Prob5 {
	public static void main(String[] args) {
		Prob1 p = new Prob1();
		String addr = "서울시,강남구,테헤란로,에이콘아카데미";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		
		
	}
}



















