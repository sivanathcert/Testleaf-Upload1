package week3Day1;

public class Auto extends Vehicle {
	
public void turnOnMeter() {
		System.out.println("Turn On Meter");
	}
	public void  handStart() {
		System.out.println("Hand Start");
	}
	public void applyBreak() {
		System.out.println("Apply Hand Break");
	}

	public static void main(String[] args) {


Auto bajaj1 = new Auto();
bajaj1.turnOnMeter();
bajaj1.handStart();

	}

}
