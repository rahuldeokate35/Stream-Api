
/*
 * //  33. Find the Most Common Age Among Employees: 
//      - Determine the age that is most common among the employees. 

 */

package Day3;

import java.util.Map;
import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class MostCommanAge {

	public static void main(String[] args) 
	{
		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().sorted((s1,s2)->Integer.compare(s1.getAge(),s2.getAge()));
		
		Integer orElseThrow3 = emp.addDetails().collect(Collectors
				.groupingBy(,Collectors.counting())).entrySet().stream() 
				  .max(Map.Entry.comparingByValue())  
				  .map(Map.Entry::getKey) 
				  .orElseThrow(); 
				  System.out.println(orElseThrow3);

	}

}
