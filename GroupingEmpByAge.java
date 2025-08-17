package Day2;

import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class GroupingEmpByAge {

	public static void main(String[] args) 
	{
		
		// 23. Group Employees by Age Range:
		// - Group employees into custom
		// age ranges (e.g., 20-29, 30-39, etc.) and
		// return a map with the age range as the key and a list of employees as  the value.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().collect(Collectors.groupingBy((s)->{
			int age=s.getAge();
			if(age>=20 && age<30)
			{
				return "20-29";
			}
			else if(age>=30 && age<40)
			{
				return "30-39";
			}
			else
			{
				return "40+";
			}
		})).forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
