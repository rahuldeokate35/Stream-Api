package Day2;

import Day1.EmployeeAdder;

public class SortingByNameLength {

	public static void main(String[] args) 
	{
		// 22. Sort Employees by Name Length:
		// - Sort employees by the length of their names (shortest to longest).

		
		EmployeeAdder emp= new EmployeeAdder();
		emp.addDetails().stream()
		.sorted((s1,s2)->Integer.compare(s1.getName().length(), s2.getName().length())).forEach(System.out::println);

	}

}
