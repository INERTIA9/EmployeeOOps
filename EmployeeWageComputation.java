
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		CompanyA a = new CompanyA();
		a.EmployeeWage1();
		CompanyB b = new CompanyB();
		b.EmployeeWage();
		CompanyC c = new CompanyC();
		c.EmployeeWage();
	}
}
	class CompanyA {
		void EmployeeWage1() {
			int empWagePerHour = 40;
			int WorkingHoursPerDay = 7;
			int WoringDaysInMonth = 25;
			int MonthlySalary = empWagePerHour * WorkingHoursPerDay * WoringDaysInMonth;
			System.out.println("Monthly salary of employee of comapany A is " + MonthlySalary);

		}
	}

	class CompanyB {
		void EmployeeWage() {
			int empWagePerHour = 10;
			int WorkingHoursPerDay = 6;
			int WoringDaysInMonth = 27;
			int MonthlySalary = empWagePerHour * WorkingHoursPerDay * WoringDaysInMonth;
			System.out.println("Monthly salary of employee of comapany B is " + MonthlySalary);

		}

	}

	class CompanyC {
		void EmployeeWage() {
			int empWagePerHour = 30;
			int WorkingHoursPerDay = 8;
			int WoringDaysInMonth = 30;
			int MonthlySalary = empWagePerHour * WorkingHoursPerDay * WoringDaysInMonth;
			System.out.println("Monthly salary of employee of comapany C is " + MonthlySalary);

		}
	}

