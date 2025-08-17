package Day2;

import Day1.EmployeeAdder;

public class FindNamesStartsWithE {

	public static void main(String[] args) 
	{
		// 17. Find Employees with Names Starting with "J":
		// - Find all employees whose names start with the letter "E."

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().filter(s->s.getName().startsWith("E")).forEach(System.out::println);
		
		

	}

}
