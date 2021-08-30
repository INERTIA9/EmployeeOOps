
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		checkEmpPresentorAbsentWage();
	}
		
		static void checkEmpPresentorAbsentWage() {
			 int empWagePerHour=20;
				int fullDayHour=8;
				int halfDayHour=4;
			 int empcheck =(int) Math.floor(Math.random()*10)%3;
			switch(empcheck) {
			case 1: int dailyWage=empWagePerHour*fullDayHour;
				    System.out.println("Daily wage of employee in full time is "+dailyWage);
			break;
			case 2: int PartTimeWage=empWagePerHour*halfDayHour;
				System.out.println("Daily wage of employee in part time is "+PartTimeWage);
			
			default:System.out.println("As employee is absent so his daily wage is 0");
			}
		}
}