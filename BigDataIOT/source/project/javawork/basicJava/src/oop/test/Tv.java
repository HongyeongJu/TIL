package oop.test;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public Tv() {
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}
	
	public void power() {
		this.power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	public void print() {
		System.out.println("color : " + color + " power: "+ power + " channel : " + channel);
	}
}
