package uc1;

	import java.util.logging.Level;
	import java.util.logging.Logger;

	public class EmployeeChild extends Employee {

		public static final Logger logger=Logger.getLogger("employeeWage");
		
		//check employee attendance
		protected void EmployeeAttendance() {
			if(randomNumber==1) {
				logger.log(Level.INFO,"Employee present");	
			}else {
				logger.log(Level.INFO,"Employee absent");
			}
		}
	}