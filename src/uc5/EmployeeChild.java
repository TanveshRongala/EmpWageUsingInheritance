package uc5;

import java.util.logging.Level;
import java.util.logging.Logger;

	public class EmployeeChild extends Employee {

		public static final Logger logger=Logger.getLogger("employeeWage");
		
		//check employee attendance
		protected void EmployeeAttendance() {
			System.out.println("---------------------------------------");
			if(randomNumber==1) {
				logger.log(Level.INFO,"Employee present");	
			}else {
				logger.log(Level.INFO,"Employee absent");
			}
			System.out.println("---------------------------------------");
		}
		
		//calculating daily wage of employee
		protected double DailyEmployeeWage() {
			System.out.println("---------------------------------------");
			dailyWage=wagePerHour*fullDayHour;
			logger.log(Level.INFO,"daily employee wage is :-"+dailyWage+" /- Rs");
			System.out.println("---------------------------------------");

			return dailyWage;
		}
		
		//calculating daily wage of part time employee
		protected void partTimeEmployeeWage() {
			System.out.println("---------------------------------------");
			partTimeEmployeeWage=wagePerHour*partTimeHour;
			logger.log(Level.INFO,"Part time employee wage :-"+partTimeEmployeeWage+" /- Rs");
			System.out.println("---------------------------------------");

		}
		
		//calculating monthly employee wage
		protected void WagesForMonth() {		
			totalWageForMonth=workingDays*dailyWage;
			logger.log(Level.INFO,"total wages for month - "+totalWageForMonth+" RS");		
		}
		

	}