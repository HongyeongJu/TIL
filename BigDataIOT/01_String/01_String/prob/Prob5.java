public class Prob5 {
	public static void main(String[] args) {
		Prob1 p = new Prob1();
		String addr = "�����,������,�������,�����ܾ�ī����";
		String[] addrArr = p.split(addr, ',');
		System.out.println("�迭 ũ�� : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		
		
	}
}



















