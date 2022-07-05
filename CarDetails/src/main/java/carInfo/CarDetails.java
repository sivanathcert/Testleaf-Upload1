package carInfo;

public class CarDetails {
	
	public static void main(String[] args) {
		CarDetails obj=new CarDetails();
		obj.printCarName();
		String carColor = obj.getCarColor();
		System.out.println(carColor);
		System.out.println(obj.isCarPunctured());
	}

	public void printCarName()
	{
		System.out.println("Swift");
	}
	
private String getCarColor()
{
	return "Balck";
}

public boolean isCarPunctured()
{
return true;
}

}
