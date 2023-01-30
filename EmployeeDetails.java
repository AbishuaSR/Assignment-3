package week2.day1;

public class EmployeeDetails {
public void printEmployeeName(String empName, int empId) {
	System.out.println("Employee Name: "+ empName  +"\nEmployee Id:  "+empId);

}
public void getEmployeeAddress(String empAddress){
	System.out.println("Employee Address: "+ empAddress );

}
public void printEmployeeSalary(double empSalary){
	System.out.println("Employee Salary: "+ empSalary);
}
public void printEmployeeMobileNumber(long mobNum){
	System.out.println("Employee Mobile Number: "+ mobNum);
}
public static void main(String[] args) {
	EmployeeDetails emp= new EmployeeDetails();
	emp.printEmployeeName("Abishua", 123);
	emp.getEmployeeAddress("Chennai");
	emp.printEmployeeSalary(30000);
	emp.printEmployeeMobileNumber(9952845227l);
}
}
