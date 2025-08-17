package Day2;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.*;

import Day1.Employee;
import Day1.EmployeeAdder;

public class FindAge35Only {

	public static void main(String[] args) 
	{
		// 15. Find Employees with a Specific Age:
		// - Find all employees who are exactly 35 years old.

		EmployeeAdder emp = new EmployeeAdder();
		
		emp.addDetails().stream().filter(s->s.getAge()==35).forEach(System.out::println);
		System.out.println("--------------------------------------");
		
		//error
		emp.addDetails().stream().collect(Collectors.groupingBy(f->{
			int a=f.getAge();
			if(a==35)
			{
			return f.getAge();
			}
			else
			{
				return 0;
			}
		})).forEach((k,v)->System.out.println((k!=0 ? k +" "+v:" ")));
		
		
		
	}

}
