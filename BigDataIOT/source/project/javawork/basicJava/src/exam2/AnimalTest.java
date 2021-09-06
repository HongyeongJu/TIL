package exam2;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Cat(8);
		Animal pig = new Pig(3);
		for (int i =1; i <=3; i++) {
			cat.run(1);
			pig.run(1);
			System.out.println(i+"시간후");
			System.out.println("고양이의 이동거리="+cat.getDistance());
			System.out.println("돼지의 이동거리="+pig.getDistance());
		}
	}
}