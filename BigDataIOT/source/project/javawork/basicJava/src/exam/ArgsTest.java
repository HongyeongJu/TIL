package exam;

public class ArgsTest {

	public static void main(String[] args) {
		System.out.println("사용자 ip:" + args[0]);
		System.out.println("사용자 port:" + args[1]);

		System.out.println(Integer.valueOf(args[2])+Integer.valueOf(args[3]));
	}

}
