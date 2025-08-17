package Day2;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import Day1.Employee;
import Day1.EmployeeAdder;

public class Find3rdLowestPaidEmp {

	public static void main(String[] args) 
	{
		// 21. Find the Three Lowest-Paid Employees:
		// - Find and display the names of the three employees with the lowest  salaries.

		
		
		EmployeeAdder emp = new EmployeeAdder();
		Optional<Employee> s=emp.addDetails().stream().sorted(Comparator.comparingDouble(Employee::getSalary)).distinct().skip(2).findFirst();
		s.ifPresent(p->System.out.println(p));

	}

}
