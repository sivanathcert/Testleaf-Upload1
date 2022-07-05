package day2Assignments;
public class MyCar {
	public static void main(String[] args) {
		CarClass carObj = new CarClass();
		System.out.println(carObj.switchOnAc());
		System.out.println(carObj.applyGear());
		String breakStatus = carObj.applyBreak();
		System.out.println(breakStatus);
		carObj.applyAcclerate();
	}
}
