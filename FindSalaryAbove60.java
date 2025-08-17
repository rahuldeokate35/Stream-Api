package Day2;

import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class FindSalaryAbove60 {

	public static void main(String[] args) 
	{
		// 25. Find the Names of Male Employees with Salaries Over $60,000:
		// - Retrieve the names of male employees with salaries over $60,000.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().collect(Collectors.groupingBy(s->{
			String gen=s.getGender();
			double sal=s.getSalary();
			if(gen.equals("Male") && sal>=60000)
			{
				return s.getName();
			}
			else
			{
				return "null";
			}
			
		})).forEach((k,v)->System.out.println(k!="null" ?k+" "+v:" "));
		

	}

}
