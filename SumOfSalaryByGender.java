package Day1;

import java.util.stream.Collectors;

public class SumOfSalaryByGender {

	public static void main(String[] args) 
	{
		// 16. Calculate the Sum of Salaries by Gender:
		// - Calculate the sum of salaries for each gender (i.e., male and female)
		// and return a map with gender as the key and the sum of salaries as the value.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().collect(Collectors.groupingBy(t->{
			String gen=t.getGender();
			if(gen.equals("Male"))
			{
				return t.getGender();
			}
			else
			{
				return t.getGender();
			}
			
		},Collectors.summingDouble(Employee::getSalary))).forEach((k,v)->System.out.println(k+"  "+v));
		

	}

}
