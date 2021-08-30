
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		checkEmpPresentorAbsentWage();
	}
		
		static void checkEmpPresentorAbsentWage() {
			 int empWagePerHour=20;
				int fullDayHour=8;
				int halfDayHour=4;
				int workingDaysPerMonth=20;
			 int empcheck =(int) Math.floor(Math.random()*10)%3;
			switch(empcheck) {
			case 1: int dailyWage=empWagePerHour*fullDayHour*workingDaysPerMonth;
				    System.out.println(" Monthly wage of employee in full time is "+dailyWage);
			break;
			case 2: int PartTimeWage=empWagePerHour*halfDayHour*workingDaysPerMonth;
				System.out.println("Monthly wage of employee in part time is "+PartTimeWage);
			break;
			default:System.out.println("As employee is absent so his monthly wage is 0");
			}
		}
}