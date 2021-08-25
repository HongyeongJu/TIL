package oop.poly.inter;

public class Sales extends Employee implements Bonus{

	public Sales() {
		super();
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(getSalary() + (int)(pay * 1.2)); 
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return getSalary() * 0.13;
	}
	
	
	
}
