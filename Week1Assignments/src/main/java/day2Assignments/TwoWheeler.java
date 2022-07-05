package day2Assignments;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors=2;
	long chasisNumber = 123458787446654L;
	boolean isPunctured=false;
	String bikeName="Yamaha";
	double runningKM = 45454.33;
	
	public static void main(String[] args) {
	TwoWheeler twoObj=new TwoWheeler();
	System.out.println(twoObj.noOfWheels);
	System.out.println(twoObj.noOfMirrors);
	System.out.println(twoObj.chasisNumber);
	System.out.println(twoObj.isPunctured);
	System.out.println(twoObj.bikeName);
	System.out.println(twoObj.runningKM);
	}

}
