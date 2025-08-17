package Day2;


import java.util.Comparator;

import Day1.EmployeeAdder;

public class SortSalaryDecendingOrder {

	public static void main(String[] args) 
	{
		
		// 12. Sort Employees by Salary:
		// - Sort the employees by salary in descending order.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().sorted((s1,s2)->Double.compare(s2.getSalary(),s1.getSalary())).forEach(System.out::println);;
		

	}

}
