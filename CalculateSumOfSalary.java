package Day1;

import java.util.OptionalDouble;

public class CalculateSumOfSalary {

	public static void main(String[] args) 
	{
		
		
		     // 9. Sum of All Salaries:
			// - Calculate the total sum of salaries for all employees.
           
		EmployeeAdder emp = new EmployeeAdder();
		OptionalDouble sum =emp.addDetails().stream().mapToDouble(s->s.getSalary()).reduce((a,b)->a+b);
		System.out.println("Total Employee Salary is :"+sum);

	}

}
