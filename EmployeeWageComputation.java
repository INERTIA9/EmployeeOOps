
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		 EmployeeWage();
	   }
		static void EmployeeWage() {
			 int empWagePerHour=20;
				int fullDayHour=8;
				int halfDayHour=4;
				int is_full_time=1;
				int is_part_time=2;
			 int empcheck =(int) Math.floor(Math.random()*10)%3;
			if(empcheck==is_full_time) {
				System.out.println("Employee is present");
				int dailyWage=empWagePerHour*fullDayHour;
				System.out.println("Daily wage of employee in full time is "+dailyWage);
			}
			else if(empcheck==is_part_time){
				int PartTimeWage=empWagePerHour*halfDayHour;
				System.out.println("Daily wage of employee in part time is "+PartTimeWage);
			}else {
				System.out.println("Employee is absent");
				System.out.println("As employee is absent so his daily wage is 0");
			}
		}

	}

	