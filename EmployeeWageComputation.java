
public class EmployeeWageComputation {
	public static void main(String[] arg) {

		MonthlySalary();

	}

	static void MonthlySalary() {
		int empWagePerHour = 20;
		int empHrs = 8;
		int WorkingDays = 1;
		int MonthlySalary = 0;
		while (WorkingDays < 21) {
			MonthlySalary = empWagePerHour * empHrs * WorkingDays;
			MonthlySalary += MonthlySalary;
			WorkingDays++;
		}
		System.out.println("Monthly salary of employee if present: " + MonthlySalary);
	}

}