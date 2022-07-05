package week1.day2;
import carInfo.CarDetails;
public class CarInfoFromPack1 {

	public static void main(String[] args) {
		CarDetails obj=new CarDetails();
		obj.printCarName();
		/* String carColor = obj.getCarColor();   -- It's private scope
		System.out.println(carColor);*/
		System.out.println(obj.isCarPunctured());
	}
	
}
