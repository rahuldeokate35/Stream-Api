/*
 * //  41. Find the Employee with the Highest Salary in Each Gender: 
//      - Find the employee with the highest salary for each gender (male and 
female). 
 */
package Day3;

import java.util.stream.Collectors;

import Day1.*;

public class Operation41 {

	public static void main(String[] args) {
		

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream()
		.collect(Collectors.toMap(Employee::getGender,
				k->k,(e1,e2)->e1.getSalary()>=e2.getSalary()?e1:e2))
		.forEach((k,v)->System.out.println(k+"-"+v));
	}

}
