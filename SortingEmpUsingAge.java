package Day2;

import Day1.EmployeeAdder;

public class SortingEmpUsingAge {

	public static void main(String[] args) 
	{
		
		    //  11. Sort Employees by Age:
			// - Sort the employees by age in ascending order.
			
		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().sorted((s1,s2)-> Double.compare(s1.getAge(), s2.getAge())).forEach(System.out::println);

	}

}
