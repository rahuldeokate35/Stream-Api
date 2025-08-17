package Day1;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateAllEmpAverage {

	public static void main(String[] args) 
	{
		
		
		// 5. Calculate Average Salary:
		// - Calculate the average salary of all employees.
		
		EmployeeAdder emp = new EmployeeAdder();
	   OptionalDouble sum=emp.addDetails().stream().mapToDouble(s->s.getSalary()).reduce((a,b)->a+b);
	   System.out.println(sum.orElse(0.0));
	   
	   double s=0;
	   for(int i=0;i<emp.addDetails().size();i++)
	   {
		   s=s+emp.addDetails().get(i).getSalary();
	   }
		System.out.println(s);
		System.out.println(emp.addDetails().size());
	}

}
