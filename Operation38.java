/*
 * //  38. Sort Employees by Age, Then by Salary: 
//      - Sort employees first by age in ascending order, and then by salary in 
descending order. 
 */


package Day1;


import java.util.Comparator;

import Day1.*;
public class Operation38 {

	public static void main(String[] args) 
	{
		EmployeeAdder emp = new EmployeeAdder();
//		emp.addDetails().stream()
//		.sorted((e1,e2)->Integer.compare(e1.getAge(), e2.getAge()));
//		
		emp.addDetails().stream().sorted(Comparator.comparingInt(Employee::getAge)
			    
				.thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed())) 
				  .forEach(System.out::println);
		
		

	}

}
