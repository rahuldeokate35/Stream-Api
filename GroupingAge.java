package Day2;

import java.util.stream.*;

import Day1.EmployeeAdder;

public class GroupingAge {

	public static void main(String[] args) 
	{
		
		// 14. Group Employees by Age:
		// - Group employees into age groups (e.g., 20-30, 31-40, etc.
		
		EmployeeAdder emp = new EmployeeAdder();
			
				emp.addDetails().stream().collect(Collectors.groupingBy((t) ->
				{int age = t.getAge();
				if(age>=20 && age<=30)
				return "20-30";
				else if (age>=31 && age<=40)
				return "31-40";
				else
				return "40+";
				})).forEach((key,value)->System.out.println(key+" "+ value));

	}

}
