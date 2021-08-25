package oop.poly.inter;

interface SuperInterA{ //- 3번의 예시
	void show();
}

interface InterA{
	void test();
	void display();
}

interface InterB{
	void test2();
}
interface InterC{
	void test3();
}


interface ChildInter extends InterA, InterB{// -----5, 6 번
	
}

class TestB extends TestA implements InterA, InterB{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestA implements SuperInterA{ // -4번의 예시

	@Override
	public void show() { // - 3번의 예시
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
