package uc2;

public class EmpWage {

	public static void main(String[] args) {
		
		//creating object for child class
		EmployeeChild employeeData=new EmployeeChild();
		//getting random number
		employeeData.getRandomNumber();
		//checking for employee attendance
		employeeData.EmployeeAttendance();
		//getting daily employee wage
		employeeData.DailyEmployeeWage();
		
	}
}