package Day1;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupOfEmployee {

	public static void main(String[] args) 
	{
		
		// 7.Group Employees by Gender:
		// - Group employees by gender and return
		// a map with gender as the key and a list of employees as the value.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream()
		.collect(Collectors.groupingBy(Employee::getGender)).forEach((k,v)->System.out.println(k+" "+v));
		
		emp.addDetails().stream()
		.collect(Collectors.groupingBy(e->e.getGender())).forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
