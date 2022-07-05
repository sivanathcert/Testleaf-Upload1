package week3Day1;

public class Overloading {

	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void sub(float c, float d) {
		System.out.println(c-d);
	}
	public void sub(int e, int f, int g) {
		System.out.println(e-f-g);
	}

	public static void main(String[] args) {

		Overloading orr = new Overloading();
		orr.sub(10, 5);
		orr.sub(100.50f, 99.01f);
		orr.sub(100, 50, 50);

	}

}
