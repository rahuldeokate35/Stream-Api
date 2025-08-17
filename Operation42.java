/*
 * //  42. Retrieve Employees with Unique Names: 
//      - Find employees with unique names (no duplicate names in the list). 
  System.out.println(RED+"*******Find employees with unique names (no duplicate 
names in the list).****"+RESET); 
 */

package Day3;

import java.util.stream.Collectors;

import Day1.*;

public class Operation42 {

	public static void main(String[] args) {
		

		EmployeeAdder emp  = new EmployeeAdder();
		emp.addDetails().stream().filter(k->k.getName()!= k.getName()).forEach((k)->System.out.println(k));
	} 

}
