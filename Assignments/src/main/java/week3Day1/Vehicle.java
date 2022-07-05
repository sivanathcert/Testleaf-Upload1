package week3Day1;

public class Vehicle {

	public void applyBreak() {
		System.out.println("Apply Normal Break");
	}
	
	public void soundHorn() {
		System.out.println("Press Horn \n");
	}
	
	public static void main(String[] args) {
		
Vehicle vehicle1 = new Vehicle();

vehicle1.soundHorn();

vehicle1.applyBreak();

Car aa = new Car();
aa.applyBreak();

Auto bb = new Auto();
bb.applyBreak();

	}

}
