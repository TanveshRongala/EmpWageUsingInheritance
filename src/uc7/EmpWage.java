package uc7;

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
		
		//getting part time employee wage
		employeeData.partTimeEmployeeWage();
		
		//getting employee wage using switch
		employeeData.employeeWageUsingSwitch();
		
		
		//getting wages for month;
		employeeData.WagesForMonth();
		
		//getting Wages For Working Hour And Days
		employeeData.WagesForWorkingHourAndDays();
	}
}