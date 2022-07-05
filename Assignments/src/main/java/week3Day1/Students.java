package week3Day1;

//Method Overloading

public class Students {

	// Creating getStudentInfo() method by passing different parameters

	public int getStudentInfo(int studId) {
		return studId;
	}

	public void getStudentInfo(int studId1, String studName) {
		System.out.println("Student ID : " + studId1);
		System.out.println("Student Name : " + studName);
	}

	public void getStudentInfo(String studEmail, long studPhone) {
		System.out.println("Student Email :" + studEmail);
		System.out.println("Student Phone# :" + studPhone);
	}

	public static void main(String[] args) {

		Students stud = new Students();

		//Overloading getStudentInfo() with Studend ID along
		System.out.println("Overloading with Studend ID along");
		System.out.println("----------------------------------");
		System.out.println("Student ID : " + stud.getStudentInfo(789412));
		System.out.println("\n");

		//Overloading getStudentInfo() with Studend ID and Name
		System.out.println("Overloading with Studend ID and Name");
		System.out.println("------------------------------------");
		stud.getStudentInfo(154679, "Rangarajan");
		System.out.println("\n");

		//Overloading getStudentInfo() with Studend Email ID and Phone Number
		System.out.println("Overloading with Studend ID and Name");
		System.out.println("------------------------------------");
		stud.getStudentInfo("ranga.rajan@yahoo.com", 9844455556L);
		System.out.println("\n");

	}

}
