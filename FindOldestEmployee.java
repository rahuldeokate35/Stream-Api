package Day2;

import java.util.Optional;
import java.util.OptionalInt;

import Day1.Employee;
import Day1.EmployeeAdder;

public class FindOldestEmployee {

	public static void main(String[] args) 
	{
		
		// 13. Find Oldest Employee:
		// - Find the oldest employee.

		EmployeeAdder emp = new EmployeeAdder();
		Optional<Employee> max =emp.addDetails().stream().sorted((s2,s1)->Integer.compare(s1.getAge(), s2.getAge())).findFirst();
		System.out.println(max);
		
		Employee m= emp.addDetails().stream().max((m1,m2)->m2.getAge()-m1.getAge()).get();
        System.out.println(m);
	}

}
