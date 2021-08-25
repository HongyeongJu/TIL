package oop.poly.inter;

public class Secretary extends Employee implements Bonus{

	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(getSalary() + (int)(pay * 0.8)); 
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return getSalary() * 0.1;
	}
	
	
	
}
