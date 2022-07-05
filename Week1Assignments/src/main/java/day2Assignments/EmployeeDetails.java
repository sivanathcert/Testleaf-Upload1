package day2Assignments;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeDetails objectEmp = new EmployeeDetails();
		objectEmp.printEmployeeName("Mr.ABC", 456578);
		String EmplAdd = objectEmp.getEmployeeAddress("Vepery, Chennai");
		System.out.println(EmplAdd);
		objectEmp.printEmpSalary(222235.5665);
		long mobileNum = objectEmp.empMobileNumber(5678445654L);
		System.out.println("Emp Mobile Number : " + mobileNum);
	}
public void printEmployeeName(String empName, int empId)
{
	System.out.println("Employee Name : " + empName + " (Emp ID - " + empId + " )");
	//System.out.println("Employee ID   : " + empName);
}
private String getEmployeeAddress(String empAddress)
{
	return "Address is    : " + empAddress;
}
public void printEmpSalary(double empSalary)
{
	System.out.println("Employee Salary is : Rs." + empSalary);
}
private long empMobileNumber(long mobNumber) {
	return mobNumber;
}
}
