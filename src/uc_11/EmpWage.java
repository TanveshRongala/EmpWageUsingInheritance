package uc_11;

public class EmpWage {

	public static void main(String[] args) {

		// creating object for child class
		EmployeeChild employeeData = new EmployeeChild();

		// getting random number
		employeeData.getRandomNumber();

		// checking for employee attendance
		employeeData.EmployeeAttendance();

		// getting daily employee wage
		employeeData.DailyEmployeeWage();

		// getting part time employee wage
		employeeData.partTimeEmployeeWage();

		// getting employee wage using switch
		employeeData.employeeWageUsingSwitch();

		// getting wages for month;
		employeeData.WagesForMonth();

		// getting Wages For Working Hour And Days
		employeeData.WagesForWorkingHourAndDays("airtel", 30, 100, 120);
		employeeData.WagesForWorkingHourAndDays("vodafone", 302, 100, 120);
		employeeData.WagesForWorkingHourAndDays("idea", 250, 100, 120);
		employeeData.WagesForWorkingHourAndDays("bsnl", 207, 100, 120);

		// storing company wage and name
		EmployeeChild airtel = new EmployeeChild();
		airtel.WagesForWorkingHourAndDays("airtel", 78, 452, 7854);
		System.out.println(airtel.nameOfCompany + " :: " + airtel.employeeWageBuilder);

		// storing company wage and name
		EmployeeChild tata = new EmployeeChild();
		tata.WagesForWorkingHourAndDays("tata", 745, 452, 7854);
		System.out.println(tata.nameOfCompany + " :: " + tata.employeeWageBuilder);

		// getting all company wages
		tata.getAll();

	}
}
