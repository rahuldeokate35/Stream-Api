/*
 * //  40. Find the Two Highest Paid Female Employees: 
//      - Find and display the names of the two highest-paid female employees. 
  
 */

package Day3;
import java.util.Comparator;
import java.util.Optional;

import Day1.*;
public class Operation40 {

	public static void main(String[] args) 
	{
		EmployeeAdder emp = new EmployeeAdder();
//		Optional<Employee> first = emp.addDetails().stream()
//		.sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).filter(e1->e1.getGender()=="Female").findFirst();
//		
//		System.out.println(first.toString());
		emp.addDetails().stream().filter(k->k.getGender().equals("Female"))
		.sorted(Comparator.comparingDouble(Employee::getAge)
				.reversed()).limit(2).forEach(System.out::println);

	}

}
