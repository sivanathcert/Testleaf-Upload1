package week3Day1;

public class Car extends Vehicle {
	
	public void turnOnAc() {
		System.out.println("Turn On AC");
	}
	public void  sunRoof() {
		System.out.println("Open Sunroof");
	}
	public void applyBreak() {
		System.out.println("Apply ABS Break");
	}

	public static void main(String[] args) {

Car BMW1 = new Car();
BMW1.turnOnAc();
BMW1.sunRoof();
BMW1.applyBreak();
	}

}
