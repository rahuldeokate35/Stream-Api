package Day2;

import java.util.Optional;
import java.util.stream.Stream;

import Day1.Employee;
import Day1.EmployeeAdder;

public class NthSalaryPaidEmployee {

	public static void main(String[] args) 
	{

		// 19. Find the Top N Highest Paid Employees:
		// - Find the top N employees with the highest salaries.

		EmployeeAdder emp = new EmployeeAdder();
		Optional<Employee>sum=emp.addDetails().stream().sorted((s1,s2)->Double.compare(s2.getSalary(), s1.getSalary())).limit(3).findFirst();
        System.out.println(sum);
	}

}
