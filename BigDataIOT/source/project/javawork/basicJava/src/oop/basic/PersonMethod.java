package oop.basic;

class PersonMethod {
	private String name;
	private int age;
	private String addr;
	
//	������������ ���
//	public String name;
//	private int age;
//	String addr;
	
	// name������ private���� �ܺο��� ���ٺҰ��� �����Ǿ��� ������ public �޼ҵ带 ���� ���� �����ϰ� ���� ������ �� �ֵ��� �����Ѵ�.
	// name������ ���� �����ϴ� �޼ҵ� - setter �޼ҵ�
	// setter�� getter�޼ҵ���� �ۼ��ϴ� ���
	//  set()get) + ��������� (��������� ù ���ڸ� �빮�ڷ� ����)
	// => �⺻ �ڹٿ����� setter/getter�޼ҵ��� �̸��� ����� �� ����� ��Ű�� �ʾƵ� ������ ���� �ʴ´�.
	// �׷��� �������̳� ���� ����� ���� �� ��Ģ�� ��Ű�� ������ ������ �߻��� �� �ִ�.
	public void setName(String name) {
		this.name = name;// ���� ����� ������ ���� �Žĵȴ�.
		//�ɹ������� �Ű��������� ������ ��� �Ű����� = �Ű������� �νĵǹǷ�
		//= ���� ������ ��ü�� �������� ��Ÿ���� �Ѵ�. �̋� ����ϴ� Ű���尡 this
		// this�� ���� �۾� ���� ��ü�� �ǹ�
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return this.addr;
	}
}
