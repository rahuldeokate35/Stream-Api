/*
 * //  30. Find the Sum of Salaries for Employees with Names Containing "Smith": 
//      - Calculate the sum of salaries for employees whose names contain the 
substring "Smith." 
  System.out.println(RED+"******* Calculate the sum of salaries for employees 
whose names contain the substring Smith***"+RESET); 
  double sum2 = 
list.stream().filter(k->k.getName().contains("Smith")).mapToDouble(k->k.getSalary()).sum(); 
  System.out.println(sum2); 
 

 */




package Day3;
import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class SumOsalByNameSmith {

	public static void main(String[] args) 
	{
		EmployeeAdder emp= new EmployeeAdder();
		emp.addDetails().stream().collect(Collectors.groupingBy(s->{
			if(s.getName().equals("Smith"))
			{
			return s.getName();
			}
			else
			{
				return "null";
			}
		})).forEach((k,v)->System.out.println(k!="null"?k+"  "+v:" "));
		
		System.out.println("------------------------------");
		double tot= emp.addDetails().stream().filter(k->k.getName().equals("Smith")).mapToDouble(t->t.getSalary()).sum();
		System.out.println(tot);

	}

}
