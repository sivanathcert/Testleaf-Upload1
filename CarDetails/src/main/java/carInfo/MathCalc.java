package carInfo;

public class MathCalc {
	
	public static void main(String[] args) {
		MathCalc obj1 = new MathCalc();
		int Sum = obj1.calcAdd(5, 10);
		System.out.println(Sum);
		
		float Subt = obj1.calcSub(5, 10);
		System.out.println(Subt);
		
		double Mult = obj1.calcMul(5, 10, 15);
		System.out.println(Mult);
		
		int Divi = obj1.calcDiv(50, 10);
		System.out.println(Divi);
	}
	
	public int calcAdd(int a, int b)
		{
			return a+b;
		}
	
	private float calcSub(float a1, float b1)
	{
		return a1-b1;
	}

	public double calcMul(double c, double d, double e)
	{
		return c*d*e;
	}

	public int calcDiv(int x, int y)
	{
		return x/y;
	}
	
}
