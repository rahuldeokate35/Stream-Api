package Day1;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class FindHighestSalary {

	public static void main(String[] args) 
	{
		
		// 6. Find Maximum Salary:
		// - Find the employee with the highest salary.

		EmployeeAdder emp = new EmployeeAdder();
		Optional<Employee> max =emp.addDetails().stream().sorted((e2,e1)->Double.compare(e1.getSalary(),e2.getSalary())).findFirst();
		
           System.out.println(max.get());
	}

}
