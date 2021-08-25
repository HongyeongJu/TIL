package oop.poly;
// instanceOf연산자
// => 참조변수가 참조하고 있는 객체의 타입을 확인할 수 있는 연산자
class ChildA extends Parent {
	
}
class ChildB extends Super{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InstanceOfTest {

	public static void main(String[] args) {
		ChildA obj1 = new ChildA();
		Child obj2 = new Child();
		ChildB obj3 = new ChildB();
		
		// 각 참조변수에 할당된 객체의 타입을 확인
		// 참조변수에 할당된 객체를 instanceof 뒤에 명시한 타입으로 참조할 수 있는지??
		// Parent obj = obj1
		
		if(obj1 instanceof Parent) {
			System.out.println("Parent 타입이다.");
		}else {
			System.out.println("Parent타입이 아니다.");
		}


		if(obj2 instanceof Parent) {
			System.out.println("Parent 타입이다.");
		}else {
			System.out.println("Parent타입이 아니다.");
		}
		
		// Parent와 전혀 상관없는 클래스이기 때문에 사용을 하질 못한다.
//		if(obj3 instanceof Parent) {
//			System.out.println("Parent 타입이다.");
//		}else {
//			System.out.println("Parent타입이 아니다.");
//		}
		
	}

}
