
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		checkEmpPresentorAbsent();

	}

	static void checkEmpPresentorAbsent() {
		int present = 1;
		int present1 = 1;
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int empcheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empcheck == present1) {
			System.out.println("Employee is present");
			int dailyWage = empWagePerHour * fullDayHour;
			System.out.println("Daily wage of employee is " + dailyWage);
		} else {
			System.out.println("Employee is absent");
			System.out.println("As employee is absent so his daily wage is 0");
		}
	}
}
