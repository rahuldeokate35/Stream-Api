package Day3;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import Day1.Employee;
import Day1.EmployeeAdder;

public class FindMedianSalary {

	public static void main(String[] args) 
	{
		EmployeeAdder emp = new EmployeeAdder();
//	    emp.addDetails().stream().map(s1->
//	    {
//	    	double d=s1.getSalary()/2;
//	    	return d;
//	    }).forEach((k)->System.out.println(k));
//		

		@SuppressWarnings("unchecked")
		ToDoubleFunction<Employee> sal = (ToDoubleFunction<Employee>) emp.addDetails().stream().map(s1->
		{
			double sall =s1.getSalary();
			return s1.getSalary();
		});
		double m=emp.addDetails().stream().count();
		System.out.println("Median is :"+sal);
	}

}
