
public class EmployeeWageComputation {
	public static void main(String[] arg) {
		checkEmpPresentorAbsent();
	   }
		static void checkEmpPresentorAbsent() {
			int present =1;
			 int empcheck =(int) Math.floor(Math.random()*10)%2;
			if(empcheck==present) {
				System.out.println("Employee is present");
			}
			else {
				System.out.println("Employee is absent");
			}
		}

	}