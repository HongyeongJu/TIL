package oop.poly;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
		
	}
	
	public Shape(String name) {
		this.name =name;
	}
	
	public abstract void calculationArea();
	
	public void print();
}
