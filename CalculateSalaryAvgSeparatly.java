package Day2;

import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class CalculateSalaryAvgSeparatly {

	public static void main(String[] args) 
	{
		// 18. Calculate the Average Salary for Male and Female Employees:
		// - Calculate the average salary separately for male
		// and female employees and return a map with gender
		// as the key and the average salary as the value.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().collect(Collectors.groupingBy(f->{
			String gen =f.getGender();
			if(gen.equals("Male"))
			{
				return f.getGender();
			}
			else
			{
			return f.getGender();
			}
		},Collectors.averagingDouble(s->s.getSalary()))).forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
